package com.erikstackelberg.cocktailhour.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.activities.DrinkDetailActivity;
import com.erikstackelberg.cocktailhour.adapters.DrinkListAdapter;
import com.erikstackelberg.cocktailhour.enums.Filter;
import com.erikstackelberg.cocktailhour.enums.IngredientType;
import com.erikstackelberg.cocktailhour.models.Drink;

import io.realm.Realm;
import io.realm.RealmResults;

public class DrinkListFragment extends Fragment {
    Realm realm;

    public DrinkListFragment() {
    }

    public static DrinkListFragment newInstance() {
        return new DrinkListFragment();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_drink_list, container, false);


        RecyclerView recyclerView = view.findViewById(R.id.drink_recycler_view);

        final DrinkListAdapter drinksAdapter = new DrinkListAdapter(getDrinks(Filter.FAVOURITE), true, new DrinkListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Drink item) {
                Intent intent = new Intent(getActivity(), DrinkDetailActivity.class);
                intent.putExtra("DRINK_ID", item.getId());
                getActivity().startActivity(intent);
            }
        });

        recyclerView.setAdapter(drinksAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        final Spinner filterSpinner = view.findViewById(R.id.drink_list_filter_spinner);
        final ArrayAdapter<Filter> filterSpinnerAdapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1, Filter.values());
        filterSpinner.setAdapter(filterSpinnerAdapter);

        filterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                drinksAdapter.updateData(getDrinks(filterSpinnerAdapter.getItem(i)));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return view;
    }

    private RealmResults<Drink> getDrinks(Filter filter) {
        if(realm != null) {
            realm.close();
        }
        realm = Realm.getDefaultInstance();
        RealmResults<Drink> drinks;

        switch (filter) {
            case ALL:
                drinks = realm.where(Drink.class).findAllSorted("name");
                break;
            case FAVOURITE:
                drinks = realm.where(Drink.class).equalTo("favourite", true).findAllSorted("name");
                break;
            case TRIED:
                drinks = realm.where(Drink.class).equalTo("hasTried", true).findAllSorted("name");
                break;
            case NOT_TRIED:
                drinks = realm.where(Drink.class).equalTo("hasTried", false).findAllSorted("name");
                break;
            default:
                drinks = realm.where(Drink.class).findAllSorted("name");
        }
        return drinks;
    }

    @Override
    public void onDestroy() {
        realm.close();
        super.onDestroy();
    }
}
