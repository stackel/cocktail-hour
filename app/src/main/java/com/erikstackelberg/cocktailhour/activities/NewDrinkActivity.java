package com.erikstackelberg.cocktailhour.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.adapters.DrinkIngredientAddListAdapter;
import com.erikstackelberg.cocktailhour.adapters.DrinkIngredientListAdapter;
import com.erikstackelberg.cocktailhour.enums.IngredientType;
import com.erikstackelberg.cocktailhour.enums.Unit;
import com.erikstackelberg.cocktailhour.models.Drink;
import com.erikstackelberg.cocktailhour.models.DrinkIngredient;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import java.lang.reflect.Array;
import java.util.ArrayList;

import io.realm.OrderedRealmCollection;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;

public class NewDrinkActivity extends AppCompatActivity {
    private DrinkIngredientAddListAdapter drinkIngredientAddListAdapter;

    private EditText nameEditText;
    private EditText descriptionEditText;

    private Drink drink;

    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_drink);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<DrinkIngredient> drinkIngredients = new ArrayList<>();
        drinkIngredients.add(new DrinkIngredient());

        RealmResults<Ingredient> ingredients;
        try {
            realm = Realm.getDefaultInstance();
            ingredients = realm.where(Ingredient.class).findAll();

        } finally {
            if(realm != null) {
                realm.close();
            }
        }
        if(ingredients == null) {
            finish();
        }
        ArrayList<Ingredient> ingredientsCopied = (ArrayList<Ingredient>)
                realm.copyFromRealm(ingredients);

        drinkIngredientAddListAdapter =
                new DrinkIngredientAddListAdapter(drinkIngredients, new ArrayAdapter<>(this,
                        android.R.layout.simple_dropdown_item_1line, ingredientsCopied),
                        new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                                Unit.values()));

        RecyclerView drinkIngredientAddRecyclerView =
                (RecyclerView) findViewById(R.id.new_drink_ingredients_recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
        drinkIngredientAddRecyclerView.setLayoutManager(layoutManager);
        drinkIngredientAddRecyclerView.setAdapter(drinkIngredientAddListAdapter);
        drinkIngredientAddRecyclerView.setNestedScrollingEnabled(false);

        Button addDrinkIngredientButton = (Button) findViewById(R.id.new_drink_add_ingredient_button);
        addDrinkIngredientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drinkIngredientAddListAdapter.addDrinkIngredient(new DrinkIngredient());
            }
        });

        nameEditText = (EditText) findViewById(R.id.new_drink_name_input);
        descriptionEditText = (EditText) findViewById(R.id.new_drink_instructions_input);

        final String drinkId = getIntent().getStringExtra("DRINK_ID");

        if(drinkId != null) {
            try {
                realm = Realm.getDefaultInstance();
                drink = realm.where(Drink.class).equalTo("id", drinkId).findFirst();
            } finally {
                if(realm != null) {
                    realm.close();
                }
            }
            if(drink != null) {
                nameEditText.setText(drink.getName());
                descriptionEditText.setText(drink.getInstructions());
                ArrayList<DrinkIngredient> drinkIngredientsFromDatabase =
                        (ArrayList<DrinkIngredient>) realm.copyFromRealm(drink.getDrinkIngredients());
                drinkIngredientAddListAdapter.setDrinkIngredients(drinkIngredientsFromDatabase);
            }
        }
        Button saveDrinkButton = (Button) findViewById(R.id.new_drink_save);
        saveDrinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(drink == null) {
                    drink = new Drink();
                }
                saveDrink(drink);
            }
        });
    }

    private void saveDrink(final Drink drink) {
        try {
            realm = Realm.getDefaultInstance();
            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(@NonNull Realm realm) {
                    RealmList<DrinkIngredient> drinkIngredients = new RealmList<>();

                    for(DrinkIngredient drinkIngredient: drinkIngredientAddListAdapter.getAllItems()) {
                        drinkIngredients.add(realm.copyToRealmOrUpdate(drinkIngredient));
                    }

                    drink.setName(nameEditText.getText().toString());
                    drink.setInstructions(descriptionEditText.getText().toString());
                    drink.setDrinkIngredients(drinkIngredients);
                    realm.copyToRealmOrUpdate(drink);
                }
            });
        } finally {
            if(realm != null) {
                realm.close();
                finish();
            }
        }
    }

    @Override
    protected void onDestroy() {
        if(realm != null) {
            realm.close();
        }
        super.onDestroy();
    }
}