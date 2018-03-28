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
                Ingredient gin =
                        new Ingredient("Gin", "Spirit flavored with juniper and other spices.",
                                IngredientType.SPIRIT);
                Ingredient allspiceDram =
                        new Ingredient("Allspice Dram", "Allspice flavored liquer", IngredientType.LIQUEUR);
                Ingredient honeySuryp =
                        new Ingredient("Honey Suryp", "Variating ratio of water to honey", IngredientType.SURYP);
                Ingredient orangeBitters =
                        new Ingredient("Orange Bitters", "Orange flavored bitters", IngredientType.BITTERS);
                Ingredient tequilaBianco =
                        new Ingredient("Tequila Bianco", "Unaged blue agave spirit", IngredientType.SPIRIT);
                Ingredient grapefruit =
                        new Ingredient("Grapefruit", "Grapefruit", IngredientType.CITRUS);
                Ingredient darkRum =
                        new Ingredient("Dark Rum", "Sugar cane spirit. Aged", IngredientType.SPIRIT);
                Ingredient lime
                        = new Ingredient("Lime", "Citrus", IngredientType.CITRUS);
                Ingredient rockCandySyrup =
                        new Ingredient("Rock Candy Syrup", "2:1 sugar to water.", IngredientType.SURYP);
                Ingredient nutmeg =
                        new Ingredient("Nutmeg", "Spice", IngredientType.SPICE);
                Ingredient amaretto =
                        new Ingredient("Amaretto", "Almond flavored liqueur", IngredientType.LIQUEUR);
                Ingredient eggWhite =
                        new Ingredient("Egg White", "White from an egg", IngredientType.DAIRY);

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
                boulevardier.setDescription("Classic variation of the negroni.");
                boulevardier.setVariations("Try it with the ratio 2:1:1 or 1.5:1:1 (Bourbon:vermouth:campari)");
                boulevardier.addDrinkIngredient(new DrinkIngredient(bourbon, 30.0, Unit.ML));
                boulevardier.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                boulevardier.addDrinkIngredient(new DrinkIngredient(campari, 30.0, Unit.ML));
                boulevardier.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                boulevardier.setHasTried(true);
                boulevardier.setFavourite(true);
                realm.copyToRealmOrUpdate(boulevardier);

                Drink negroni = new Drink();
                negroni.setName("Negroni");
                negroni.setInstructions("Stir and strain over ice in old fashioned glass. Express orange peel over drink and drop in");
                negroni.addDrinkIngredient(new DrinkIngredient(gin, 30.0, Unit.ML));
                negroni.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                negroni.addDrinkIngredient(new DrinkIngredient(campari, 30.0, Unit.ML));
                negroni.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                negroni.setHasTried(true);
                negroni.setFavourite(false);
                realm.copyToRealmOrUpdate(negroni);

                Drink aLionsTaleRemix = new Drink();
                aLionsTaleRemix.setName("A Lion's Tale Remix");
                aLionsTaleRemix.setInstructions("Shake and strain over ice in old fashioned glass, garnish with cinnamon stick. 1:1 Honey Suryp");
                aLionsTaleRemix.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                aLionsTaleRemix.addDrinkIngredient(new DrinkIngredient(lemon, 22.0, Unit.ML));
                aLionsTaleRemix.addDrinkIngredient(new DrinkIngredient(allspiceDram, 7.5, Unit.ML));
                aLionsTaleRemix.addDrinkIngredient(new DrinkIngredient(honeySuryp, 15.0, Unit.ML));
                aLionsTaleRemix.addDrinkIngredient(new DrinkIngredient(orangeBitters, 2.0, Unit.DASH));
                aLionsTaleRemix.setFavourite(false);
                aLionsTaleRemix.setHasTried(false);
                realm.copyToRealmOrUpdate(aLionsTaleRemix);

                Drink agavoni = new Drink();
                agavoni.setName("Agavoni");
                agavoni.setInstructions("Stir and strain over ice in old fashioned glass. Express grapefruit peel over drink and drop in");
                agavoni.addDrinkIngredient(new DrinkIngredient(tequilaBianco, 30.0, Unit.ML));
                agavoni.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                agavoni.addDrinkIngredient(new DrinkIngredient(campari, 30.0, Unit.ML));
                agavoni.addDrinkIngredient(new DrinkIngredient(orangeBitters, 2.0, Unit.DASH));
                agavoni.addDrinkIngredient(new DrinkIngredient(grapefruit, 1.0, Unit.PEEL));
                agavoni.setFavourite(false);
                agavoni.setHasTried(false);
                realm.copyToRealmOrUpdate(agavoni);

                Drink agricoleRumPunch = new Drink();
                agricoleRumPunch.setName("Agricole Rum Punch");
                agricoleRumPunch.setInstructions("Shake and strain over ice in old fashioned glass. Garnish with grated nutmeg and orange slice. Rhum Agricole Vieux");
                agricoleRumPunch.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                agricoleRumPunch.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                agricoleRumPunch.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 15.0, Unit.ML));
                agricoleRumPunch.addDrinkIngredient(new DrinkIngredient(allspiceDram, 5.0, Unit.ML));
                agricoleRumPunch.addDrinkIngredient(new DrinkIngredient(nutmeg, 1.0, Unit.DASH));
                agricoleRumPunch.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.SLICE));
                agricoleRumPunch.setFavourite(false);
                agricoleRumPunch.setHasTried(false);
                realm.copyToRealmOrUpdate(agricoleRumPunch);

                Drink amarettoSour = new Drink();
                amarettoSour.setName("Amaretto Sour");
                amarettoSour.setInstructions("Shake and strain over ice in old fashioned glass. Garnish with lemon peel. Use cask-proof bourbon if available.");
                amarettoSour.addDrinkIngredient(new DrinkIngredient(amaretto, 45.0, Unit.ML));
                amarettoSour.addDrinkIngredient(new DrinkIngredient(bourbon, 22.0, Unit.ML));
                amarettoSour.addDrinkIngredient(new DrinkIngredient(lemon, 30.0, Unit.ML));
                amarettoSour.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 5.0, Unit.ML));
                amarettoSour.addDrinkIngredient(new DrinkIngredient(eggWhite, 30.0, Unit.ML));
                amarettoSour.addDrinkIngredient(new DrinkIngredient(lemon, 1.0, Unit.PEEL));
                amarettoSour.setFavourite(false);
                amarettoSour.setHasTried(false);
                realm.copyToRealmOrUpdate(amarettoSour);



            }
        });
    }

}
