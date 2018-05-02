package com.erikstackelberg.cocktailhour.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.widget.SearchView;

import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.adapters.DrinkListAdapter;
import com.erikstackelberg.cocktailhour.models.Drink;

import io.realm.Case;
import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

public class SearchActivity extends AppCompatActivity {
    Realm realm;

    DrinkListAdapter drinkListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }

        RecyclerView searchResultsList = (RecyclerView) findViewById(R.id.search_results_list);
        drinkListAdapter = new DrinkListAdapter(null, true, new DrinkListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Drink item) {
                Intent intent = new Intent(getBaseContext(), DrinkDetailActivity.class);
                intent.putExtra("DRINK_ID", item.getId());
                startActivity(intent);

            }
        });
        realm = Realm.getDefaultInstance();
        searchResultsList.setAdapter(drinkListAdapter);
        RealmResults<Drink> drinks = realm.where(Drink.class).findAllSorted("name");
        drinkListAdapter.updateData(drinks);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
        searchResultsList.setLayoutManager(layoutManager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);

        final SearchView menuItem = (SearchView) menu.findItem(R.id.action_search).getActionView();

        menuItem.setIconified(false);

        menuItem.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.d("", newText);

                realm = Realm.getDefaultInstance();

                RealmResults<Drink> drinks = realm.where(Drink.class).contains("name", newText, Case.INSENSITIVE).findAll();

                Log.d("", drinks.toString());
                drinkListAdapter.updateData(drinks);

                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onDestroy() {
        if(realm != null){
            realm.close();
        }
        super.onDestroy();
    }
}
