package com.erikstackelberg.cocktailhour.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.adapters.DrinkIngredientAddListAdapter;
import com.erikstackelberg.cocktailhour.enums.Unit;
import com.erikstackelberg.cocktailhour.models.Drink;
import com.erikstackelberg.cocktailhour.models.DrinkIngredient;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;

public class NewDrinkActivity extends AppCompatActivity {
    private DrinkIngredientAddListAdapter drinkIngredientAddListAdapter;

    private EditText nameEditText;
    private EditText descriptionEditText;
    private EditText instructionsEditText;
    private EditText tastingNotesEditText;
    private EditText variationsEditText;


    private Drink drink;

    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_drink);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

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
        descriptionEditText = (EditText) findViewById(R.id.new_drink_description_input);
        instructionsEditText = (EditText) findViewById(R.id.new_drink_instructions_input);
        variationsEditText = (EditText) findViewById(R.id.new_drink_variations_input);
        tastingNotesEditText = (EditText) findViewById(R.id.new_drink_tasting_notes_input);

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
                descriptionEditText.setText(drink.getDescription());
                tastingNotesEditText.setText(drink.getTastingNotes());
                instructionsEditText.setText(drink.getInstructions());
                variationsEditText.setText(drink.getVariations());
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
                    drink.setInstructions(instructionsEditText.getText().toString());
                    drink.setDescription(descriptionEditText.getText().toString());
                    drink.setTastingNotes(tastingNotesEditText.getText().toString());
                    drink.setVariations(variationsEditText.getText().toString());
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