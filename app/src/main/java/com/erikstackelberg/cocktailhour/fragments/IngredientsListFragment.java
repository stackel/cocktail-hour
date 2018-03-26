package com.erikstackelberg.cocktailhour.fragments;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.activities.IngredientDetailActivity;
import com.erikstackelberg.cocktailhour.adapters.IngredientListAdapter;
import com.erikstackelberg.cocktailhour.enums.Filter;
import com.erikstackelberg.cocktailhour.enums.IngredientType;
import com.erikstackelberg.cocktailhour.models.Drink;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import io.realm.Realm;
import io.realm.RealmResults;

public class IngredientsListFragment extends Fragment {
    Realm realm;
    public IngredientsListFragment() {
    }

    public static IngredientsListFragment newInstance() {
        return new IngredientsListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ingredients_list, container, false);

        realm = Realm.getDefaultInstance();

        RecyclerView recyclerView = view.findViewById(R.id.ingredient_recycler_view);

        final IngredientListAdapter ingredientListAdapter = new IngredientListAdapter(getIngredients(IngredientType.ALL), true,
                new IngredientListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Ingredient item) {
                Intent intent = new Intent(getContext(), IngredientDetailActivity.class);
                intent.putExtra("INGREDIENT_ID", item.getId());
                startActivity(intent);
            }
        });

        recyclerView.setAdapter(ingredientListAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        Spinner ingredientFilterSpinner = view.findViewById(R.id.ingredient_list_filter_spinner);

        final ArrayAdapter<IngredientType> filterSpinnerAdapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1, IngredientType.values());

        ingredientFilterSpinner.setAdapter(filterSpinnerAdapter);
        ingredientFilterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ingredientListAdapter.updateData(getIngredients(filterSpinnerAdapter.getItem(i)));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        return view;
    }

    private RealmResults<Ingredient> getIngredients(IngredientType ingredientType) {
        if(realm != null) {
            realm.close();
        }
        realm = Realm.getDefaultInstance();

        RealmResults<Ingredient> ingredients;
        if(ingredientType == IngredientType.ALL) {
            ingredients = realm.where(Ingredient.class).findAllSorted("name");
        } else {
            ingredients = realm.where(Ingredient.class)
                    .equalTo("ingredientType", ingredientType.name()).findAllSorted("name");
        }

        return ingredients;
    }


    @Override
    public void onDestroy() {
        realm.close();
        super.onDestroy();
    }
}
