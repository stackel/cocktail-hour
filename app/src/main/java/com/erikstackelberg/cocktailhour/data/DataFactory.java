package com.erikstackelberg.cocktailhour.data;

import android.support.annotation.NonNull;

import com.erikstackelberg.cocktailhour.enums.IngredientType;
import com.erikstackelberg.cocktailhour.enums.Unit;
import com.erikstackelberg.cocktailhour.models.Drink;
import com.erikstackelberg.cocktailhour.models.DrinkIngredient;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import io.realm.Realm;
import io.realm.RealmList;

public class DataFactory {
    private Realm realm;
    public DataFactory() {}

    public void insertData() {
        realm = Realm.getDefaultInstance();
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(@NonNull Realm realm) {
                //Ingredients
                Ingredient bourbon =
                        new Ingredient("Bourbon", "Corn based whisky.", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(bourbon);

                Ingredient angosturaBitters =
                        new Ingredient("Angostura Bitters", "Spicy bitters", IngredientType.BITTERS);
                realm.copyToRealmOrUpdate(angosturaBitters);

                Ingredient simpleSyrup =
                        new Ingredient("Simple Syrup", "1:1 Sugar to water.", IngredientType.SURYP);
                realm.copyToRealmOrUpdate(simpleSyrup);

                Ingredient mapleSyrup =
                        new Ingredient("Maple Syrup", "Syrup from the maple tree.", IngredientType.SURYP);
                realm.copyToRealmOrUpdate(mapleSyrup);

                Ingredient redVermouth =
                        new Ingredient("Red Vermouth", "Fortified wine.", IngredientType.FORTIFIED_WINE);

                Ingredient campari =
                        new Ingredient("Campari", "Bitter herbal liqueur.", IngredientType.BITTER);

                Ingredient orange =
                        new Ingredient("Orange", "Citrus.", IngredientType.CITRUS);

                Ingredient lemon =
                        new Ingredient("Lemon", "Citrus,", IngredientType.CITRUS);

                //Drinks
                Drink oldFashioned = new Drink();
                oldFashioned.setName("Old Fashioned");
                oldFashioned.setInstructions("Stir and strain over ice in old fashioned glass. Express orange peel oils and drop in.");
                oldFashioned.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                oldFashioned.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 5.0, Unit.ML));
                oldFashioned.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                oldFashioned.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                oldFashioned.setHasTried(true);
                oldFashioned.setFavourite(false);
                realm.copyToRealmOrUpdate(oldFashioned);

                Drink mapleOldFashioned = new Drink();
                mapleOldFashioned.setName("Maple Old Fashioned");
                mapleOldFashioned.setInstructions("Stir and strain over ice in old fashioned glass. Flame orange peel and drop in.");
                mapleOldFashioned.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                mapleOldFashioned.addDrinkIngredient(new DrinkIngredient(mapleSyrup, 5.0, Unit.ML));
                mapleOldFashioned.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                mapleOldFashioned.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                mapleOldFashioned.setHasTried(true);
                mapleOldFashioned.setFavourite(true);
                realm.copyToRealmOrUpdate(mapleOldFashioned);

                Drink boulevardier = new Drink();
                boulevardier.setName("Boulevardier");
                boulevardier.setInstructions("Stir and strain over ice in old fashioned glass. Express orange peel over drink and drop in");
                boulevardier.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                boulevardier.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                boulevardier.addDrinkIngredient(new DrinkIngredient(campari, 30.0, Unit.ML));
                boulevardier.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                boulevardier.setHasTried(true);
                boulevardier.setFavourite(true);
                realm.copyToRealmOrUpdate(boulevardier);

            }
        });
    }

}
