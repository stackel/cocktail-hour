package com.erikstackelberg.cocktailhour.models;

import com.erikstackelberg.cocktailhour.enums.Unit;

import java.text.DecimalFormat;
import java.util.UUID;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;


public class DrinkIngredient extends RealmObject {
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.#");
    @PrimaryKey
    @Required
    private String id;
    private Ingredient ingredient;
    private Double amount;
    private String unit;

    public DrinkIngredient(Ingredient ingredient, Double amount, Unit unit) {
        id = UUID.randomUUID().toString();
        setIngredient(ingredient);
        setAmount(amount);
        setUnit(unit);
    }

    public DrinkIngredient() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Double getAmount() {
        return amount;
    }

    public String getAmountFormatted() {
        if(amount == null) {
            return "";
        }
        return decimalFormat.format(amount);
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setUnit(Unit unit) {
        this.unit = unit.name();
    }

    public Unit getUnit() {
        return (unit != null) ? Unit.valueOf(unit) : null;
    }

    @Override
    public String toString() {
        if(ingredient == null || ingredient.getName() == null) {
            return "String is null.";
        }
        return ingredient.getName();
    }
}
