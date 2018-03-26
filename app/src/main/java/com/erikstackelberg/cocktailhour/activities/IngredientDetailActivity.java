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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String ingredientId = getIntent().getStringExtra("INGREDIENT_ID");

        ViewDataBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_ingredient_detail);

        realm = Realm.getDefaultInstance();
        Ingredient ingredient = realm.where(Ingredient.class).equalTo("id", ingredientId).findFirst();

        if(ingredient == null)  {
            finish();
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

            }
        });

        relatedDrinksRecyclerView.setAdapter(relatedDrinkListAdapter);
        relatedDrinksRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        binding.setVariable(BR.ingredient, ingredient);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(ingredient.getName());
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button editIngredientButton = (Button) findViewById(R.id.ingredient_detail_edit_button);
        Button deleteIngredientButton = (Button) findViewById(R.id.ingredient_detail_delete_button);

        editIngredientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), NewIngredientActivity.class);
                intent.putExtra("INGREDIENT_ID", ingredientId);
                startActivity(intent);
            }
        });

        deleteIngredientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    realm = Realm.getDefaultInstance();
                    realm.executeTransaction(new Realm.Transaction() {
                        @Override
                        public void execute(@NonNull Realm realm) {
                            RealmResults<Ingredient> result =
                                    realm.where(Ingredient.class).equalTo("id", ingredientId).findAll();
                            result.deleteAllFromRealm();
                        }
                    });
                } finally {
                    if(realm != null) {
                        realm.close();
                    }
                    finish();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        if(realm != null){
            realm.close();
        }
        super.onDestroy();
    }
}
