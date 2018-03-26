package com.erikstackelberg.cocktailhour.fragments;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.activities.IngredientDetailActivity;
import com.erikstackelberg.cocktailhour.adapters.IngredientListAdapter;
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
        RealmResults<Ingredient> ingredients = realm.where(Ingredient.class).findAllSorted("name");

        RecyclerView recyclerView = view.findViewById(R.id.ingredient_recycler_view);

        IngredientListAdapter ingredientListAdapter = new IngredientListAdapter(ingredients, true,
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

        return view;
    }

    @Override
    public void onDestroy() {
        realm.close();
        super.onDestroy();
    }
}
