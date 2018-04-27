package com.erikstackelberg.cocktailhour.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.enums.IngredientType;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import java.util.Arrays;

import io.realm.Realm;

public class NewIngredientActivity extends AppCompatActivity {
    private Spinner ingredientTypeSpinner;
    private EditText ingredientNameEditText;
    private EditText ingredientDescriptionEditText;

    private Ingredient ingredient;

    private ArrayAdapter<IngredientType> ingredientSpinnerAdapter;

    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_ingredient);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        final String ingredientId = getIntent().getStringExtra("INGREDIENT_ID");

        if(ingredientId != null) {
            try {
                realm = Realm.getDefaultInstance();
                ingredient = realm.where(Ingredient.class).equalTo("id", ingredientId).findFirst();
            } finally {
                if(realm != null) {
                    realm.close();
                }
            }
        }

        ingredientNameEditText = (EditText) findViewById(R.id.new_ingredient_name_input);
        ingredientDescriptionEditText = (EditText) findViewById(R.id.new_ingredient_description_input);

        ingredientTypeSpinner = (Spinner) findViewById(R.id.new_ingredient_type_spinner);
        ingredientSpinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                Arrays.copyOfRange(IngredientType.values(), 1, IngredientType.values().length));
        ingredientTypeSpinner.setAdapter(ingredientSpinnerAdapter);

        Button createIngredientButton = (Button) findViewById(R.id.new_ingredient_create_button);

        createIngredientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ingredient == null) {
                    ingredient = new Ingredient();
                }
                insertOrUpdateIngredient(ingredient);
            }
        });

        if(ingredient != null) {
            populateFields(ingredient);
            createIngredientButton.setText("UPDATE");
        }
    }

    private void populateFields(final Ingredient ingredient) {
        ingredientNameEditText.setText(ingredient.getName());
        ingredientDescriptionEditText.setText(ingredient.getDescription());
        int spinnerPosition = ingredientSpinnerAdapter.getPosition(ingredient.getIngredientType());
        ingredientTypeSpinner.setSelection(spinnerPosition);
    }

    private void insertOrUpdateIngredient(final Ingredient ingredient) {
        final IngredientType ingredientType = (IngredientType) ingredientTypeSpinner.getSelectedItem();
        final String ingredientName = ingredientNameEditText.getText().toString();
        final String ingredientDescription = ingredientDescriptionEditText.getText().toString();

        if(ingredientName.isEmpty()) {
            return;
        }

        try {
            realm = Realm.getDefaultInstance();

            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(@NonNull Realm realm) {
                    ingredient.setName(ingredientName);
                    ingredient.setDescription(ingredientDescription);
                    ingredient.setIngredientType(ingredientType);
                    realm.insertOrUpdate(ingredient);
                }
            });
        } finally {
            if(realm != null) {
                realm.close();
            }
            finish();
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
