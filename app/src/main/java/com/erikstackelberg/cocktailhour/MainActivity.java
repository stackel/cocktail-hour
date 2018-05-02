package com.erikstackelberg.cocktailhour;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.erikstackelberg.cocktailhour.activities.NewDrinkActivity;
import com.erikstackelberg.cocktailhour.activities.NewIngredientActivity;
import com.erikstackelberg.cocktailhour.activities.SearchActivity;
import com.erikstackelberg.cocktailhour.data.DrinkFactory;
import com.erikstackelberg.cocktailhour.fragments.DrinkListFragment;
import com.erikstackelberg.cocktailhour.fragments.IngredientsListFragment;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "MainActivity";
    private ViewPager mViewPager;

    RealmConfiguration realmConfiguration;
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRealm();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SectionsPagerAdapter mSectionsPagerAdapter =
                new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.main_add_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mViewPager.getCurrentItem() == 0) {
                    Intent intent = new Intent(getBaseContext(), NewDrinkActivity.class);
                    startActivity(intent);
                } else if (mViewPager.getCurrentItem() == 1) {
                    Intent intent = new Intent(getBaseContext(), NewIngredientActivity.class);
                    startActivity(intent);
                } else {
                    Log.d(LOG_TAG, "FAB behaviour in this tab is not defined.");
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_open_search) {
            Intent intent = new Intent(this, SearchActivity.class);
            startActivity(intent);
            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_insert_basic_cocktails) {
            DrinkFactory dataFactory = new DrinkFactory();
            dataFactory.insertBasicData();
            return true;
        }

        if (id == R.id.action_insert_my_data) {
            DrinkFactory dataFactory = new DrinkFactory();
            dataFactory.insertMyData();
            return true;
        }

        if (id == R.id.action_delete_all_data) {
            if(realm == null) {
                realm = Realm.getDefaultInstance();
            }
            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(@NonNull Realm realm) {
                    realm.deleteAll();
                }
            });
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public static class PlaceholderFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return DrinkListFragment.newInstance();
            }
            ;
            if (position == 1) {
                return IngredientsListFragment.newInstance();
            }
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Drinks";
                case 1:
                    return "Ingredients";
            }
            return null;
        }
    }

    private void initRealm() {
        Realm.init(getBaseContext());
        realmConfiguration = new RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }

}