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
import android.view.View;
import android.widget.Button;

import com.erikstackelberg.cocktailhour.BR;
import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.adapters.DrinkListAdapter;
import com.erikstackelberg.cocktailhour.models.Drink;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;

public class IngredientDetailActivity extends AppCompatActivity {
    Realm realm;
    Ingredient ingredient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String ingredientId = getIntent().getStringExtra("INGREDIENT_ID");

        realm = Realm.getDefaultInstance();
        ingredient = realm.where(Ingredient.class).equalTo("id", ingredientId).findFirst();

        if(ingredient == null)  {
            finish();
        }

        ViewDataBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_ingredient_detail);

        binding.setVariable(BR.ingredient, ingredient);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(ingredient.getName());
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        RealmResults<Drink> allDrinks = realm.where(Drink.class).
                equalTo("drinkIngredients.ingredient.id", ingredient.getId())
                .findAll();

        RecyclerView relatedDrinksRecyclerView =
                (RecyclerView) findViewById(R.id.ingredient_detail_related_drinks);

        DrinkListAdapter relatedDrinkListAdapter = new DrinkListAdapter(allDrinks, true,
                new DrinkListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Drink item) {
                Intent intent = new Intent(getBaseContext(), DrinkDetailActivity.class);
                intent.putExtra("DRINK_ID", item.getId());
                startActivity(intent);

            }
        });

        relatedDrinksRecyclerView.setAdapter(relatedDrinkListAdapter);
        relatedDrinksRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_ingredient_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_ingredient_detail_edit) {
            Intent intent = new Intent(getBaseContext(), NewIngredientActivity.class);
            intent.putExtra("INGREDIENT_ID", ingredient.getId());
            startActivity(intent);
            return true;
        }

        if (id == R.id.action_ingredient_detail_delete) {
            try {
                realm = Realm.getDefaultInstance();
                realm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(@NonNull Realm realm) {
                        RealmResults<Ingredient> result =
                                realm.where(Ingredient.class).equalTo("id", ingredient.getId()).findAll();
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
        if(realm != null){
            realm.close();
        }
        super.onDestroy();
    }
}
