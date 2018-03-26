package com.erikstackelberg.cocktailhour.models;

import java.util.UUID;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;


public class Drink extends RealmObject {
    @PrimaryKey
    @Required
    private String id;
    private String name;
    private String instructions;
    private RealmList<DrinkIngredient> drinkIngredients = new RealmList<>();
    private boolean favourite = false;
    private boolean hasTried = false;

    public Drink() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public RealmList<DrinkIngredient> getDrinkIngredients() {
        return drinkIngredients;
    }

    public void addDrinkIngredient(DrinkIngredient drinkIngredient){
        drinkIngredients.add(drinkIngredient);
    }

    public void setDrinkIngredients(RealmList<DrinkIngredient> drinkIngredients) {
        this.drinkIngredients = drinkIngredients;
    }

    public String getAllIngredientsString() {
        String returnString = "";
        for(DrinkIngredient drinkIngredient: drinkIngredients){
            if(drinkIngredient.getIngredient() != null) {
                returnString += drinkIngredient.getIngredient().getName();
                if (drinkIngredients.indexOf(drinkIngredient) < drinkIngredients.size() - 1) {
                    returnString += ", ";
                }
            }
        }
        return returnString;
    }

    @Override
    public String toString() {
        return getName();
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public boolean hasTried() {
        return hasTried;
    }

    public void setHasTried(boolean hasTried) {
        this.hasTried = hasTried;
    }
}

