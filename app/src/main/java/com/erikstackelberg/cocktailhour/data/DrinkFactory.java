package com.erikstackelberg.cocktailhour.data;

import android.support.annotation.NonNull;

import com.erikstackelberg.cocktailhour.enums.IngredientType;
import com.erikstackelberg.cocktailhour.enums.Tag;
import com.erikstackelberg.cocktailhour.enums.Unit;
import com.erikstackelberg.cocktailhour.models.Drink;
import com.erikstackelberg.cocktailhour.models.DrinkIngredient;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import io.realm.Realm;

public class DrinkFactory {
    private Realm realm;
    public DrinkFactory() {}

    public void insertMyData() {
        realm = Realm.getDefaultInstance();
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(@NonNull Realm realm) {
                //Ingredients
                Ingredient bourbon =
                        new Ingredient("Bourbon", "Corn based whisky.", IngredientType.SPIRIT, true);
                realm.copyToRealmOrUpdate(bourbon);

                Ingredient angosturaBitters =
                        new Ingredient("Angostura Bitters", "Spicy bitters", IngredientType.BITTERS, true);
                realm.copyToRealmOrUpdate(angosturaBitters);

                Ingredient simpleSyrup =
                        new Ingredient("Simple Syrup", "1:1 Sugar to water.", IngredientType.SURYP, true);
                realm.copyToRealmOrUpdate(simpleSyrup);

                Ingredient mapleSyrup =
                        new Ingredient("Maple Syrup", "Syrup from the maple tree.", IngredientType.SURYP, true);
                realm.copyToRealmOrUpdate(mapleSyrup);

                Ingredient redVermouth =
                        new Ingredient("Red Vermouth", "Fortified wine.", IngredientType.FORTIFIED_WINE, false);

                Ingredient campari =
                        new Ingredient("Campari", "Bitter herbal liqueur.", IngredientType.BITTER, true);

                Ingredient orange =
                        new Ingredient("Orange", "Citrus.", IngredientType.CITRUS, true);

                Ingredient lemon =
                        new Ingredient("Lemon", "Citrus,", IngredientType.CITRUS, true);
                Ingredient gin =
                        new Ingredient("Gin", "Spirit flavored with juniper and other spices.",
                                IngredientType.SPIRIT, true);
                Ingredient allspiceDram =
                        new Ingredient("Allspice Dram", "Allspice flavored liquer", IngredientType.LIQUEUR, true);
                Ingredient honeySuryp =
                        new Ingredient("Honey Suryp", "Variating ratio of water to honey", IngredientType.SURYP, true);
                Ingredient orangeBitters =
                        new Ingredient("Orange Bitters", "Orange flavored bitters", IngredientType.BITTERS, true);
                Ingredient tequilaBianco =
                        new Ingredient("Tequila Bianco", "Unaged blue agave spirit", IngredientType.SPIRIT, true);
                Ingredient tequilaResposado =
                        new Ingredient("Tequila Resposado", "Aged blue agave spirit", IngredientType.SPIRIT, false);
                Ingredient grapefruit =
                        new Ingredient("Grapefruit", "Grapefruit", IngredientType.CITRUS, false);
                Ingredient darkRum =
                        new Ingredient("Dark Rum", "Sugar cane spirit. Aged", IngredientType.SPIRIT, true);
                Ingredient lime
                        = new Ingredient("Lime", "Citrus", IngredientType.CITRUS, true);
                Ingredient rockCandySyrup =
                        new Ingredient("Rock Candy Syrup", "2:1 sugar to water.", IngredientType.SURYP, true);
                Ingredient nutmeg =
                        new Ingredient("Nutmeg", "Spice", IngredientType.SPICE, true);
                Ingredient amaretto =
                        new Ingredient("Amaretto", "Almond flavored liqueur", IngredientType.LIQUEUR, true);
                Ingredient eggWhite =
                        new Ingredient("Egg White", "White from an egg", IngredientType.DAIRY, true);

                Ingredient lightRum =
                        new Ingredient("Lightly Aged Rum", "Lightly aged spirit made from sugar canes. 3-8 years ish.", IngredientType.SPIRIT, true);
                Ingredient cointreau =
                        new Ingredient("Cointreau", "Orange peel flavored liqeur.", IngredientType.LIQUEUR, true);
                Ingredient maraschinoLiqueur =
                        new Ingredient("Maraschino Liqueur", "Chemical tasting liqueur", IngredientType.LIQUEUR, true);
                Ingredient brandy =
                        new Ingredient("Brandy", "Distilled grape spirit", IngredientType.SPIRIT, true);
                Ingredient greenChartreuse =
                        new Ingredient("Green Chartreuse", "Liqueur with many herbs.", IngredientType.LIQUEUR, true);

                Ingredient pineapple =
                        new Ingredient("Pineapple", "Exotic fruit.", IngredientType.FRUIT, true);

                Ingredient falernum =
                        new Ingredient("Falernum", "Liqeur with spices like ginger clove and lime zest.", IngredientType.SURYP, true);

                Ingredient scotch =
                        new Ingredient("Scotch", "Scottish whiskey", IngredientType.SPIRIT, true);

                Ingredient becherovka =
                        new Ingredient("Becherovka", "Czech cinnamon liqueur", IngredientType.LIQUEUR, true);
                Ingredient cinnamonSyrup =
                        new Ingredient("Cinnamon Syrup", "Cinnamon flavored syryp.", IngredientType.SURYP, false);

                Ingredient absinthe =
                        new Ingredient("Absinthe", "High-proof Spirit with wormwood and other spices", IngredientType.SPIRIT, true);

                Ingredient orgeat =
                        new Ingredient("Orgeat", "Almond syrup", IngredientType.SURYP, false);

                Ingredient mint =
                        new Ingredient("Mint", "It's mint!", IngredientType.HERB, false);

                Ingredient cognac =
                        new Ingredient("Cognac", "Grape spirit.", IngredientType.SPIRIT, true);
                Ingredient vanillaSyrup =
                        new Ingredient("Vanilla Syrup", "Vanilla pod flavored syrup.", IngredientType.SURYP, true);

                Ingredient vanillaExtract =
                        new Ingredient("Vanilla Extract", "Concentrated vanilla flavor", IngredientType.OTHER, true);
                Ingredient almondExtract =
                        new Ingredient("Almond Extract", "Concentrated almond flavor", IngredientType.OTHER, true);
                Ingredient sodaWater =
                        new Ingredient("Soda Water", "Carbonated H2O", IngredientType.SODA, true);
                Ingredient raspberry =
                        new Ingredient("Raspberry", "Sweet berry", IngredientType.FRUIT, true);
                Ingredient gingerBeer =
                        new Ingredient("Ginger Beer", "Fermented ginger beverage.", IngredientType.SODA, true);
                Ingredient grenadine
                        = new Ingredient("Grenadine", "Pomegranate syrup", IngredientType.SURYP, false);

                Ingredient passionFruit =
                        new Ingredient("Passion Fruit", "Exotic fruit", IngredientType.FRUIT, false);
                Ingredient dryVermouth =
                        new Ingredient("Dry Vermouth", "Also called white vermouth", IngredientType.FORTIFIED_WINE, false);
                Ingredient mezcal =
                        new Ingredient("Mezcal", "Smoky agave spirit", IngredientType.SPIRIT, true);
                Ingredient egg =
                        new Ingredient("Egg", "FROM HENS", IngredientType.DAIRY, true);
                Ingredient moleBitters =
                        new Ingredient("Mole Bitters", "Xocolatl Mole Bitters", IngredientType.BITTERS, false);
                Ingredient fernetBranca =
                        new Ingredient("Fernet Branca", "Herbal bitter liqueur", IngredientType.LIQUEUR, true);
                Ingredient sherry =
                        new Ingredient("Sherry", "Fortified wine", IngredientType.FORTIFIED_WINE, false);

                Ingredient sparklingWine =
                        new Ingredient("Sparkling Wine", "Umbrella term for wine with carbonation", IngredientType.WINE, true);

                Ingredient tonicWater =
                        new Ingredient("Tonic Water", "Bitter quinine flavored soda.", IngredientType.SODA, true);

                Ingredient whiteRum =
                        new Ingredient("White Rum", "Unaged rum", IngredientType.SPIRIT, true);

                Ingredient passionFruitSyrup =
                        new Ingredient("Passion Fruit Syrup", "1:1 Rock candy syrup to passion fruit juice", IngredientType.SURYP, false);

                Ingredient coconutMilk =
                        new Ingredient("Coconut Milk", "milk from coconut", IngredientType.OTHER, true);
                Ingredient strawberry =
                        new Ingredient("Strawberry", "Sweet summer berry", IngredientType.FRUIT, false);
                Ingredient serranoPepper =
                         new Ingredient("Serrano Pepper", "Hot mexian pepper", IngredientType.OTHER);
                Ingredient ryeWhiskey =
                        new Ingredient("Rye Whiskey", "Whiskey made with more then 50% rye.", IngredientType.SPIRIT);
                Ingredient salt =
                        new Ingredient("Salt", "JUST SALT", IngredientType.OTHER);

                Ingredient agaveSyrup =
                        new Ingredient("Agave Syrup", "Syrup from agave plant", IngredientType.SURYP, true);
                Ingredient sugar
                        = new Ingredient("Sugar", "White regular sugar.", IngredientType.SUGAR);

                Ingredient coconutCream = new Ingredient("Coconut Cream", "Cream of coconut", IngredientType.OTHER, true);
                Ingredient cinnamon = new Ingredient("Cinnamon", "Bark", IngredientType.SPICE, true);
                Ingredient heavyCream = new Ingredient("Heavy Cream", "High fat", IngredientType.DAIRY, true);
                Ingredient orangeFlowerWater = new Ingredient("Orange Flower Water", "Fragrant.", IngredientType.OTHER, true);
                Ingredient chocolateBitters = new Ingredient("Chocolate Bitters", "chocolate bitters", IngredientType.BITTERS, true);

                //Drinks
                Drink oldFashioned = new Drink();
                oldFashioned.setName("Old Fashioned");
                oldFashioned.setInstructions("Stir and strain over ice in old fashioned glass. Express orange peel oils and drop in.");
                oldFashioned.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                oldFashioned.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 5.0, Unit.ML));
                oldFashioned.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                oldFashioned.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                oldFashioned.addTag(Tag.TRIED);
                oldFashioned.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(oldFashioned);

                Drink mapleOldFashioned = new Drink();
                mapleOldFashioned.setName("Maple Old Fashioned");
                mapleOldFashioned.setInstructions("Stir and strain over ice in old fashioned glass. Flame orange peel and drop in.");
                mapleOldFashioned.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                mapleOldFashioned.addDrinkIngredient(new DrinkIngredient(mapleSyrup, 5.0, Unit.ML));
                mapleOldFashioned.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                mapleOldFashioned.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                mapleOldFashioned.addTag(Tag.FAVORITE);
                mapleOldFashioned.addTag(Tag.TRIED);
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
                boulevardier.addTag(Tag.FAVORITE);
                boulevardier.addTag(Tag.TRIED);
                boulevardier.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(boulevardier);

                Drink negroni = new Drink();
                negroni.setName("Negroni");
                negroni.setInstructions("Stir and strain over ice in old fashioned glass. Express orange peel over drink and drop in");
                negroni.addDrinkIngredient(new DrinkIngredient(gin, 30.0, Unit.ML));
                negroni.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                negroni.addDrinkIngredient(new DrinkIngredient(campari, 30.0, Unit.ML));
                negroni.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                negroni.addTag(Tag.TRIED);
                negroni.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(negroni);

                Drink aLionsTaleRemix = new Drink();
                aLionsTaleRemix.setName("A Lion's Tale Remix");
                aLionsTaleRemix.setInstructions("Shake and strain over ice in old fashioned glass, garnish with cinnamon stick. 1:1 Honey Suryp");
                aLionsTaleRemix.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                aLionsTaleRemix.addDrinkIngredient(new DrinkIngredient(lemon, 22.0, Unit.ML));
                aLionsTaleRemix.addDrinkIngredient(new DrinkIngredient(allspiceDram, 7.5, Unit.ML));
                aLionsTaleRemix.addDrinkIngredient(new DrinkIngredient(honeySuryp, 15.0, Unit.ML));
                aLionsTaleRemix.addDrinkIngredient(new DrinkIngredient(orangeBitters, 2.0, Unit.DASH));
                aLionsTaleRemix.addTag(Tag.FAVORITE);
                aLionsTaleRemix.addTag(Tag.TRIED);
                realm.copyToRealmOrUpdate(aLionsTaleRemix);

                Drink agavoni = new Drink();
                agavoni.setName("Agavoni");
                agavoni.setInstructions("Stir and strain over ice in old fashioned glass. Express grapefruit peel over drink and drop in");
                agavoni.addDrinkIngredient(new DrinkIngredient(tequilaBianco, 30.0, Unit.ML));
                agavoni.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                agavoni.addDrinkIngredient(new DrinkIngredient(campari, 30.0, Unit.ML));
                agavoni.addDrinkIngredient(new DrinkIngredient(orangeBitters, 2.0, Unit.DASH));
                agavoni.addDrinkIngredient(new DrinkIngredient(grapefruit, 1.0, Unit.PEEL));
                agavoni.addTag(Tag.NOT_TRIED);
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
                agricoleRumPunch.addTag(Tag.TIKI);
                agricoleRumPunch.addTag(Tag.NOT_TRIED);
                agricoleRumPunch.addTag(Tag.TRY_SOON);
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
                amarettoSour.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(amarettoSour);

                Drink barbadosRumPunch = new Drink();
                barbadosRumPunch.setName("Barbados Rum Punch");
                barbadosRumPunch.setInstructions("Shake and strain into footed pilsner with cubed or cracked ice. Garnish with grated nutmeg. Barbados Rum");
                barbadosRumPunch.setDescription("Original Smuggler's Cove recipe");
                barbadosRumPunch.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                barbadosRumPunch.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                barbadosRumPunch.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 30.0, Unit.ML));
                barbadosRumPunch.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                barbadosRumPunch.addDrinkIngredient(new DrinkIngredient(nutmeg, 1.0, Unit.DASH));
                barbadosRumPunch.addTag(Tag.TIKI);
                barbadosRumPunch.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(barbadosRumPunch);

                Drink beachcomber = new Drink();
                beachcomber.setName("Beachcomber");
                beachcomber.setInstructions("Shake and double strain inte coupe.");
                beachcomber.setTastingNotes("Sweet orange peel flavour, followed by dry funkiness.");
                beachcomber.addDrinkIngredient(new DrinkIngredient(lightRum, 60.0, Unit.ML));
                beachcomber.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                beachcomber.addDrinkIngredient(new DrinkIngredient(cointreau, 30.0, Unit.ML));
                beachcomber.addDrinkIngredient(new DrinkIngredient(maraschinoLiqueur, 7.5, Unit.ML));
                beachcomber.addTag(Tag.TRIED);
                beachcomber.addTag(Tag.FAVORITE);
                realm.copyToRealmOrUpdate(beachcomber);

                Drink beesKnees = new Drink();
                beesKnees.setName("Bee's Knees");
                beesKnees.setInstructions("Shake and double strain into coupe. 3:1 honey suryp.");
                beesKnees.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                beesKnees.addDrinkIngredient(new DrinkIngredient(lemon, 22.0, Unit.ML));
                beesKnees.addDrinkIngredient(new DrinkIngredient(honeySuryp, 22.0, Unit.ML));
                beesKnees.addTag(Tag.NOT_TRIED);
                beesKnees.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(beesKnees);

                Drink theHenry = new Drink();
                theHenry.setName("The Henry");
                theHenry.setInstructions("Stir and strain into coupe. Garnish with wide orange peel. Rhum Agricole");
                theHenry.addDrinkIngredient(new DrinkIngredient(darkRum, 45.0, Unit.ML));
                theHenry.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                theHenry.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 3.0, Unit.DASH));
                theHenry.addDrinkIngredient(new DrinkIngredient(orangeBitters, 3.0, Unit.DASH));
                theHenry.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                theHenry.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(theHenry);

                Drink brandyCrusta = new Drink();
                brandyCrusta.setName("Brandy Crusta");
                brandyCrusta.setInstructions("Shake and strain into old fashioned glass. Garnish with long lemon peel along the sides of the glass.");
                brandyCrusta.addDrinkIngredient(new DrinkIngredient(brandy, 45.0, Unit.ML));
                brandyCrusta.addDrinkIngredient(new DrinkIngredient(maraschinoLiqueur, 7.5, Unit.ML));
                brandyCrusta.addDrinkIngredient(new DrinkIngredient(cointreau, 7.5, Unit.ML));
                brandyCrusta.addDrinkIngredient(new DrinkIngredient(lemon, 7.5, Unit.ML));
                brandyCrusta.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                brandyCrusta.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(brandyCrusta);


                Drink chartreuseSwizzle = new Drink();
                chartreuseSwizzle.setName("Chartreuse Swizzle");
                chartreuseSwizzle.setInstructions("Swizzle in footed pilsner and garnish with grated nutmeg.");
                chartreuseSwizzle.setTastingNotes("Sweet and herbaceous.");
                chartreuseSwizzle.addDrinkIngredient(new DrinkIngredient(greenChartreuse, 45.0, Unit.ML));
                chartreuseSwizzle.addDrinkIngredient(new DrinkIngredient(pineapple, 30.0, Unit.ML));
                chartreuseSwizzle.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                chartreuseSwizzle.addDrinkIngredient(new DrinkIngredient(falernum, 15.0, Unit.ML));
                chartreuseSwizzle.addDrinkIngredient(new DrinkIngredient(nutmeg, 1.0, Unit.DASH));
                chartreuseSwizzle.addTag(Tag.TRIED);
                chartreuseSwizzle.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(chartreuseSwizzle);

                Drink churchhillManhattan = new Drink();
                churchhillManhattan.setName("Churchhill Manhattan");
                churchhillManhattan.setInstructions("Stir and double strain into coupe.");
                churchhillManhattan.addDrinkIngredient(new DrinkIngredient(scotch, 45.0, Unit.ML));
                churchhillManhattan.addDrinkIngredient(new DrinkIngredient(redVermouth, 15.0, Unit.ML));
                churchhillManhattan.addDrinkIngredient(new DrinkIngredient(cointreau, 15.0, Unit.ML));
                churchhillManhattan.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                churchhillManhattan.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(churchhillManhattan);

                Drink cornAndOil = new Drink();
                cornAndOil.setName("Corn and Oil");
                cornAndOil.setInstructions("Stir with crushed ice in footed pilsner. Barbados rum.");
                cornAndOil.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                cornAndOil.addDrinkIngredient(new DrinkIngredient(falernum, 15.0, Unit.ML));
                cornAndOil.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 3.0, Unit.DASH));
                cornAndOil.addTag(Tag.NOT_TRIED);
                cornAndOil.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(cornAndOil);

                Drink archipelago = new Drink();
                archipelago.setName("Archipelago");
                archipelago.setDescription("Daiquiri variation");
                archipelago.setInstructions("Shake and double strain into cocktail glass or coupe.");
                archipelago.setVariations("Try it with lightly aged rum.");
                archipelago.addDrinkIngredient(new DrinkIngredient(whiteRum, 60.0, Unit.ML));
                archipelago.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                archipelago.addDrinkIngredient(new DrinkIngredient(cinnamonSyrup, 15.0, Unit.ML));
                archipelago.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                archipelago.addDrinkIngredient(new DrinkIngredient(absinthe, 6.0, Unit.DROP));
                archipelago.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(archipelago);

                Drink armyAndNavy = new Drink();
                armyAndNavy.setName("Army & Navy");
                armyAndNavy.setInstructions("Shake and double strain into coupe. Garnish with lemon zest.");
                armyAndNavy.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                armyAndNavy.addDrinkIngredient(new DrinkIngredient(lemon, 15.0, Unit.ML));
                armyAndNavy.addDrinkIngredient(new DrinkIngredient(orgeat, 15.0, Unit.ML));
                armyAndNavy.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.ML));
                armyAndNavy.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(armyAndNavy);

                Drink babbosToddy = new Drink();
                babbosToddy.setName("Babbo's Toddy");
                babbosToddy.setInstructions("Build in heat proof glass or mug, top with hot water. Garnish with orange slice");
                babbosToddy.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                babbosToddy.addDrinkIngredient(new DrinkIngredient(bourbon, 15.0, Unit.ML));
                babbosToddy.addDrinkIngredient(new DrinkIngredient(campari, 15.0, Unit.ML));
                babbosToddy.addDrinkIngredient(new DrinkIngredient(cinnamonSyrup, 20.0, Unit.ML));
                babbosToddy.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.WEDGE));
                babbosToddy.addTag(Tag.NOT_TRIED);
                babbosToddy.addTag(Tag.HOT);
                realm.copyToRealmOrUpdate(babbosToddy);

                Drink bakerStreetSwizzle = new Drink();
                bakerStreetSwizzle.setName("Baker Street Swizzle");
                bakerStreetSwizzle.setInstructions("Muddle mint and falernum in collins glass " +
                        "Fill halfway with crushed ice, add remaining ingredients and swizzle. " +
                        "Fill with crushed ice and float angostura bitters. Garnish with mint sprig.");
                bakerStreetSwizzle.addDrinkIngredient(new DrinkIngredient(absinthe, 45.0, Unit.ML));
                bakerStreetSwizzle.addDrinkIngredient(new DrinkIngredient(lemon, 15.0, Unit.ML));
                bakerStreetSwizzle.addDrinkIngredient(new DrinkIngredient(falernum, 20.0, Unit.ML));
                bakerStreetSwizzle.addDrinkIngredient(new DrinkIngredient(mint, 8.0, Unit.LEAF));
                bakerStreetSwizzle.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 15.0, Unit.ML));
                bakerStreetSwizzle.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(bakerStreetSwizzle);

                Drink boukmanDaiquiri = new Drink();
                boukmanDaiquiri.setName("Boukman Daiquiri");
                boukmanDaiquiri.setInstructions("Shake and double strain into coupe. Garnish with lime wedge.");
                boukmanDaiquiri.setVariations("Try it with lightly aged rum.");
                boukmanDaiquiri.addDrinkIngredient(new DrinkIngredient(whiteRum, 45.0, Unit.ML));
                boukmanDaiquiri.addDrinkIngredient(new DrinkIngredient(cognac, 15.0, Unit.ML));
                boukmanDaiquiri.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                boukmanDaiquiri.addDrinkIngredient(new DrinkIngredient(cinnamonSyrup, 20.0, Unit.ML));
                boukmanDaiquiri.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(boukmanDaiquiri);

                Drink bravoZulu = new Drink();
                bravoZulu.setName("Bravo Zulu");
                bravoZulu.setInstructions("Shake with crushed ice and 4-5 ice cubes. Open pour into tiki mug or old fashioned glass. Garnish with mint.");
                bravoZulu.addDrinkIngredient(new DrinkIngredient(lightRum, 45.0, Unit.ML));
                bravoZulu.addDrinkIngredient(new DrinkIngredient(redVermouth, 15.0, Unit.ML));
                bravoZulu.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                bravoZulu.addDrinkIngredient(new DrinkIngredient(pineapple, 15.0, Unit.ML));
                bravoZulu.addDrinkIngredient(new DrinkIngredient(cinnamonSyrup, 7.5, Unit.ML));
                bravoZulu.addTag(Tag.NOT_TRIED);
                bravoZulu.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(bravoZulu);

                Drink brownDerby = new Drink();
                brownDerby.setName("Brown Derby");
                brownDerby.setInstructions("Shake and double strain into coupe. 1:1 Honey Syrup.");
                brownDerby.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                brownDerby.addDrinkIngredient(new DrinkIngredient(grapefruit, 30.0, Unit.ML));
                brownDerby.addDrinkIngredient(new DrinkIngredient(honeySuryp, 15.0, Unit.ML));
                brownDerby.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(brownDerby);

                Drink captainsGrog = new Drink();
                captainsGrog.setName("Captain's Grog");
                captainsGrog.setInstructions("Shake with crushed ice and 4.5 ice cubes." +
                        " Open pour into double old fashioned glass. Top with soda and garnish with mint." +
                        "20ml Black Blended Rum 20ml Blended Aged Rum");
                captainsGrog.addDrinkIngredient(new DrinkIngredient(darkRum, 40.0, Unit.ML));
                captainsGrog.addDrinkIngredient(new DrinkIngredient(lightRum, 20.0, Unit.ML));
                captainsGrog.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                captainsGrog.addDrinkIngredient(new DrinkIngredient(grapefruit, 15.0, Unit.ML));
                captainsGrog.addDrinkIngredient(new DrinkIngredient(mapleSyrup, 15.0, Unit.ML));
                captainsGrog.addDrinkIngredient(new DrinkIngredient(falernum, 15.0, Unit.ML));
                captainsGrog.addDrinkIngredient(new DrinkIngredient(cointreau, 15.0, Unit.ML));
                captainsGrog.addDrinkIngredient(new DrinkIngredient(vanillaExtract, 3.0, Unit.DROP));
                captainsGrog.addDrinkIngredient(new DrinkIngredient(almondExtract, 3.0, Unit.DROP));
                captainsGrog.addDrinkIngredient(new DrinkIngredient(sodaWater, 30.0, Unit.ML));
                captainsGrog.addDrinkIngredient(new DrinkIngredient(mint, 1.0, Unit.SPRIG));
                captainsGrog.addTag(Tag.TIKI);
                captainsGrog.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(captainsGrog);

                Drink centralStandardSwizzle = new Drink();
                centralStandardSwizzle.setName("Central Standard Swizzle");
                centralStandardSwizzle.setInstructions("Muddle mint, fill with crushed ice and rest of ingredients. " +
                        "Swizzle in collins glass and top with angostura bitters. Garnish with mint sprig.");
                centralStandardSwizzle.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                centralStandardSwizzle.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                centralStandardSwizzle.addDrinkIngredient(new DrinkIngredient(falernum, 20.0, Unit.ML));
                centralStandardSwizzle.addDrinkIngredient(new DrinkIngredient(mint, 5.0, Unit.LEAF));
                centralStandardSwizzle.addTag(Tag.NOT_TRIED);
                centralStandardSwizzle.addTag(Tag.TRY_SOON);
                centralStandardSwizzle.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(centralStandardSwizzle);

                Drink cloverClub = new Drink();
                cloverClub.setName("Clover Club");
                cloverClub.setInstructions("Shake and double strain int coupe.");
                cloverClub.setVariations("You can use raspberry syrup instead of fresh.");
                cloverClub.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                cloverClub.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                cloverClub.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 20.0, Unit.ML));
                cloverClub.addDrinkIngredient(new DrinkIngredient(raspberry, 5.0, Unit.NONE));
                cloverClub.addDrinkIngredient(new DrinkIngredient(eggWhite, 1.0, Unit.NONE));
                cloverClub.addTag(Tag.CLASSIC);
                cloverClub.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(cloverClub);

                Drink czechRemedy = new Drink();
                czechRemedy.setName("Czech Remedy");
                czechRemedy.setInstructions("Shake and doubl strain into coupe rinsed with peated scotch. 1:1 Homey syrup");
                czechRemedy.addDrinkIngredient(new DrinkIngredient(scotch, 30.0, Unit.ML));
                czechRemedy.addDrinkIngredient(new DrinkIngredient(becherovka, 30.0, Unit.ML));
                czechRemedy.addDrinkIngredient(new DrinkIngredient(honeySuryp, 15.0, Unit.ML));
                czechRemedy.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(czechRemedy);

                Drink daiquiri = new Drink();
                daiquiri.setName("Daiquri");
                daiquiri.setInstructions("Shake and double strain into coupe. Garnish with lime wheel.");
                daiquiri.setVariations("Try it with lightly aged rum.");
                daiquiri.addDrinkIngredient(new DrinkIngredient(whiteRum, 60.0, Unit.ML));
                daiquiri.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                daiquiri.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 20.0, Unit.ML));
                daiquiri.addTag(Tag.NOT_TRIED);
                daiquiri.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(daiquiri);

                Drink darkAndStormy = new Drink();
                darkAndStormy.setName("Dark & Stormy");
                darkAndStormy.setInstructions("Build in highball and garnish with lime wedge. Black blended rum.");
                darkAndStormy.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                darkAndStormy.addDrinkIngredient(new DrinkIngredient(gingerBeer, 100.0, Unit.ML));
                darkAndStormy.addDrinkIngredient(new DrinkIngredient(lime, 10.0, Unit.ML));
                darkAndStormy.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(darkAndStormy);

                Drink drFunk = new Drink();
                drFunk.setName("Dr. Funk");
                drFunk.setInstructions("Shake with crushed ice and 4-5 ice cubes and open pour into tiki mug or double old fashioned. " +
                        "Top with soda water. Black blended rum. (Jamaican)");
                drFunk.addDrinkIngredient(new DrinkIngredient(darkRum, 75.0, Unit.ML));
                drFunk.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                drFunk.addDrinkIngredient(new DrinkIngredient(lemon, 15.0, Unit.ML));
                drFunk.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 15.0, Unit.ML));
                drFunk.addDrinkIngredient(new DrinkIngredient(absinthe, 7.5, Unit.ML));
                drFunk.addDrinkIngredient(new DrinkIngredient(grenadine, 7.5, Unit.ML));
                drFunk.addDrinkIngredient(new DrinkIngredient(sodaWater, 30.0, Unit.ML));
                drFunk.addDrinkIngredient(new DrinkIngredient(mint, 1.0, Unit.SPRIG));
                drFunk.addTag(Tag.NOT_TRIED);
                drFunk.addTag(Tag.TRY_SOON);
                drFunk.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(drFunk);

                Drink drWong = new Drink();
                drWong.setName("Dr Wong");
                drWong.setInstructions("Shake with crushed ice and 4-5 ice cubes. Open pour into tiki mug or footed pilsner. ");
                drWong.addDrinkIngredient(new DrinkIngredient(lightRum, 60.0, Unit.ML));
                drWong.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                drWong.addDrinkIngredient(new DrinkIngredient(absinthe, 5.0, Unit.ML));
                drWong.addDrinkIngredient(new DrinkIngredient(grenadine, 24.0, Unit.ML));
                drWong.addDrinkIngredient(new DrinkIngredient(grenadine, 24.0, Unit.ML));
                drWong.addDrinkIngredient(new DrinkIngredient(passionFruit, 6.0, Unit.ML));
                drWong.addTag(Tag.NOT_TRIED);
                drWong.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(drWong);

                Drink dryMartini = new Drink();
                dryMartini.setName("Dry Martini");
                dryMartini.setInstructions("Stir and strain into coupe.");
                dryMartini.setVariations("Either express lemon peel over drink or drop in an olive. " +
                        "Ratio gin to vermouth is highly variable.");
                dryMartini.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                dryMartini.addDrinkIngredient(new DrinkIngredient(dryVermouth, 20.0, Unit.ML));
                dryMartini.addDrinkIngredient(new DrinkIngredient(orangeBitters, 2.0, Unit.DASH));
                dryMartini.addTag(Tag.NOT_TRIED);
                dryMartini.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(dryMartini);

                Drink easternSour = new Drink();
                easternSour.setName("Eastern Sour");
                easternSour.setInstructions("Shake with crushed ice and 4-5 ice cubes. Open pour into double old fashioned. Garnish witht mint and an orange slice.");
                easternSour.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                easternSour.addDrinkIngredient(new DrinkIngredient(lemon, 30.0, Unit.ML));
                easternSour.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 7.5, Unit.ML));
                easternSour.addDrinkIngredient(new DrinkIngredient(orgeat, 7.5, Unit.ML));
                easternSour.addDrinkIngredient(new DrinkIngredient(orange, 60.0, Unit.ML));
                easternSour.addDrinkIngredient(new DrinkIngredient(mint, 1.0, Unit.SPRIG));
                easternSour.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(easternSour);

                Drink elPresidente = new Drink();
                elPresidente.setName("El Presidente");
                elPresidente.setInstructions("Stir and strain into coupe or cocktail glass.");
                elPresidente.addDrinkIngredient(new DrinkIngredient(lightRum, 45.0, Unit.ML));
                elPresidente.addDrinkIngredient(new DrinkIngredient(cointreau, 15.0, Unit.ML));
                elPresidente.addDrinkIngredient(new DrinkIngredient(dryVermouth, 20.0, Unit.ML));
                elPresidente.addDrinkIngredient(new DrinkIngredient(grenadine, 2.5, Unit.ML));
                elPresidente.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(elPresidente);

                Drink felizFlip = new Drink();
                felizFlip.setName("Feliz Flip");
                felizFlip.setInstructions("Dry shake and strain into old fashioned glass. Garnish with 3 drops of bitters.");
                felizFlip.addDrinkIngredient(new DrinkIngredient(mezcal, 45.0, Unit.ML));
                felizFlip.addDrinkIngredient(new DrinkIngredient(lemon, 15.0, Unit.ML));
                felizFlip.addDrinkIngredient(new DrinkIngredient(honeySuryp, 15.0, Unit.ML));
                felizFlip.addDrinkIngredient(new DrinkIngredient(cinnamonSyrup, 7.5, Unit.ML));
                felizFlip.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 7.5, Unit.ML));
                felizFlip.addDrinkIngredient(new DrinkIngredient(allspiceDram, 5.0, Unit.ML));
                felizFlip.addDrinkIngredient(new DrinkIngredient(egg, 1.0, Unit.NONE));
                felizFlip.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(felizFlip);

                Drink fernetFlip = new Drink();
                fernetFlip.setName("Fernet Flip");
                fernetFlip.setInstructions("Dry shake then double strain into old fashioned glass or stemmed cocktail glass. Garnish with grated nutmeg.");
                fernetFlip.addDrinkIngredient(new DrinkIngredient(fernetBranca, 45.0, Unit.ML));
                fernetFlip.addDrinkIngredient(new DrinkIngredient(redVermouth, 45.0, Unit.ML));
                fernetFlip.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 5.0, Unit.ML));
                fernetFlip.addDrinkIngredient(new DrinkIngredient(moleBitters, 2.0, Unit.DASH));
                fernetFlip.addDrinkIngredient(new DrinkIngredient(egg, 1.0, Unit.NONE));
                fernetFlip.addDrinkIngredient(new DrinkIngredient(nutmeg, 1.0, Unit.DASH));
                fernetFlip.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(fernetFlip);

                Drink fogCutter = new Drink();
                fogCutter.setName("Fog Cutter");
                fogCutter.setInstructions("Shake with crushed ice and 4-5 ice cubes. Open pour into snifter and float sherry." +
                        " Garnish with mint and/or edible blossoms." +
                        " Amontadillo sherry.");
                fogCutter.addDrinkIngredient(new DrinkIngredient(lightRum, 60.0, Unit.ML));
                fogCutter.addDrinkIngredient(new DrinkIngredient(brandy, 30.0, Unit.ML));
                fogCutter.addDrinkIngredient(new DrinkIngredient(gin, 15.0, Unit.ML));
                fogCutter.addDrinkIngredient(new DrinkIngredient(lemon, 60.0, Unit.ML));
                fogCutter.addDrinkIngredient(new DrinkIngredient(orange, 30.0, Unit.ML));
                fogCutter.addDrinkIngredient(new DrinkIngredient(orgeat, 30.0, Unit.ML));
                fogCutter.addDrinkIngredient(new DrinkIngredient(sherry, 15.0, Unit.ML));
                fogCutter.addTag(Tag.NOT_TRIED);
                fogCutter.addTag(Tag.TRY_SOON);
                fogCutter.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(fogCutter);

                Drink followThatBlackRabbit = new Drink();
                followThatBlackRabbit.setName("Follow that Black Rabbit");
                followThatBlackRabbit.addDrinkIngredient(new DrinkIngredient(gin, 20.0, Unit.ML));
                followThatBlackRabbit.addDrinkIngredient(new DrinkIngredient(fernetBranca, 20.0, Unit.ML));
                followThatBlackRabbit.addDrinkIngredient(new DrinkIngredient(mapleSyrup, 20.0, Unit.ML));
                followThatBlackRabbit.addDrinkIngredient(new DrinkIngredient(lemon, 10.0, Unit.ML));
                followThatBlackRabbit.addDrinkIngredient(new DrinkIngredient(orange, 20.0, Unit.ML));
                followThatBlackRabbit.addTag(Tag.NOT_TRIED);
                followThatBlackRabbit.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(followThatBlackRabbit);

                Drink forgerysGranCobbler = new Drink();
                forgerysGranCobbler.setName("Forgery's Gran Cobbler");
                forgerysGranCobbler.setInstructions("Shake and strain over crushed ice in nick & nora or clarinet. Garnish with speared lime and rasperry.");
                forgerysGranCobbler.addDrinkIngredient(new DrinkIngredient(redVermouth, 60.0, Unit.ML));
                forgerysGranCobbler.addDrinkIngredient(new DrinkIngredient(lime, 7.5, Unit.ML));
                forgerysGranCobbler.addDrinkIngredient(new DrinkIngredient(absinthe, 5.0, Unit.ML));
                forgerysGranCobbler.addDrinkIngredient(new DrinkIngredient(raspberry, 5.0, Unit.NONE));
                forgerysGranCobbler.addTag(Tag.NOT_TRIED);
                forgerysGranCobbler.addTag(Tag.TRY_SOON);

                Drink french75 = new Drink();
                french75.setName("French 75");
                french75.setInstructions("Shake and double strain into coupe or champagne flute, top with sparkling wine.");
                french75.setVariations("Morgenthaler method. Use highball with cracked ice.");
                french75.addDrinkIngredient(new DrinkIngredient(gin, 30.0, Unit.ML));
                french75.addDrinkIngredient(new DrinkIngredient(lemon, 30.0, Unit.ML));
                french75.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 15.0, Unit.ML));
                french75.addDrinkIngredient(new DrinkIngredient(sparklingWine, 60.0, Unit.ML));
                french75.addTag(Tag.TRIED);
                french75.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(french75);

                Drink gimlet = new Drink();
                gimlet.setName("Gimlet");
                gimlet.setInstructions("Shake and double strain into coupe. Garnish with lime wheel.");
                gimlet.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                gimlet.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                gimlet.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                gimlet.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(gimlet);

                Drink ginAndTonic = new Drink();
                ginAndTonic.setName("Gin & Tonic");
                ginAndTonic.setInstructions("Build in double old fashioned or collins. Garnish with lime wheel.");
                ginAndTonic.setVariations("You can also use tonic syrup and soda water. Try it with star anise.");
                ginAndTonic.setTastingNotes("Crispy and refreshing yet bitter. Juniper and quinine.");
                ginAndTonic.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                ginAndTonic.addDrinkIngredient(new DrinkIngredient(tonicWater, 120.0, Unit.ML));
                ginAndTonic.addDrinkIngredient(new DrinkIngredient(lime, 7.5, Unit.ML));
                ginAndTonic.addTag(Tag.TRIED);
                ginAndTonic.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(ginAndTonic);

                Drink goldFrond = new Drink();
                goldFrond.setName("Gold Frond");
                goldFrond.setInstructions("Shake with crushed ice and 4-5 ice cubes and open pour into tiki mug or collins glass. Garnish with mint");
                goldFrond.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                goldFrond.addDrinkIngredient(new DrinkIngredient(pineapple, 30.0, Unit.ML));
                goldFrond.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                goldFrond.addDrinkIngredient(new DrinkIngredient(vanillaSyrup, 15.0, Unit.ML));
                goldFrond.addDrinkIngredient(new DrinkIngredient(mint, 1.0, Unit.SPRIG));
                goldFrond.addTag(Tag.NOT_TRIED);
                goldFrond.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(goldFrond);

                Drink goldRush = new Drink();
                goldRush.setName("Gold Rush");
                goldRush.setInstructions("Shake and strain over big ice cube in old fashioned glass. No garnish");
                goldRush.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                goldRush.addDrinkIngredient(new DrinkIngredient(honeySuryp, 30.0, Unit.ML));
                goldRush.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                goldRush.addTag(Tag.NOT_TRIED);
                goldRush.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(goldRush);

                Drink grog = new Drink();
                grog.setName("Grog");
                grog.setInstructions("Build in old fashioned glass.");
                grog.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                grog.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                grog.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 15.0, Unit.ML));
                grog.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(grog);

                Drink guadalajara = new Drink();
                guadalajara.setName("Guadalajara");
                guadalajara.setInstructions("Shake and double strain into coupe or cocktail glass. Top with sparkling wine.");
                guadalajara.addDrinkIngredient(new DrinkIngredient(tequilaBianco, 60.0, Unit.ML));
                guadalajara.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                guadalajara.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 20.0, Unit.ML));
                guadalajara.addDrinkIngredient(new DrinkIngredient(orangeBitters, 2.0, Unit.DASH));
                guadalajara.addDrinkIngredient(new DrinkIngredient(mint, 1.0, Unit.SPRIG));
                guadalajara.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(guadalajara);

                Drink haiKarate = new Drink();
                haiKarate.setName("Hai Karate");
                haiKarate.setInstructions("Shake with crushed ice and open pour into collins or tiki mug. " +
                        "Virgin islands rum. Garnish with orange and lime wedges");
                haiKarate.setTastingNotes("Citrusy and fruity, not boozy. Pineapple/maple taste.");
                haiKarate.addDrinkIngredient(new DrinkIngredient(lightRum, 60.0, Unit.ML));
                haiKarate.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                haiKarate.addDrinkIngredient(new DrinkIngredient(pineapple, 30.0, Unit.ML));
                haiKarate.addDrinkIngredient(new DrinkIngredient(orange, 30.0, Unit.ML));
                haiKarate.addDrinkIngredient(new DrinkIngredient(mapleSyrup, 5.0, Unit.ML));
                haiKarate.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                haiKarate.addTag(Tag.TRIED);
                realm.copyToRealmOrUpdate(haiKarate);

                Drink halekulani = new Drink();
                halekulani.setName("Halekulani");
                halekulani.setInstructions("Shake and double strain into coupe. Garnish with edible blossom");
                halekulani.addDrinkIngredient(new DrinkIngredient(bourbon, 45.0, Unit.ML));
                halekulani.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                halekulani.addDrinkIngredient(new DrinkIngredient(orange, 15.0, Unit.ML));
                halekulani.addDrinkIngredient(new DrinkIngredient(pineapple, 15.0, Unit.ML));
                halekulani.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 7.5, Unit.ML));
                halekulani.addDrinkIngredient(new DrinkIngredient(grenadine, 2.5, Unit.ML));
                halekulani.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                halekulani.addTag(Tag.TIKI);
                halekulani.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(halekulani);

                Drink hankyPanky = new Drink();
                hankyPanky.setName("Hanky Panky");
                hankyPanky.setInstructions("Stir and double strain into chilled coupe.");
                hankyPanky.addDrinkIngredient(new DrinkIngredient(gin, 45.0, Unit.ML));
                hankyPanky.addDrinkIngredient(new DrinkIngredient(redVermouth, 45.0, Unit.ML));
                hankyPanky.addDrinkIngredient(new DrinkIngredient(fernetBranca, 2.0, Unit.DASH));
                hankyPanky.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(hankyPanky);

                Drink harvard = new Drink();
                harvard.setName("Harvard");
                harvard.setInstructions("Shake and double strain int ochilled coupe.");
                harvard.addDrinkIngredient(new DrinkIngredient(cognac, 60.0, Unit.ML));
                harvard.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                harvard.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                harvard.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(harvard);

                Drink hemingwayDaiquri = new Drink();
                hemingwayDaiquri.setName("Hemingway Daiquri");
                hemingwayDaiquri.setInstructions("Shake and double strain into chilled coupe. Havana Club 3 and white grapefruit preferred.");
                hemingwayDaiquri.setVariations("Try it with lightly aged rum.");
                hemingwayDaiquri.addDrinkIngredient(new DrinkIngredient(whiteRum, 60.0, Unit.ML));
                hemingwayDaiquri.addDrinkIngredient(new DrinkIngredient(grapefruit, 30.0, Unit.ML));
                hemingwayDaiquri.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                hemingwayDaiquri.addDrinkIngredient(new DrinkIngredient(maraschinoLiqueur, 7.5, Unit.ML));
                hemingwayDaiquri.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(hemingwayDaiquri);

                Drink honeySuckle = new Drink();
                honeySuckle.setName("Honeysuckle");
                honeySuckle.setInstructions("Shake and double strain into coupe. 2:1 honey suryp.");
                honeySuckle.addDrinkIngredient(new DrinkIngredient(darkRum, 50.0, Unit.ML));
                honeySuckle.addDrinkIngredient(new DrinkIngredient(honeySuryp, 20.0, Unit.ML));
                honeySuckle.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                honeySuckle.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(honeySuckle);

                Drink hotToddy = new Drink();
                hotToddy.setName("Hot Toddy");
                hotToddy.setInstructions("Stir in hot mug or heat proof glass, top with hot water.");
                hotToddy.addDrinkIngredient(new DrinkIngredient(scotch, 45.0, Unit.ML));
                hotToddy.addDrinkIngredient(new DrinkIngredient(honeySuryp, 30.0, Unit.ML));
                hotToddy.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                hotToddy.addDrinkIngredient(new DrinkIngredient(allspiceDram, 5.0, Unit.ML));
                hotToddy.addTag(Tag.NOT_TRIED);
                hotToddy.addTag(Tag.HOT);
                realm.copyToRealmOrUpdate(hotToddy);

                Drink hurricane = new Drink();
                hurricane.setName("Hurricane");
                hurricane.setInstructions("Shake with 12 oz ice and 4-5 ice cubes, pour into hurricane glass. Black blended rum (Jamaican)");
                hurricane.setTastingNotes("Sweet and strong.");
                hurricane.addDrinkIngredient(new DrinkIngredient(darkRum, 120.0, Unit.ML));
                hurricane.addDrinkIngredient(new DrinkIngredient(passionFruitSyrup, 60.0, Unit.ML));
                hurricane.addDrinkIngredient(new DrinkIngredient(lemon, 60.0, Unit.ML));
                hurricane.addTag(Tag.TRIED);
                hurricane.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(hurricane);

                Drink improvedPinaColada = new Drink();
                improvedPinaColada.setName("Improved Pina Colada");
                improvedPinaColada.setDescription("By Rachel Maddow");
                improvedPinaColada.setInstructions("Shake with crushed ice and pour inte double old fashioned. Garnish with pineapple wedge.");
                improvedPinaColada.addDrinkIngredient(new DrinkIngredient(whiteRum, 45.0, Unit.ML));
                improvedPinaColada.addDrinkIngredient(new DrinkIngredient(lightRum, 30.0, Unit.ML));
                improvedPinaColada.addDrinkIngredient(new DrinkIngredient(coconutMilk, 45.0, Unit.ML));
                improvedPinaColada.addDrinkIngredient(new DrinkIngredient(orgeat, 45.0, Unit.ML));
                improvedPinaColada.addDrinkIngredient(new DrinkIngredient(pineapple, 120.0, Unit.ML));
                improvedPinaColada.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(improvedPinaColada);

                Drink improvedWhiskeyCocktail = new Drink();
                improvedWhiskeyCocktail.setName("Improved Whiskey Cocktail");
                improvedWhiskeyCocktail.setInstructions("Build in old fashioned, express orange peel and drop in.");
                improvedWhiskeyCocktail.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                improvedWhiskeyCocktail.addDrinkIngredient(new DrinkIngredient(maraschinoLiqueur, 7.5, Unit.ML));
                improvedWhiskeyCocktail.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 7.5, Unit.ML));
                improvedWhiskeyCocktail.addDrinkIngredient(new DrinkIngredient(absinthe, 1.0, Unit.DASH));
                improvedWhiskeyCocktail.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                improvedWhiskeyCocktail.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                improvedPinaColada.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(improvedWhiskeyCocktail);

                Drink islandOfMartinique = new Drink();
                islandOfMartinique.setName("Island of Martinique");
                islandOfMartinique.setInstructions("Shake and double strain into coupe. Rhum Agricole Vieux. 2:1 Honey Syrup.");
                islandOfMartinique.addDrinkIngredient(new DrinkIngredient(darkRum, 45.0, Unit.ML));
                islandOfMartinique.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                islandOfMartinique.addDrinkIngredient(new DrinkIngredient(falernum, 15.0, Unit.ML));
                islandOfMartinique.addDrinkIngredient(new DrinkIngredient(honeySuryp, 7.5, Unit.ML));
                islandOfMartinique.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                islandOfMartinique.addTag(Tag.NOT_TRIED);
                islandOfMartinique.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(islandOfMartinique);

                Drink italianGentleman = new Drink();
                italianGentleman.setName("Italian Gentleman");
                italianGentleman.setInstructions("Shake and double strain into coupe. Garnish with lemon wheel.");
                italianGentleman.addDrinkIngredient(new DrinkIngredient(bourbon, 45.0, Unit.ML));
                italianGentleman.addDrinkIngredient(new DrinkIngredient(campari, 45.0, Unit.ML));
                italianGentleman.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                italianGentleman.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 7.5, Unit.ML));
                italianGentleman.addDrinkIngredient(new DrinkIngredient(orangeBitters, 2.0, Unit.DASH));
                italianGentleman.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(italianGentleman);

                Drink iukasGrog = new Drink();
                iukasGrog.setName("Iuka's Grog");
                iukasGrog.setInstructions("Shake and double strain into coupe.");
                iukasGrog.addDrinkIngredient(new DrinkIngredient(darkRum, 40.0, Unit.ML));
                iukasGrog.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                iukasGrog.addDrinkIngredient(new DrinkIngredient(pineapple, 20.0, Unit.ML));
                iukasGrog.addDrinkIngredient(new DrinkIngredient(passionFruitSyrup, 15.0, Unit.ML));
                iukasGrog.addTag(Tag.NOT_TRIED);
                iukasGrog.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(iukasGrog);

                Drink japanese = new Drink();
                japanese.setName("Japanese");
                japanese.setInstructions("Shake and double strain into coupe.");
                japanese.addDrinkIngredient(new DrinkIngredient(cognac, 60.0, Unit.ML));
                japanese.addDrinkIngredient(new DrinkIngredient(orgeat, 15.0, Unit.ML));
                japanese.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                japanese.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(japanese);

                Drink joyDivision = new Drink();
                joyDivision.setName("Joy Division");
                joyDivision.setInstructions("Shake and double strain into coupe.");
                joyDivision.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                joyDivision.addDrinkIngredient(new DrinkIngredient(dryVermouth, 30.0, Unit.ML));
                joyDivision.addDrinkIngredient(new DrinkIngredient(cointreau, 15.0, Unit.ML));
                joyDivision.addDrinkIngredient(new DrinkIngredient(absinthe, 2.5, Unit.ML));
                joyDivision.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(joyDivision);

                Drink jungleBird = new Drink();
                jungleBird.setName("Jungle Bird");
                jungleBird.setInstructions("Shake with crushed ice and 4-5 ice cubes and pour into double old fashioned. " +
                        "Garnish with pineapple fronds. Black jamaican rum.");
                jungleBird.setTastingNotes("Sweet candied pineapple with funky after taste.");
                jungleBird.addDrinkIngredient(new DrinkIngredient(darkRum, 45.0, Unit.ML));
                jungleBird.addDrinkIngredient(new DrinkIngredient(pineapple, 60.0, Unit.ML));
                jungleBird.addDrinkIngredient(new DrinkIngredient(campari, 20.0, Unit.ML));
                jungleBird.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                jungleBird.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 15.0, Unit.ML));
                jungleBird.addTag(Tag.TRIED);
                jungleBird.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(jungleBird);

                Drink kafkaDoesJalisco = new Drink();
                kafkaDoesJalisco.setName("Kafka does Jalisco");
                kafkaDoesJalisco.setInstructions("Shake and double strain into coupe.");
                kafkaDoesJalisco.addDrinkIngredient(new DrinkIngredient(tequilaBianco, 30.0, Unit.ML));
                kafkaDoesJalisco.addDrinkIngredient(new DrinkIngredient(becherovka, 30.0, Unit.ML));
                kafkaDoesJalisco.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                kafkaDoesJalisco.addDrinkIngredient(new DrinkIngredient(honeySuryp, 20.0, Unit.ML));
                kafkaDoesJalisco.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(kafkaDoesJalisco);

                Drink kaiteurSwizzle = new Drink();
                kaiteurSwizzle.setName("Kaiteur Swizzle");
                kaiteurSwizzle.setInstructions("Swizzle in collins or tiki mug. Garnish with ming sprig. Demerara Rum");
                kaiteurSwizzle.setTastingNotes("Sweet and smoky.");
                kaiteurSwizzle.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                kaiteurSwizzle.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                kaiteurSwizzle.addDrinkIngredient(new DrinkIngredient(mapleSyrup, 15.0, Unit.ML));
                kaiteurSwizzle.addDrinkIngredient(new DrinkIngredient(falernum, 15.0, Unit.ML));
                kaiteurSwizzle.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                kaiteurSwizzle.addDrinkIngredient(new DrinkIngredient(mint, 1.0, Unit.SPRIG));
                kaiteurSwizzle.addTag(Tag.TRIED);
                kaiteurSwizzle.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(kaiteurSwizzle);

                Drink kentuckyBuck = new Drink();
                kentuckyBuck.setName("Kentucky Buck");
                kentuckyBuck.setInstructions("Muddle strawberry in simple suryp in collins glass then build the rest of the cocktail." +
                        " Garnish with strawberry and lemon wedge");
                kentuckyBuck.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                kentuckyBuck.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                kentuckyBuck.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 15.0, Unit.ML));
                kentuckyBuck.addDrinkIngredient(new DrinkIngredient(strawberry, 2.0, Unit.NONE));
                kentuckyBuck.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                kentuckyBuck.addDrinkIngredient(new DrinkIngredient(gingerBeer, 60.0, Unit.ML));
                kentuckyBuck.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(kentuckyBuck);

                Drink knickerbocker = new Drink();
                knickerbocker.setName("Knickerbocker");
                knickerbocker.setInstructions("Muddle raspberries in shaker and add rest of ingredients. Garnish with 3 raspberries on cocktail pick.");
                knickerbocker.addDrinkIngredient(new DrinkIngredient(darkRum, 75.0, Unit.ML));
                knickerbocker.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                knickerbocker.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 15.0, Unit.ML));
                knickerbocker.addDrinkIngredient(new DrinkIngredient(cointreau, 5.0, Unit.ML));
                knickerbocker.addDrinkIngredient(new DrinkIngredient(raspberry, 5.0, Unit.NONE));
                knickerbocker.addTag(Tag.NOT_TRIED);
                knickerbocker.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(knickerbocker);

                Drink lastOfTheOaxacans = new Drink();
                lastOfTheOaxacans.setName("Last of the Oaxacans");
                lastOfTheOaxacans.setDescription("Variation on the last word.");
                lastOfTheOaxacans.setInstructions("Shake with a slice of serrano pepper. Double strain into coupe and garnish with another pepper slice.");
                lastOfTheOaxacans.addDrinkIngredient(new DrinkIngredient(mezcal, 30.0, Unit.ML));
                lastOfTheOaxacans.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                lastOfTheOaxacans.addDrinkIngredient(new DrinkIngredient(greenChartreuse, 30.0, Unit.ML));
                lastOfTheOaxacans.addDrinkIngredient(new DrinkIngredient(maraschinoLiqueur, 30.0, Unit.ML));
                lastOfTheOaxacans.addDrinkIngredient(new DrinkIngredient(serranoPepper, 1.0, Unit.NONE));
                lastOfTheOaxacans.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(lastOfTheOaxacans);

                Drink lastWord = new Drink();
                lastWord.setName("Last Word");
                lastWord.setInstructions("Shake and double strain into coupe, garnish with lime wheel.");
                lastWord.setTastingNotes("Sweet and herbaceous with funky after taste.");
                lastWord.addDrinkIngredient(new DrinkIngredient(gin, 30.0, Unit.ML));
                lastWord.addDrinkIngredient(new DrinkIngredient(greenChartreuse, 30.0, Unit.ML));
                lastWord.addDrinkIngredient(new DrinkIngredient(maraschinoLiqueur, 30.0, Unit.ML));
                lastWord.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                lastWord.addTag(Tag.CLASSIC);
                lastWord.addTag(Tag.TRIED);
                lastWord.addTag(Tag.FAVORITE);
                realm.copyToRealmOrUpdate(lastWord);

                Drink lostLake = new Drink();
                lostLake.setName("Lost Lake");
                lostLake.setDescription("From the bar with the same name.");
                lostLake.setInstructions("Shake with crushed ice and pour into tiki mug or collins glass." +
                        "Garnish with pineapple frond, pineapple wedge, edible flower. Jamaican Run.");
                lostLake.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                lostLake.addDrinkIngredient(new DrinkIngredient(passionFruitSyrup, 20.0, Unit.ML));
                lostLake.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                lostLake.addDrinkIngredient(new DrinkIngredient(pineapple, 15.0, Unit.ML));
                lostLake.addDrinkIngredient(new DrinkIngredient(maraschinoLiqueur, 7.5, Unit.ML));
                lostLake.addDrinkIngredient(new DrinkIngredient(campari, 7.5, Unit.ML));
                lostLake.addTag(Tag.NOT_TRIED);
                lostLake.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(lostLake);

                Drink luauDaiquiri = new Drink();
                luauDaiquiri.setName("Luau Daiquiri");
                luauDaiquiri.setInstructions("Shake and double strain into coupe. Garnish with edible flower or lime wheel. ");
                luauDaiquiri.setVariations("Try it with lightly aged rum.");
                luauDaiquiri.addDrinkIngredient(new DrinkIngredient(whiteRum, 60.0, Unit.ML));
                luauDaiquiri.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                luauDaiquiri.addDrinkIngredient(new DrinkIngredient(orange, 20.0, Unit.ML));
                luauDaiquiri.addDrinkIngredient(new DrinkIngredient(vanillaSyrup, 15.0, Unit.ML));
                luauDaiquiri.addTag(Tag.TIKI);
                luauDaiquiri.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(luauDaiquiri);


                Drink maiTai = new Drink();
                maiTai.setName("Mai Tai");
                maiTai.setInstructions("Shake with crushed ice and 4-5 ice cubes. Pour into double old fashioned " +
                        "and garnish with spent lime shell and mint sprig. 30ml Jamaican Aged Rum, 30 ml Rhum Agricole Vieux.");
                maiTai.setVariations("You can experiment with different rums and ratios.");
                maiTai.setTastingNotes("Balanced sweetness, funky and slightly nutty.");
                maiTai.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                maiTai.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                maiTai.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 7.5, Unit.ML));
                maiTai.addDrinkIngredient(new DrinkIngredient(orgeat, 7.5, Unit.ML));
                maiTai.addDrinkIngredient(new DrinkIngredient(cointreau, 7.5, Unit.ML));
                maiTai.addDrinkIngredient(new DrinkIngredient(mint, 1.0, Unit.SPRIG));
                maiTai.addTag(Tag.TIKI);
                maiTai.addTag(Tag.TRIED);
                maiTai.addTag(Tag.FAVORITE);
                realm.copyToRealmOrUpdate(maiTai);

                Drink manhattan = new Drink();
                manhattan.setName("Manhattan");
                manhattan.setInstructions("Stir and strain into coupe. Express orange peel oils and drop in. Garnish with speared maraschino cherry.");
                manhattan.setTastingNotes("Spicy and herbaceous, mellow heavy taste. Strong but no distinct taste of alcohol.");
                manhattan.addDrinkIngredient(new DrinkIngredient(ryeWhiskey, 60.0, Unit.ML));
                manhattan.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                manhattan.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.ML));
                manhattan.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                manhattan.addTag(Tag.TRIED);
                manhattan.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(manhattan);

                Drink margarita = new Drink();
                margarita.setName("Margarita");
                margarita.setInstructions("Shake and strain into double old fashioned over large ice cube.Garnish with lime wedge");
                margarita.addDrinkIngredient(new DrinkIngredient(tequilaBianco, 60.0, Unit.ML));
                margarita.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                margarita.addDrinkIngredient(new DrinkIngredient(cointreau, 30.0, Unit.ML));
                margarita.addDrinkIngredient(new DrinkIngredient(salt, 1.0, Unit.DASH));
                margarita.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(margarita);

                Drink metamorphosis = new Drink();
                metamorphosis.setName("Metamorphosis");
                metamorphosis.setInstructions("Shake and double strain into coupe. 1:1 Honey Syrup.");
                metamorphosis.addDrinkIngredient(new DrinkIngredient(becherovka, 45.0, Unit.ML));
                metamorphosis.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                metamorphosis.addDrinkIngredient(new DrinkIngredient(honeySuryp, 20.0, Unit.ML));
                realm.copyToRealmOrUpdate(metamorphosis);

                Drink mezcalNegroni = new Drink();
                mezcalNegroni.setName("Mezcal Negroni");
                mezcalNegroni.setInstructions("Build in glass with large ice cube. Garnish with orange peel.");
                mezcalNegroni.setTastingNotes("Smoky and sweet with bitter aftertaste.");
                mezcalNegroni.addDrinkIngredient(new DrinkIngredient(mezcal, 30.0, Unit.ML));
                mezcalNegroni.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                mezcalNegroni.addDrinkIngredient(new DrinkIngredient(campari, 30.0, Unit.ML));
                mezcalNegroni.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                mezcalNegroni.addTag(Tag.TRIED);
                realm.copyToRealmOrUpdate(mezcalNegroni);

                Drink mintJulep = new Drink();
                mintJulep.setName("Mint Julep");
                mintJulep.setInstructions("Muddle mint and simple suryp gently in julep cup or old fashioned. Fill with bourbon and crushed ice." +
                        "garnish with mint sprig.");
                mintJulep.setTastingNotes("Fresh sweet ice cold minty bourbon,");
                mintJulep.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                mintJulep.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 60.0, Unit.ML));
                mintJulep.addDrinkIngredient(new DrinkIngredient(mint, 10.0, Unit.LEAF));
                mintJulep.addTag(Tag.CLASSIC);
                mintJulep.addTag(Tag.TRIED);
                realm.copyToRealmOrUpdate(mintJulep);

                Drink mojito = new Drink();
                mojito.setName("Mojito");
                mojito.setInstructions("Gently shake and double strain into collins glass. Top with soda. Garnish with a big sprig of mint and lime wedge");
                mojito.setVariations("Can also be built directly in the glass with crushed ice. Try it with lightly aged rum.");
                mojito.addDrinkIngredient(new DrinkIngredient(whiteRum, 60.0, Unit.ML));
                mojito.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 30.0, Unit.ML));
                mojito.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                mojito.addDrinkIngredient(new DrinkIngredient(mint, 10.0, Unit.NONE));
                mojito.addDrinkIngredient(new DrinkIngredient(sodaWater, 30.0, Unit.ML));
                mojito.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(mojito);

                Drink mrHowell = new Drink();
                mrHowell.setName("Mr Howell");
                mrHowell.setInstructions("Shake and double strain into coupe. Garnish with lime wheel.");
                mrHowell.addDrinkIngredient(new DrinkIngredient(lightRum, 45.0, Unit.ML));
                mrHowell.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                mrHowell.addDrinkIngredient(new DrinkIngredient(mapleSyrup, 20.0, Unit.ML));
                mrHowell.addDrinkIngredient(new DrinkIngredient(scotch, 15.0, Unit.ML));
                mrHowell.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(mrHowell);

                Drink mytoiGardens = new Drink();
                mytoiGardens.setName("Mytoi Gardens");
                mytoiGardens.setInstructions("Shake with crushed ice and 4-5 ice cubes. " +
                        "Pour into tiki mug or double old fashioned glass. Demerara rum (El dorado 12). " +
                        "Garnish with 3 dashes angostura and pineapple wedge.");
                mytoiGardens.addDrinkIngredient(new DrinkIngredient(darkRum, 45.0, Unit.ML));
                mytoiGardens.addDrinkIngredient(new DrinkIngredient(pineapple, 30.0, Unit.ML));
                mytoiGardens.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                mytoiGardens.addDrinkIngredient(new DrinkIngredient(allspiceDram, 15.0, Unit.ML));
                mytoiGardens.addDrinkIngredient(new DrinkIngredient(vanillaSyrup, 15.0, Unit.ML));
                mytoiGardens.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 3.0, Unit.ML));
                mytoiGardens.addTag(Tag.TIKI);
                mytoiGardens.addTag(Tag.NOT_TRIED);
                mytoiGardens.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(mytoiGardens);

                Drink noOneToPunch = new Drink();
                noOneToPunch.setName("No One To Punch");
                noOneToPunch.setInstructions("Shake with crushed ice and pour into tiki mug or collins glass. Top with soda water.");
                noOneToPunch.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                noOneToPunch.addDrinkIngredient(new DrinkIngredient(falernum, 20.0, Unit.ML));
                noOneToPunch.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                noOneToPunch.addDrinkIngredient(new DrinkIngredient(pineapple, 15.0, Unit.ML));
                noOneToPunch.addDrinkIngredient(new DrinkIngredient(orange, 15.0, Unit.ML));
                noOneToPunch.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 15.0, Unit.ML));
                noOneToPunch.addDrinkIngredient(new DrinkIngredient(allspiceDram, 5.0, Unit.ML));
                noOneToPunch.addDrinkIngredient(new DrinkIngredient(absinthe, 5.0, Unit.ML));
                noOneToPunch.addDrinkIngredient(new DrinkIngredient(sodaWater, 15.0, Unit.ML));
                noOneToPunch.addTag(Tag.NOT_TRIED);
                noOneToPunch.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(noOneToPunch);

                Drink oaxacanOldFashioned = new Drink();
                oaxacanOldFashioned.setName("Oaxacan Old Fashioned");
                oaxacanOldFashioned.setInstructions("Build in old fashioned glass.");
                oaxacanOldFashioned.addDrinkIngredient(new DrinkIngredient(tequilaResposado, 45.0, Unit.ML));
                oaxacanOldFashioned.addDrinkIngredient(new DrinkIngredient(mezcal, 15.0, Unit.ML));
                oaxacanOldFashioned.addDrinkIngredient(new DrinkIngredient(agaveSyrup, 5.0, Unit.ML));
                oaxacanOldFashioned.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                oaxacanOldFashioned.addDrinkIngredient(new DrinkIngredient(orangeBitters, 1.0, Unit.DASH));
                oaxacanOldFashioned.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                oaxacanOldFashioned.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(oaxacanOldFashioned);

                Drink oaxacanite = new Drink();
                oaxacanite.setName("Oaxacanite");
                oaxacanite.setInstructions("Shake (with grapefruit peel) and double strain into coupe");
                oaxacanite.addDrinkIngredient(new DrinkIngredient(mezcal, 30.0, Unit.ML));
                oaxacanite.addDrinkIngredient(new DrinkIngredient(tequilaBianco, 30.0, Unit.ML));
                oaxacanite.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                oaxacanite.addDrinkIngredient(new DrinkIngredient(honeySuryp, 20.0, Unit.ML));
                oaxacanite.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 3.0, Unit.ML));
                oaxacanite.addDrinkIngredient(new DrinkIngredient(grapefruit, 1.0, Unit.PEEL));
                oaxacanite.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(oaxacanite);

                Drink painkiller = new Drink();
                painkiller.setName("Painkiller");
                painkiller.setInstructions("Shake with crushed ice and pour into tiki mug. " +
                        "Grate cinnamon and nutmeg. Garnish with cinnamon stick in orange wheel." +
                        " Jamaican aged rum and Medium bodied virgin islands rum. ");
                painkiller.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                painkiller.addDrinkIngredient(new DrinkIngredient(pineapple, 120.0, Unit.ML));
                painkiller.addDrinkIngredient(new DrinkIngredient(orange, 30.0, Unit.ML));
                painkiller.addDrinkIngredient(new DrinkIngredient(coconutCream, 30.0, Unit.ML));
                painkiller.addDrinkIngredient(new DrinkIngredient(nutmeg, 1.0, Unit.DASH));
                painkiller.addDrinkIngredient(new DrinkIngredient(cinnamon, 1.0, Unit.DASH));
                painkiller.addTag(Tag.NOT_TRIED);
                painkiller.addTag(Tag.TIKI);
                painkiller.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(painkiller);

                Drink pataPunch = new Drink();
                pataPunch.setName("Pata Punch");
                pataPunch.setInstructions("Shake with crushed ice and 4-5 ice cubes and pour into tiki mug or collins glass. Garnish with mint sprig." +
                        "Lightly aged virgin islands rum and aged jamaican rum. ");
                pataPunch.setTastingNotes("Sweet orange/pineapple forward. Fruity easy drinker.");
                pataPunch.addDrinkIngredient(new DrinkIngredient(darkRum, 30.0, Unit.ML));
                pataPunch.addDrinkIngredient(new DrinkIngredient(lightRum, 30.0, Unit.ML));
                pataPunch.addDrinkIngredient(new DrinkIngredient(lemon, 30.0, Unit.ML));
                pataPunch.addDrinkIngredient(new DrinkIngredient(orange, 60.0, Unit.ML));
                pataPunch.addDrinkIngredient(new DrinkIngredient(pineapple, 30.0, Unit.ML));
                pataPunch.addDrinkIngredient(new DrinkIngredient(cointreau, 15.0, Unit.ML));
                pataPunch.addDrinkIngredient(new DrinkIngredient(grenadine, 7.5, Unit.ML));
                pataPunch.addDrinkIngredient(new DrinkIngredient(mint, 1.0, Unit.SPRIG));
                pataPunch.addTag(Tag.TRIED);
                realm.copyToRealmOrUpdate(pataPunch);

                Drink peguClub = new Drink();
                peguClub.setName("Pegu Club");
                peguClub.setInstructions("Stir and strain into coupe. Garnish with lime twist.");
                peguClub.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                peguClub.addDrinkIngredient(new DrinkIngredient(cointreau, 20.0, Unit.ML));
                peguClub.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                peguClub.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                peguClub.addDrinkIngredient(new DrinkIngredient(orangeBitters, 1.0, Unit.DASH));
                peguClub.addTag(Tag.NOT_TRIED);
                peguClub.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(peguClub);

                Drink plantersPunch = new Drink();
                plantersPunch.setName("Planter's Punch (Trader Vic's)");
                plantersPunch.setInstructions("Shake with crushed ice and 4-5 ice cubes and open pour into collins glass. Optionally" +
                        "top with soda water." +
                        "Jamaican rum.");
                plantersPunch.addDrinkIngredient(new DrinkIngredient(darkRum, 90.0, Unit.ML));
                plantersPunch.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                plantersPunch.addDrinkIngredient(new DrinkIngredient(darkRum, 15.0, Unit.ML));
                plantersPunch.addDrinkIngredient(new DrinkIngredient(grenadine, 15.0, Unit.ML));
                plantersPunch.addDrinkIngredient(new DrinkIngredient(sugar, 5.0, Unit.ML));
                plantersPunch.addDrinkIngredient(new DrinkIngredient(sodaWater, 15.0, Unit.ML));
                plantersPunch.addTag(Tag.NOT_TRIED);
                plantersPunch.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(plantersPunch);

                Drink ponche = new Drink();
                ponche.setName("Ponche");
                ponche.setInstructions("Shake with crushed ice nad 4-5 ice cubes. Pour into tiki mug or double old fashioned glass.");
                ponche.addDrinkIngredient(new DrinkIngredient(tequilaBianco, 60.0, Unit.ML));
                ponche.addDrinkIngredient(new DrinkIngredient(lemon, 30.0, Unit.ML));
                ponche.addDrinkIngredient(new DrinkIngredient(vanillaSyrup, 15.0, Unit.ML));
                ponche.addDrinkIngredient(new DrinkIngredient(passionFruitSyrup, 15.0, Unit.ML));
                ponche.addDrinkIngredient(new DrinkIngredient(pineapple, 30.0, Unit.ML));
                ponche.addTag(Tag.NOT_TRIED);

                Drink portLight = new Drink();
                portLight.setName("Port Light");
                portLight.setInstructions("Dry shake, add crushed ice and 4-5 ice cubes. Open pour into double old fashioned. 1:1 honey syrup");
                portLight.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                portLight.addDrinkIngredient(new DrinkIngredient(lemon, 30.0, Unit.ML));
                portLight.addDrinkIngredient(new DrinkIngredient(passionFruitSyrup, 15.0, Unit.ML));
                portLight.addDrinkIngredient(new DrinkIngredient(honeySuryp, 20.0, Unit.ML));
                portLight.addDrinkIngredient(new DrinkIngredient(eggWhite, 1.0, Unit.NONE));
                portLight.addTag(Tag.TRIED);
                portLight.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(portLight);

                Drink pupule = new Drink();
                pupule.setName("Pupule");
                pupule.setInstructions("Shake with crushed ice and 4-5 ice cubes. Open pour into footed pilsner. Garnish with mint sprig. Zacapa 23");
                pupule.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                pupule.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                pupule.addDrinkIngredient(new DrinkIngredient(orange, 20.0, Unit.ML));
                pupule.addDrinkIngredient(new DrinkIngredient(cinnamonSyrup, 7.5, Unit.ML));
                pupule.addDrinkIngredient(new DrinkIngredient(vanillaSyrup, 7.5, Unit.ML));
                pupule.addDrinkIngredient(new DrinkIngredient(allspiceDram, 7.5, Unit.ML));
                pupule.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                pupule.addDrinkIngredient(new DrinkIngredient(mint, 1.0, Unit.SPRIG));
                realm.copyToRealmOrUpdate(pupule);

                Drink queensParkSwizzle = new Drink();
                queensParkSwizzle.setName("Queen's Park Swizzle");
                queensParkSwizzle.setInstructions("Muddle mint and syrup in footed pilsner, Fill with rest of ingredients" +
                        " float angostura bitters and garnish with mint sprig.");
                queensParkSwizzle.setTastingNotes("Sweet and spicy, minty finish.");
                queensParkSwizzle.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                queensParkSwizzle.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                queensParkSwizzle.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 15.0, Unit.ML));
                queensParkSwizzle.addDrinkIngredient(new DrinkIngredient(mint, 2.0, Unit.SPRIG));
                queensParkSwizzle.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                queensParkSwizzle.addTag(Tag.TIKI);
                queensParkSwizzle.addTag(Tag.TRIED);
                realm.copyToRealmOrUpdate(queensParkSwizzle);

                Drink ramosGinFizz = new Drink();
                ramosGinFizz.setName("Ramos Gin Fizz");
                ramosGinFizz.setInstructions("");
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 20.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(heavyCream, 30.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(eggWhite, 1.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(orangeFlowerWater, 3.0, Unit.DROP));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(sodaWater, 30.0, Unit.ML));
                ramosGinFizz.addTag(Tag.NOT_TRIED);
                ramosGinFizz.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(ramosGinFizz);

                Drink royalBermudaYachtClub = new Drink();
                royalBermudaYachtClub.setName("Royal Bermuda Yacht Club");
                royalBermudaYachtClub.setInstructions("Shake and double strain into coupe. Barbados rum.");
                royalBermudaYachtClub.setTastingNotes("Ginger and orange taste.");
                royalBermudaYachtClub.addDrinkIngredient(new DrinkIngredient(darkRum, 45.0, Unit.ML));
                royalBermudaYachtClub.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                royalBermudaYachtClub.addDrinkIngredient(new DrinkIngredient(falernum, 15.0, Unit.ML));
                royalBermudaYachtClub.addDrinkIngredient(new DrinkIngredient(cointreau, 7.5, Unit.ML));
                royalBermudaYachtClub.addTag(Tag.TRIED);
                realm.copyToRealmOrUpdate(royalBermudaYachtClub);

                Drink royalHawaiian = new Drink();
                royalHawaiian.setName("Royal Hawaiian");
                royalHawaiian.setInstructions("Shake and double strain into coupe.");
                royalHawaiian.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                royalHawaiian.addDrinkIngredient(new DrinkIngredient(pineapple, 30.0, Unit.ML));
                royalHawaiian.addDrinkIngredient(new DrinkIngredient(lemon, 15.0, Unit.ML));
                royalHawaiian.addDrinkIngredient(new DrinkIngredient(orgeat, 20.0, Unit.ML));
                royalHawaiian.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(royalHawaiian);

                Drink saturn = new Drink();
                saturn.setName("Saturn");
                saturn.setInstructions("Shake and double strain into coupe. garnish with orange peel ring.");
                saturn.addDrinkIngredient(new DrinkIngredient(gin, 37.5, Unit.ML));
                saturn.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                saturn.addDrinkIngredient(new DrinkIngredient(passionFruitSyrup, 15.0, Unit.ML));
                saturn.addDrinkIngredient(new DrinkIngredient(orgeat, 7.5, Unit.ML));
                saturn.addDrinkIngredient(new DrinkIngredient(falernum, 7.5, Unit.ML));
                saturn.addTag(Tag.TIKI);
                saturn.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(saturn);

                //SAZERAC

                Drink scorpion = new Drink();
                scorpion.setName("Scorpion");
                scorpion.setInstructions("Shake with crushed ice and 4-5 ice cubes and pour into large snifter.");
                scorpion.addDrinkIngredient(new DrinkIngredient(lightRum, 60.0, Unit.ML));
                scorpion.addDrinkIngredient(new DrinkIngredient(cognac, 30.0, Unit.ML));
                scorpion.addDrinkIngredient(new DrinkIngredient(orange, 60.0, Unit.ML));
                scorpion.addDrinkIngredient(new DrinkIngredient(lemon, 45.0, Unit.ML));
                scorpion.addDrinkIngredient(new DrinkIngredient(orgeat, 15.0, Unit.ML));
                scorpion.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(scorpion);

                Drink scorpionReef = new Drink();
                scorpionReef.setName("Scorpion Reef");
                scorpionReef.setInstructions("Swizzle in stemless wine glass. float angostura bitters and sprinkle five spice powder. Jamaican Rum");
                scorpionReef.setTastingNotes("Smoky pineapple taste.");
                scorpionReef.addDrinkIngredient(new DrinkIngredient(mezcal, 30.0, Unit.ML));
                scorpionReef.addDrinkIngredient(new DrinkIngredient(darkRum, 30.0, Unit.ML));
                scorpionReef.addDrinkIngredient(new DrinkIngredient(pineapple, 30.0, Unit.ML));
                scorpionReef.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                scorpionReef.addDrinkIngredient(new DrinkIngredient(orgeat, 20.0, Unit.ML));
                scorpionReef.addDrinkIngredient(new DrinkIngredient(chocolateBitters, 2.0, Unit.DASH));
                scorpionReef.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 6.0, Unit.DASH));
                scorpionReef.addTag(Tag.TRIED);
                realm.copyToRealmOrUpdate(scorpionReef);

                Drink sidecar = new Drink();
                sidecar.setName("Sidecar");
                sidecar.setInstructions("Shake and double strain into coupe. Optionally rim glass with sugar.");
                sidecar.setVariations("Optionally add 7.5 ml simple suryp.");
                sidecar.addDrinkIngredient(new DrinkIngredient(cognac, 60.0, Unit.ML));
                sidecar.addDrinkIngredient(new DrinkIngredient(cointreau, 20.0, Unit.ML));
                sidecar.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                sidecar.addTag(Tag.NOT_TRIED);
                sidecar.addTag(Tag.TRY_SOON);
                sidecar.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(sidecar);

                Drink sidewindersFang = new Drink();
                sidewindersFang.setName("Sidewinder's Fang");
                sidewindersFang.setInstructions("Shake with crushed ice and 4-5 ice cubes, open pour" +
                        " into large snifter and top with soda water. Garnish with orange snake." +
                        "30 ml Black Blended Rum, 30 ml Blended Aged Rum (Demerara)");
                sidewindersFang.setTastingNotes("Fruity orange/passion  followed by smoke from the demerara rum.");
                sidewindersFang.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                sidewindersFang.addDrinkIngredient(new DrinkIngredient(passionFruitSyrup, 45.0, Unit.ML));
                sidewindersFang.addDrinkIngredient(new DrinkIngredient(lime, 45.0, Unit.ML));
                sidewindersFang.addDrinkIngredient(new DrinkIngredient(orange, 45.0, Unit.ML));
                sidewindersFang.addDrinkIngredient(new DrinkIngredient(sodaWater, 90.0, Unit.ML));
                sidewindersFang.addTag(Tag.TRIED);
                sidewindersFang.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(sidewindersFang);

                Drink southside = new Drink();
                southside.setName("Southside");
                southside.setInstructions("Shake and double strain into coupe. Garnish with lime wheel.");
                southside.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                southside.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 20.0, Unit.ML));
                southside.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                southside.addDrinkIngredient(new DrinkIngredient(mint, 8.0, Unit.LEAF));
                southside.addTag(Tag.NOT_TRIED);
                southside.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(southside);

                Drink strangeWeaver = new Drink();
                strangeWeaver.setName("Strange Weaver");
                strangeWeaver.setInstructions("Shake with crushed ice and pour into old fashioned. Garnish with grated orange zest.");
                strangeWeaver.addDrinkIngredient(new DrinkIngredient(darkRum, 30.0, Unit.ML));
                strangeWeaver.addDrinkIngredient(new DrinkIngredient(gin, 30.0, Unit.ML));
                strangeWeaver.addDrinkIngredient(new DrinkIngredient(redVermouth, 20.0, Unit.ML));
                strangeWeaver.addDrinkIngredient(new DrinkIngredient(campari, 15.0, Unit.ML));
                strangeWeaver.addDrinkIngredient(new DrinkIngredient(lemon, 7.5, Unit.ML));
                strangeWeaver.addDrinkIngredient(new DrinkIngredient(orgeat, 15.0, Unit.ML));
                strangeWeaver.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(strangeWeaver);

                Drink swizzleFrancais = new Drink();
                swizzleFrancais.setName("Swizzle Francais");
                swizzleFrancais.setInstructions("Swizzle in tiki mug or footed pilsner. Top with ice and ground nutmeg. Rhum Agricole vieux");
                swizzleFrancais.setTastingNotes("Smooth with butter/caramel taste, hint of allspice.");
                swizzleFrancais.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                swizzleFrancais.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 15.0, Unit.ML));
                swizzleFrancais.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                swizzleFrancais.addDrinkIngredient(new DrinkIngredient(allspiceDram, 7.5, Unit.ML));
                swizzleFrancais.addDrinkIngredient(new DrinkIngredient(nutmeg, 1.0, Unit.DASH));
                swizzleFrancais.addTag(Tag.TRIED);
                swizzleFrancais.addTag(Tag.TIKI);
                realm.copyToRealmOrUpdate(swizzleFrancais);

                Drink testPilot = new Drink();
                testPilot.setName("Test Pilot");
                testPilot.setInstructions("Shake with crushed ice and 4-5 ice cubes. Pour into double old fashioned glass. " +
                        "Aged Jamaican Rum, Lightly aged virgin islands rum.");
                testPilot.addDrinkIngredient(new DrinkIngredient(darkRum, 45.0, Unit.ML));
                testPilot.addDrinkIngredient(new DrinkIngredient(lightRum, 15.0, Unit.ML));
                testPilot.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                testPilot.addDrinkIngredient(new DrinkIngredient(falernum, 15.0, Unit.ML));
                testPilot.addDrinkIngredient(new DrinkIngredient(cointreau, 15.0, Unit.ML));
                testPilot.addDrinkIngredient(new DrinkIngredient(absinthe, 6.0, Unit.DROP));
                testPilot.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                testPilot.addTag(Tag.TIKI);
                testPilot.addTag(Tag.NOT_TRIED);
                testPilot.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(testPilot);

                Drink theBennet = new Drink();
                theBennet.setName("The Bennet");
                theBennet.setInstructions("Shake and double strain into coupe. Garnish with lime wheel.");
                theBennet.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                theBennet.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                theBennet.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 20.0, Unit.ML));
                theBennet.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                theBennet.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(theBennet);

                Drink theCariocaHawaiianCocktail = new Drink();
                theCariocaHawaiianCocktail.setName("The Carioca Hawaiian Cocktail");
                theCariocaHawaiianCocktail.setInstructions("Shake and double strain into coupe. Lightly aged virgin islands rum.");
                theCariocaHawaiianCocktail.addDrinkIngredient(new DrinkIngredient(lightRum, 45.0, Unit.ML));
                theCariocaHawaiianCocktail.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                theCariocaHawaiianCocktail.addDrinkIngredient(new DrinkIngredient(pineapple, 30.0, Unit.ML));
                theCariocaHawaiianCocktail.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 5.0, Unit.ML));
                theCariocaHawaiianCocktail.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                theCariocaHawaiianCocktail.addTag(Tag.NOT_TRIED);

                Drink theGreatPretender = new Drink();
                theGreatPretender.setName("The Great Pretender");
                theGreatPretender.setInstructions("Shake and double strain into coupe. Aged Jamaican Rum.");
                theGreatPretender.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                theGreatPretender.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                theGreatPretender.addDrinkIngredient(new DrinkIngredient(pineapple, 15.0, Unit.ML));
                theGreatPretender.addDrinkIngredient(new DrinkIngredient(vanillaSyrup, 15.0, Unit.ML));
                theGreatPretender.addDrinkIngredient(new DrinkIngredient(cinnamonSyrup, 7.5, Unit.ML));
                theGreatPretender.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(theGreatPretender);

                Drink theJasmine = new Drink();
                theJasmine.setName("The Jasmine");
                theJasmine.setInstructions("Shake and double strain into coupe.");
                theJasmine.setTastingNotes("Tart and strong, grapefruity.");
                theJasmine.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                theJasmine.addDrinkIngredient(new DrinkIngredient(lemon, 30.0, Unit.ML));
                theJasmine.addDrinkIngredient(new DrinkIngredient(campari, 10.0, Unit.ML));
                theJasmine.addDrinkIngredient(new DrinkIngredient(cointreau, 10.0, Unit.ML));
                theJasmine.addTag(Tag.TRIED);
                realm.copyToRealmOrUpdate(theJasmine);

                Drink theSufferingBastard = new Drink();
                theSufferingBastard.setName("The Suffering Bastard");
                theSufferingBastard.setInstructions("Shake with crushed ice and ice cubes. Pour into double old fashioned. Top with soda and garnish with mint.");
                theSufferingBastard.addDrinkIngredient(new DrinkIngredient(gin, 30.0, Unit.ML));
                theSufferingBastard.addDrinkIngredient(new DrinkIngredient(cognac, 30.0, Unit.ML));
                theSufferingBastard.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                theSufferingBastard.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 7.5, Unit.ML));
                theSufferingBastard.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                theSufferingBastard.addDrinkIngredient(new DrinkIngredient(gingerBeer, 120.0, Unit.ML));
                theSufferingBastard.addDrinkIngredient(new DrinkIngredient(mint, 1.0, Unit.SPRIG));
                theSufferingBastard.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(theSufferingBastard);

                Drink threeDotsAndADash = new Drink();
                threeDotsAndADash.setName("Three Dots and a Dash");
                threeDotsAndADash.setInstructions("Shake with crushed ice and 4-5 ice cubes. Pour into footed pilsner." +
                        "Garnish with three maraschino cherries and a pineapple wedge." +
                        " 45 ml Rhum agricole vieux, 15 ml demerara rum 1:1 honey syrup. ");
                threeDotsAndADash.setTastingNotes("Initially spicy with allspice and ginger, then goes into a grassy funky rum taste.");
                threeDotsAndADash.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                threeDotsAndADash.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                threeDotsAndADash.addDrinkIngredient(new DrinkIngredient(orange, 15.0, Unit.ML));
                threeDotsAndADash.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                threeDotsAndADash.addDrinkIngredient(new DrinkIngredient(honeySuryp, 15.0, Unit.ML));
                threeDotsAndADash.addDrinkIngredient(new DrinkIngredient(falernum, 7.5, Unit.ML));
                threeDotsAndADash.addDrinkIngredient(new DrinkIngredient(allspiceDram, 7.5, Unit.ML));
                threeDotsAndADash.addTag(Tag.TRIED);
                realm.copyToRealmOrUpdate(threeDotsAndADash);

                Drink tiPunch = new Drink();
                tiPunch.setName("Ti' Punch");
                tiPunch.setInstructions("Muddle lime coin (with pith), demerara sugar and simple syrup in old fashioned glass. Add Rhum Agricole.");
                tiPunch.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                tiPunch.addDrinkIngredient(new DrinkIngredient(sugar, 5.0, Unit.ML));
                tiPunch.addDrinkIngredient(new DrinkIngredient(lime, 1.0, Unit.PEEL));
                tiPunch.addTag(Tag.NOT_TRIED);
                tiPunch.addTag(Tag.TRY_SOON);
                realm.copyToRealmOrUpdate(tiPunch);

                Drink tommysMargarita = new Drink();
                tommysMargarita.setName("Tommy's Margarita");
                tommysMargarita.setInstructions("Shake and double strain into old fashioned with big ice cube. Garnish with lime wheel.");
                tommysMargarita.addDrinkIngredient(new DrinkIngredient(tequilaBianco, 60.0, Unit.ML));
                tommysMargarita.addDrinkIngredient(new DrinkIngredient(lime, 60.0, Unit.ML));
                tommysMargarita.addDrinkIngredient(new DrinkIngredient(agaveSyrup, 15.0, Unit.ML));

                Drink tradeWindsNegroni = new Drink();
                tradeWindsNegroni.setName("Tradewind's Negroni");
                tradeWindsNegroni.setInstructions("Build in old fashioned glass with big ice cube and garnish with orange peel.");
                tradeWindsNegroni.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 20.0, Unit.ML));
                tradeWindsNegroni.addDrinkIngredient(new DrinkIngredient(cointreau, 20.0, Unit.ML));
                tradeWindsNegroni.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                tradeWindsNegroni.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(tradeWindsNegroni);

                Drink vampiresFang = new Drink();
                vampiresFang.setName("Vampire's Fang");
                vampiresFang.setInstructions("Shake with crushed ice and pour into old fashioned glass. Float bitters. " +
                        "Garnish with orange peel carved to look like vampires teeth.");
                vampiresFang.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                vampiresFang.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                vampiresFang.addDrinkIngredient(new DrinkIngredient(passionFruit, 20.0, Unit.ML));
                vampiresFang.addDrinkIngredient(new DrinkIngredient(orange, 15.0, Unit.ML));
                vampiresFang.addDrinkIngredient(new DrinkIngredient(cinnamonSyrup, 20.0, Unit.ML));
                vampiresFang.addDrinkIngredient(new DrinkIngredient(absinthe, 5.0, Unit.ML));
                vampiresFang.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 5.0, Unit.DASH));
                vampiresFang.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(vampiresFang);

                Drink vendetta = new Drink();
                vendetta.setName("Vendetta");
                vendetta.setInstructions("Shake with crushed ice and strain into highball or collins. Garnish with lime wedge.");
                vendetta.addDrinkIngredient(new DrinkIngredient(tequilaBianco, 60.0, Unit.ML));
                vendetta.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                vendetta.addDrinkIngredient(new DrinkIngredient(orange, 20.0, Unit.ML));
                vendetta.addDrinkIngredient(new DrinkIngredient(allspiceDram, 7.5, Unit.ML));
                vendetta.addDrinkIngredient(new DrinkIngredient(vanillaSyrup, 7.5, Unit.ML));
                vendetta.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 7.5, Unit.ML));
                vendetta.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                vendetta.addDrinkIngredient(new DrinkIngredient(absinthe, 8.0, Unit.DROP));
                realm.copyToRealmOrUpdate(vendetta);

                Drink wardEight = new Drink();
                wardEight.setName("Ward Eight");
                wardEight.setInstructions("Shake and double strain into coupe.");
                wardEight.addDrinkIngredient(new DrinkIngredient(ryeWhiskey, 60.0, Unit.ML));
                wardEight.addDrinkIngredient(new DrinkIngredient(grenadine, 15.0, Unit.ML));
                wardEight.addDrinkIngredient(new DrinkIngredient(lemon, 15.0, Unit.ML));
                wardEight.addDrinkIngredient(new DrinkIngredient(orange, 15.0, Unit.ML));
                wardEight.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(wardEight);

                Drink wheelInTheSky = new Drink();
                wheelInTheSky.setName("Wheel In the Sky");
                wheelInTheSky.setInstructions("Shake with crushed ice and pour inte highball or collins. top with soda. 1:1 honey syrup.");
                wheelInTheSky.addDrinkIngredient(new DrinkIngredient(tequilaBianco, 60.0, Unit.ML));
                wheelInTheSky.addDrinkIngredient(new DrinkIngredient(honeySuryp, 15.0, Unit.ML));
                wheelInTheSky.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                wheelInTheSky.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.ML));
                wheelInTheSky.addDrinkIngredient(new DrinkIngredient(absinthe, 10.0, Unit.DROP));
                wheelInTheSky.addDrinkIngredient(new DrinkIngredient(sodaWater, 60.0, Unit.ML));
                realm.copyToRealmOrUpdate(wheelInTheSky);

                Drink whiskeySour = new Drink();
                whiskeySour.setName("Whiskey Sour");
                whiskeySour.setInstructions("Shake and double strain into coupe. Garnish with 4 drops bitters.");
                whiskeySour.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                whiskeySour.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                whiskeySour.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 15.0, Unit.ML));
                whiskeySour.addDrinkIngredient(new DrinkIngredient(eggWhite, 1.0, Unit.NONE));
                whiskeySour.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 4.0, Unit.DROP));
                whiskeySour.addTag(Tag.CLASSIC);
                whiskeySour.addTag(Tag.TRIED);
                whiskeySour.addTag(Tag.FAVORITE);
                realm.copyToRealmOrUpdate(whiskeySour);

                Drink whiteLady = new Drink();
                whiteLady.setName("White Lady");
                whiteLady.setInstructions("Shake and double strain into coupe. Garnish with lemon peel.");
                whiteLady.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                whiteLady.addDrinkIngredient(new DrinkIngredient(cointreau, 15.0, Unit.ML));
                whiteLady.addDrinkIngredient(new DrinkIngredient(lemon, 15.0, Unit.ML));
                whiteLady.addTag(Tag.NOT_TRIED);
                realm.copyToRealmOrUpdate(whiteLady);
            }
        });
    }

    public void insertBasicData() {
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
                realm.copyToRealmOrUpdate(redVermouth);

                Ingredient campari =
                        new Ingredient("Campari", "Bitter herbal liqueur.", IngredientType.BITTER);
                realm.copyToRealmOrUpdate(campari);

                Ingredient orange =
                        new Ingredient("Orange", "Citrus.", IngredientType.CITRUS);
                realm.copyToRealmOrUpdate(orange);

                Ingredient lemon =
                        new Ingredient("Lemon", "Citrus,", IngredientType.CITRUS);
                realm.copyToRealmOrUpdate(lemon);
                Ingredient gin =
                        new Ingredient("Gin", "Spirit flavored with juniper and other spices.",
                                IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(gin);
                Ingredient allspiceDram =
                        new Ingredient("Allspice Dram", "Allspice flavored liquer", IngredientType.LIQUEUR);
                realm.copyToRealmOrUpdate(allspiceDram);
                Ingredient honeySuryp =
                        new Ingredient("Honey Suryp", "Variating ratio of water to honey", IngredientType.SURYP);
                realm.copyToRealmOrUpdate(honeySuryp);
                Ingredient orangeBitters =
                        new Ingredient("Orange Bitters", "Orange flavored bitters", IngredientType.BITTERS);
                realm.copyToRealmOrUpdate(orangeBitters);
                Ingredient tequilaBianco =
                        new Ingredient("Tequila Bianco", "Unaged blue agave spirit", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(tequilaBianco);
                Ingredient tequilaResposado =
                        new Ingredient("Tequila Resposado", "Aged blue agave spirit", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(tequilaResposado);
                Ingredient grapefruit =
                        new Ingredient("Grapefruit", "Grapefruit", IngredientType.CITRUS);
                realm.copyToRealmOrUpdate(grapefruit);
                Ingredient darkRum =
                        new Ingredient("Dark Rum", "Sugar cane spirit. Aged", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(darkRum);
                Ingredient lime
                        = new Ingredient("Lime", "Citrus", IngredientType.CITRUS);
                realm.copyToRealmOrUpdate(lime);
                Ingredient rockCandySyrup =
                        new Ingredient("Rock Candy Syrup", "2:1 sugar to water.", IngredientType.SURYP);
                realm.copyToRealmOrUpdate(rockCandySyrup);
                Ingredient nutmeg =
                        new Ingredient("Nutmeg", "Spice", IngredientType.SPICE);
                realm.copyToRealmOrUpdate(nutmeg);
                Ingredient amaretto =
                        new Ingredient("Amaretto", "Almond flavored liqueur", IngredientType.LIQUEUR);
                realm.copyToRealmOrUpdate(amaretto);
                Ingredient eggWhite =
                        new Ingredient("Egg White", "White from an egg", IngredientType.DAIRY);
                realm.copyToRealmOrUpdate(eggWhite);

                Ingredient lightRum =
                        new Ingredient("Lightly Aged Rum", "Lightly aged spirit made from sugar canes. 3-8 years ish.", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(lightRum);
                Ingredient cointreau =
                        new Ingredient("Cointreau", "Orange peel flavored liqeur.", IngredientType.LIQUEUR);
                realm.copyToRealmOrUpdate(cointreau);
                Ingredient maraschinoLiqueur =
                        new Ingredient("Maraschino Liqueur", "Chemical tasting liqueur", IngredientType.LIQUEUR);
                realm.copyToRealmOrUpdate(maraschinoLiqueur);
                Ingredient brandy =
                        new Ingredient("Brandy", "Distilled grape spirit", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(brandy);
                Ingredient greenChartreuse =
                        new Ingredient("Green Chartreuse", "Liqueur with many herbs.", IngredientType.LIQUEUR);
                realm.copyToRealmOrUpdate(greenChartreuse);

                Ingredient pineapple =
                        new Ingredient("Pineapple", "Exotic fruit.", IngredientType.FRUIT);
                realm.copyToRealmOrUpdate(pineapple);

                Ingredient falernum =
                        new Ingredient("Falernum", "Liqeur with spices like ginger clove and lime zest.", IngredientType.SURYP);
                realm.copyToRealmOrUpdate(falernum);

                Ingredient scotch =
                        new Ingredient("Scotch", "Scottish whiskey", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(scotch);

                Ingredient becherovka =
                        new Ingredient("Becherovka", "Czech cinnamon liqueur", IngredientType.LIQUEUR);
                realm.copyToRealmOrUpdate(becherovka);
                Ingredient cinnamonSyrup =
                        new Ingredient("Cinnamon Syrup", "Cinnamon flavored syryp.", IngredientType.SURYP);
                realm.copyToRealmOrUpdate(cinnamonSyrup);

                Ingredient absinthe =
                        new Ingredient("Absinthe", "High-proof Spirit with wormwood and other spices", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(absinthe);

                Ingredient orgeat =
                        new Ingredient("Orgeat", "Almond syrup", IngredientType.SURYP);
                realm.copyToRealmOrUpdate(orgeat);

                Ingredient mint =
                        new Ingredient("Mint", "It's mint!", IngredientType.HERB);
                realm.copyToRealmOrUpdate(mint);

                Ingredient cognac =
                        new Ingredient("Cognac", "Grape spirit.", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(cognac);
                Ingredient vanillaSyrup =
                        new Ingredient("Vanilla Syrup", "Vanilla pod flavored syrup.", IngredientType.SURYP);
                realm.copyToRealmOrUpdate(vanillaSyrup);

                Ingredient vanillaExtract =
                        new Ingredient("Vanilla Extract", "Concentrated vanilla flavor", IngredientType.OTHER);
                realm.copyToRealmOrUpdate(vanillaExtract);
                Ingredient almondExtract =
                        new Ingredient("Almond Extract", "Concentrated almond flavor", IngredientType.OTHER);
                realm.copyToRealmOrUpdate(almondExtract);
                Ingredient sodaWater =
                        new Ingredient("Soda Water", "Carbonated H2O", IngredientType.SODA);
                realm.copyToRealmOrUpdate(sodaWater);
                Ingredient raspberry =
                        new Ingredient("Raspberry", "Sweet berry", IngredientType.FRUIT);
                realm.copyToRealmOrUpdate(raspberry);
                Ingredient gingerBeer =
                        new Ingredient("Ginger Beer", "Fermented ginger beverage.", IngredientType.SODA);
                realm.copyToRealmOrUpdate(gingerBeer);
                Ingredient grenadine
                        = new Ingredient("Grenadine", "Pomegranate syrup", IngredientType.SURYP);
                realm.copyToRealmOrUpdate(grenadine);

                Ingredient passionFruit =
                        new Ingredient("Passion Fruit", "Exotic fruit", IngredientType.FRUIT);
                realm.copyToRealmOrUpdate(passionFruit);
                Ingredient dryVermouth =
                        new Ingredient("Dry Vermouth", "Also called white vermouth", IngredientType.FORTIFIED_WINE);
                realm.copyToRealmOrUpdate(dryVermouth);
                Ingredient mezcal =
                        new Ingredient("Mezcal", "Smoky agave spirit", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(mezcal);
                Ingredient egg =
                        new Ingredient("Egg", "FROM HENS", IngredientType.DAIRY);
                realm.copyToRealmOrUpdate(egg);
                Ingredient moleBitters =
                        new Ingredient("Mole Bitters", "Xocolatl Mole Bitters", IngredientType.BITTERS);
                realm.copyToRealmOrUpdate(moleBitters);
                Ingredient fernetBranca =
                        new Ingredient("Fernet Branca", "Herbal bitter liqueur", IngredientType.LIQUEUR);
                realm.copyToRealmOrUpdate(fernetBranca);
                Ingredient sherry =
                        new Ingredient("Sherry", "Fortified wine", IngredientType.FORTIFIED_WINE);
                realm.copyToRealmOrUpdate(sherry);

                Ingredient sparklingWine =
                        new Ingredient("Sparkling Wine", "Umbrella term for wine with carbonation", IngredientType.WINE);
                realm.copyToRealmOrUpdate(sparklingWine);

                Ingredient tonicWater =
                        new Ingredient("Tonic Water", "Bitter quinine flavored soda.", IngredientType.SODA);
                realm.copyToRealmOrUpdate(tonicWater);

                Ingredient whiteRum =
                        new Ingredient("White Rum", "Unaged rum", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(whiteRum);

                Ingredient passionFruitSyrup =
                        new Ingredient("Passion Fruit Syrup", "1:1 Rock candy syrup to passion fruit juice", IngredientType.SURYP);
                realm.copyToRealmOrUpdate(passionFruitSyrup);

                Ingredient coconutMilk =
                        new Ingredient("Coconut Milk", "milk from coconut", IngredientType.OTHER);
                realm.copyToRealmOrUpdate(coconutMilk);
                Ingredient strawberry =
                        new Ingredient("Strawberry", "Sweet summer berry", IngredientType.FRUIT);
                realm.copyToRealmOrUpdate(strawberry);
                Ingredient serranoPepper =
                        new Ingredient("Serrano Pepper", "Hot mexian pepper", IngredientType.OTHER);
                realm.copyToRealmOrUpdate(serranoPepper);
                Ingredient ryeWhiskey =
                        new Ingredient("Rye Whiskey", "Whiskey made with more then 50% rye.", IngredientType.SPIRIT);
                realm.copyToRealmOrUpdate(ryeWhiskey);
                Ingredient salt =
                        new Ingredient("Salt", "JUST SALT", IngredientType.OTHER);
                realm.copyToRealmOrUpdate(salt);

                Ingredient agaveSyrup =
                        new Ingredient("Agave Syrup", "Syrup from agave plant", IngredientType.SURYP);
                realm.copyToRealmOrUpdate(agaveSyrup);
                Ingredient sugar
                        = new Ingredient("Sugar", "White regular sugar.", IngredientType.SUGAR);
                realm.copyToRealmOrUpdate(sugar);

                Ingredient coconutCream = new Ingredient("Coconut Cream", "Cream of coconut", IngredientType.OTHER);
                realm.copyToRealmOrUpdate(coconutCream);
                Ingredient cinnamon = new Ingredient("Cinnamon", "Bark", IngredientType.SPICE);
                realm.copyToRealmOrUpdate(cinnamon);
                Ingredient heavyCream = new Ingredient("Heavy Cream", "High fat", IngredientType.DAIRY);
                realm.copyToRealmOrUpdate(heavyCream);
                Ingredient orangeFlowerWater = new Ingredient("Orange Flower Water", "Fragrant.", IngredientType.OTHER);
                realm.copyToRealmOrUpdate(orangeFlowerWater);
                Ingredient chocolateBitters = new Ingredient("Chocolate Bitters", "chocolate bitters", IngredientType.BITTERS);
                realm.copyToRealmOrUpdate(chocolateBitters);

                //Drinks
                Drink oldFashioned = new Drink();
                oldFashioned.setName("Old Fashioned");
                oldFashioned.setInstructions("Stir and strain over ice in old fashioned glass. Express orange peel oils and drop in.");
                oldFashioned.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                oldFashioned.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 5.0, Unit.ML));
                oldFashioned.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.DASH));
                oldFashioned.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                oldFashioned.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(oldFashioned);

                Drink boulevardier = new Drink();
                boulevardier.setName("Boulevardier");
                boulevardier.setInstructions("Stir and strain over ice in old fashioned glass. Express orange peel over drink and drop in");
                boulevardier.setDescription("Classic variation of the negroni.");
                boulevardier.setVariations("Try it with the ratio 2:1:1 or 1.5:1:1 (Bourbon:vermouth:campari)");
                boulevardier.addDrinkIngredient(new DrinkIngredient(bourbon, 30.0, Unit.ML));
                boulevardier.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                boulevardier.addDrinkIngredient(new DrinkIngredient(campari, 30.0, Unit.ML));
                boulevardier.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                boulevardier.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(boulevardier);

                Drink negroni = new Drink();
                negroni.setName("Negroni");
                negroni.setInstructions("Stir and strain over ice in old fashioned glass. Express orange peel over drink and drop in");
                negroni.addDrinkIngredient(new DrinkIngredient(gin, 30.0, Unit.ML));
                negroni.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                negroni.addDrinkIngredient(new DrinkIngredient(campari, 30.0, Unit.ML));
                negroni.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                negroni.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(negroni);

                Drink beesKnees = new Drink();
                beesKnees.setName("Bee's Knees");
                beesKnees.setInstructions("Shake and double strain into coupe. 3:1 honey suryp.");
                beesKnees.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                beesKnees.addDrinkIngredient(new DrinkIngredient(lemon, 22.0, Unit.ML));
                beesKnees.addDrinkIngredient(new DrinkIngredient(honeySuryp, 22.0, Unit.ML));
                realm.copyToRealmOrUpdate(beesKnees);

                Drink cloverClub = new Drink();
                cloverClub.setName("Clover Club");
                cloverClub.setInstructions("Shake and double strain int coupe.");
                cloverClub.setVariations("You can use raspberry syrup instead of fresh.");
                cloverClub.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                cloverClub.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                cloverClub.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 20.0, Unit.ML));
                cloverClub.addDrinkIngredient(new DrinkIngredient(raspberry, 5.0, Unit.NONE));
                cloverClub.addDrinkIngredient(new DrinkIngredient(eggWhite, 1.0, Unit.NONE));
                cloverClub.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(cloverClub);

                Drink daiquiri = new Drink();
                daiquiri.setName("Daiquri");
                daiquiri.setInstructions("Shake and double strain into coupe. Garnish with lime wheel.");
                daiquiri.setVariations("Try it with lightly aged rum.");
                daiquiri.addDrinkIngredient(new DrinkIngredient(whiteRum, 60.0, Unit.ML));
                daiquiri.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                daiquiri.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 20.0, Unit.ML));
                daiquiri.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(daiquiri);

                Drink darkAndStormy = new Drink();
                darkAndStormy.setName("Dark & Stormy");
                darkAndStormy.setInstructions("Build in highball and garnish with lime wedge. Black blended rum.");
                darkAndStormy.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                darkAndStormy.addDrinkIngredient(new DrinkIngredient(gingerBeer, 100.0, Unit.ML));
                darkAndStormy.addDrinkIngredient(new DrinkIngredient(lime, 10.0, Unit.ML));
                realm.copyToRealmOrUpdate(darkAndStormy);


                Drink dryMartini = new Drink();
                dryMartini.setName("Dry Martini");
                dryMartini.setInstructions("Stir and strain into coupe.");
                dryMartini.setVariations("Either express lemon peel over drink or drop in an olive. " +
                        "Ratio gin to vermouth is highly variable.");
                dryMartini.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                dryMartini.addDrinkIngredient(new DrinkIngredient(dryVermouth, 20.0, Unit.ML));
                dryMartini.addDrinkIngredient(new DrinkIngredient(orangeBitters, 2.0, Unit.DASH));
                dryMartini.addTag(Tag.NOT_TRIED);
                dryMartini.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(dryMartini);

                Drink french75 = new Drink();
                french75.setName("French 75");
                french75.setInstructions("Shake and double strain into coupe or champagne flute, top with sparkling wine.");
                french75.setVariations("Morgenthaler method. Use highball with cracked ice.");
                french75.addDrinkIngredient(new DrinkIngredient(gin, 30.0, Unit.ML));
                french75.addDrinkIngredient(new DrinkIngredient(lemon, 30.0, Unit.ML));
                french75.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 15.0, Unit.ML));
                french75.addDrinkIngredient(new DrinkIngredient(sparklingWine, 60.0, Unit.ML));
                french75.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(french75);

                Drink gimlet = new Drink();
                gimlet.setName("Gimlet");
                gimlet.setInstructions("Shake and double strain into coupe. Garnish with lime wheel.");
                gimlet.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                gimlet.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                gimlet.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                gimlet.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(gimlet);

                Drink ginAndTonic = new Drink();
                ginAndTonic.setName("Gin & Tonic");
                ginAndTonic.setInstructions("Build in double old fashioned or collins. Garnish with lime wheel.");
                ginAndTonic.setVariations("You can also use tonic syrup and soda water. Try it with star anise.");
                ginAndTonic.setTastingNotes("Crispy and refreshing yet bitter. Juniper and quinine.");
                ginAndTonic.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                ginAndTonic.addDrinkIngredient(new DrinkIngredient(tonicWater, 120.0, Unit.ML));
                ginAndTonic.addDrinkIngredient(new DrinkIngredient(lime, 7.5, Unit.ML));
                ginAndTonic.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(ginAndTonic);

                Drink goldRush = new Drink();
                goldRush.setName("Gold Rush");
                goldRush.setInstructions("Shake and strain over big ice cube in old fashioned glass. No garnish");
                goldRush.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                goldRush.addDrinkIngredient(new DrinkIngredient(honeySuryp, 30.0, Unit.ML));
                goldRush.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                realm.copyToRealmOrUpdate(goldRush);

                Drink maiTai = new Drink();
                maiTai.setName("Mai Tai");
                maiTai.setInstructions("Shake with crushed ice and 4-5 ice cubes. Pour into double old fashioned " +
                        "and garnish with spent lime shell and mint sprig. 30ml Jamaican Aged Rum, 30 ml Rhum Agricole Vieux.");
                maiTai.setVariations("You can experiment with different rums and ratios.");
                maiTai.setTastingNotes("Balanced sweetness, funky and slightly nutty.");
                maiTai.addDrinkIngredient(new DrinkIngredient(darkRum, 60.0, Unit.ML));
                maiTai.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                maiTai.addDrinkIngredient(new DrinkIngredient(rockCandySyrup, 7.5, Unit.ML));
                maiTai.addDrinkIngredient(new DrinkIngredient(orgeat, 7.5, Unit.ML));
                maiTai.addDrinkIngredient(new DrinkIngredient(cointreau, 7.5, Unit.ML));
                maiTai.addDrinkIngredient(new DrinkIngredient(mint, 1.0, Unit.SPRIG));
                realm.copyToRealmOrUpdate(maiTai);

                Drink manhattan = new Drink();
                manhattan.setName("Manhattan");
                manhattan.setInstructions("Stir and strain into coupe. Express orange peel oils and drop in. Garnish with speared maraschino cherry.");
                manhattan.setTastingNotes("Spicy and herbaceous, mellow heavy taste. Strong but no distinct taste of alcohol.");
                manhattan.addDrinkIngredient(new DrinkIngredient(ryeWhiskey, 60.0, Unit.ML));
                manhattan.addDrinkIngredient(new DrinkIngredient(redVermouth, 30.0, Unit.ML));
                manhattan.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 2.0, Unit.ML));
                manhattan.addDrinkIngredient(new DrinkIngredient(orange, 1.0, Unit.PEEL));
                manhattan.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(manhattan);

                Drink margarita = new Drink();
                margarita.setName("Margarita");
                margarita.setInstructions("Shake and strain into double old fashioned over large ice cube.Garnish with lime wedge");
                margarita.addDrinkIngredient(new DrinkIngredient(tequilaBianco, 60.0, Unit.ML));
                margarita.addDrinkIngredient(new DrinkIngredient(lime, 30.0, Unit.ML));
                margarita.addDrinkIngredient(new DrinkIngredient(cointreau, 30.0, Unit.ML));
                margarita.addDrinkIngredient(new DrinkIngredient(salt, 1.0, Unit.DASH));
                realm.copyToRealmOrUpdate(margarita);

                Drink mintJulep = new Drink();
                mintJulep.setName("Mint Julep");
                mintJulep.setInstructions("Muddle mint and simple suryp gently in julep cup or old fashioned. Fill with bourbon and crushed ice." +
                        "garnish with mint sprig.");
                mintJulep.setTastingNotes("Fresh sweet ice cold minty bourbon,");
                mintJulep.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                mintJulep.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 60.0, Unit.ML));
                mintJulep.addDrinkIngredient(new DrinkIngredient(mint, 10.0, Unit.LEAF));
                mintJulep.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(mintJulep);

                Drink mojito = new Drink();
                mojito.setName("Mojito");
                mojito.setInstructions("Gently shake and double strain into collins glass. Top with soda. Garnish with a big sprig of mint and lime wedge");
                mojito.setVariations("Can also be built directly in the glass with crushed ice. Try it with lightly aged rum.");
                mojito.addDrinkIngredient(new DrinkIngredient(whiteRum, 60.0, Unit.ML));
                mojito.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 30.0, Unit.ML));
                mojito.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                mojito.addDrinkIngredient(new DrinkIngredient(mint, 10.0, Unit.NONE));
                mojito.addDrinkIngredient(new DrinkIngredient(sodaWater, 30.0, Unit.ML));
                realm.copyToRealmOrUpdate(mojito);

                Drink peguClub = new Drink();
                peguClub.setName("Pegu Club");
                peguClub.setInstructions("Stir and strain into coupe. Garnish with lime twist.");
                peguClub.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                peguClub.addDrinkIngredient(new DrinkIngredient(cointreau, 20.0, Unit.ML));
                peguClub.addDrinkIngredient(new DrinkIngredient(lime, 15.0, Unit.ML));
                peguClub.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 1.0, Unit.DASH));
                peguClub.addDrinkIngredient(new DrinkIngredient(orangeBitters, 1.0, Unit.DASH));
                realm.copyToRealmOrUpdate(peguClub);

                Drink ramosGinFizz = new Drink();
                ramosGinFizz.setName("Ramos Gin Fizz");
                ramosGinFizz.setInstructions("");
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(gin, 60.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 20.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(lime, 20.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(heavyCream, 30.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(eggWhite, 1.0, Unit.ML));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(orangeFlowerWater, 3.0, Unit.DROP));
                ramosGinFizz.addDrinkIngredient(new DrinkIngredient(sodaWater, 30.0, Unit.ML));
                realm.copyToRealmOrUpdate(ramosGinFizz);

                Drink sidecar = new Drink();
                sidecar.setName("Sidecar");
                sidecar.setInstructions("Shake and double strain into coupe. Optionally rim glass with sugar.");
                sidecar.setVariations("Optionally add 7.5 ml simple suryp.");
                sidecar.addDrinkIngredient(new DrinkIngredient(cognac, 60.0, Unit.ML));
                sidecar.addDrinkIngredient(new DrinkIngredient(cointreau, 20.0, Unit.ML));
                sidecar.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                sidecar.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(sidecar);

                Drink whiskeySour = new Drink();
                whiskeySour.setName("Whiskey Sour");
                whiskeySour.setInstructions("Shake and double strain into coupe. Garnish with 4 drops bitters.");
                whiskeySour.addDrinkIngredient(new DrinkIngredient(bourbon, 60.0, Unit.ML));
                whiskeySour.addDrinkIngredient(new DrinkIngredient(lemon, 20.0, Unit.ML));
                whiskeySour.addDrinkIngredient(new DrinkIngredient(simpleSyrup, 15.0, Unit.ML));
                whiskeySour.addDrinkIngredient(new DrinkIngredient(eggWhite, 1.0, Unit.NONE));
                whiskeySour.addDrinkIngredient(new DrinkIngredient(angosturaBitters, 4.0, Unit.DROP));
                whiskeySour.addTag(Tag.CLASSIC);
                realm.copyToRealmOrUpdate(whiskeySour);
            }
        });
    }

}
