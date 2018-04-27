package com.erikstackelberg.cocktailhour.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.erikstackelberg.cocktailhour.BR;
import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.adapters.DrinkIngredientListAdapter;
import com.erikstackelberg.cocktailhour.models.Drink;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import io.realm.Realm;
import io.realm.RealmResults;

public class DrinkDetailActivity extends AppCompatActivity {
    Realm realm;
    Drink drink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String drinkId = getIntent().getStringExtra("DRINK_ID");
        realm = Realm.getDefaultInstance();
        drink = realm.where(Drink.class).equalTo("id", drinkId).findFirst();

        if (drink == null) {
            finish();
        }

        ViewDataBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_drink_detail);
        binding.setVariable(BR.drink, drink);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(drink.getName());
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        RecyclerView recyclerView =
                (RecyclerView) findViewById(R.id.drink_detail_ingredient_recycler_view);
        DrinkIngredientListAdapter drinkIngredientListAdapter =
                new DrinkIngredientListAdapter(drink.getDrinkIngredients(), true, new DrinkIngredientListAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(Ingredient ingredient) {
                        Intent intent = new Intent(getBaseContext(), IngredientDetailActivity.class);
                        intent.putExtra("INGREDIENT_ID", ingredient.getId());
                        startActivity(intent);
                    }
                });

        LinearLayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(false);

        recyclerView.setAdapter(drinkIngredientListAdapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_drink_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_drink_detail_edit) {
            Intent intent = new Intent(getBaseContext(), NewDrinkActivity.class);
            intent.putExtra("DRINK_ID", drink.getId());
            startActivity(intent);
            return true;
        }

        if (id == R.id.action_drink_detail_delete) {
            try {
                realm = Realm.getDefaultInstance();
                realm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(@NonNull Realm realm) {
                        RealmResults<Drink> result =
                                realm.where(Drink.class).equalTo("id", drink.getId()).findAll();
                        result.deleteAllFromRealm();
                    }
                });
            } finally {
                if(realm != null) {
                    realm.close();
                }
                finish();
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        if(realm != null) {
            realm.close();
        }
        super.onDestroy();
    }
}
