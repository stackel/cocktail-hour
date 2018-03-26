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
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.erikstackelberg.cocktailhour.BR;
import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.adapters.DrinkIngredientListAdapter;
import com.erikstackelberg.cocktailhour.models.Drink;
import com.erikstackelberg.cocktailhour.models.DrinkIngredient;

import io.realm.Realm;
import io.realm.RealmList;
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

        if(drink == null) {
            finish();
        }

        ViewDataBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_drink_detail);
        binding.setVariable(BR.drink, drink);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(drink.getName());
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        RecyclerView recyclerView =
                (RecyclerView) findViewById(R.id.drink_detail_ingredient_recycler_view);
        DrinkIngredientListAdapter drinkIngredientListAdapter =
                new DrinkIngredientListAdapter(drink.getDrinkIngredients(), true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(drinkIngredientListAdapter);
        Button button = (Button) findViewById(R.id.drink_detail_delete_drink);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    realm = Realm.getDefaultInstance();
                    realm.executeTransaction(new Realm.Transaction() {
                        @Override
                        public void execute(@NonNull Realm realm) {
                            RealmResults<Drink> result =
                                    realm.where(Drink.class).equalTo("id", drinkId).findAll();
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

        Button editButton = (Button) findViewById(R.id.drink_detail_edit_button);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), NewDrinkActivity.class);
                intent.putExtra("DRINK_ID", drinkId);
                startActivity(intent);
            }
        });

        CheckBox favoriteCheckbox = (CheckBox) findViewById(R.id.drink_detail_favourite_checkbox);
        favoriteCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, final boolean b) {
                if(b != drink.isFavourite()){
                    realm = Realm.getDefaultInstance();
                    realm.executeTransaction(new Realm.Transaction() {
                        @Override
                        public void execute(@NonNull Realm realm) {
                            drink.setFavourite(b);
                            realm.copyToRealmOrUpdate(drink);
                        }
                    });
                }
            }
        });

        CheckBox triedCheckbox = (CheckBox) findViewById(R.id.drink_detail_tried_checkbox);
        triedCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, final boolean b) {
                if(b != drink.hasTried()){
                    realm = Realm.getDefaultInstance();
                    realm.executeTransaction(new Realm.Transaction() {
                        @Override
                        public void execute(@NonNull Realm realm) {
                            drink.setHasTried(b);
                            realm.copyToRealmOrUpdate(drink);
                        }
                    });
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        if(realm != null) {
            realm.close();
        }
        super.onDestroy();
    }
}
