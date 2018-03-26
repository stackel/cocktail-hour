package com.erikstackelberg.cocktailhour.models;

import com.erikstackelberg.cocktailhour.enums.IngredientType;

import java.util.UUID;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Ingredient extends RealmObject {
    @PrimaryKey
    @Required
    private String id;
    private String name;
    private String description;
    private String ingredientType;

    public Ingredient(String name, String description, IngredientType ingredientType){
        id = UUID.randomUUID().toString();
        setName(name);
        setDescription(description);
        setIngredientType(ingredientType);
    }

    public Ingredient() {
        id = UUID.randomUUID().toString();
    }

    public void setIngredientType(IngredientType ingredientType) {
        this.ingredientType = ingredientType.name();
    }
    public IngredientType getIngredientType() {
        return (ingredientType != null) ? IngredientType.valueOf(ingredientType) : null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIngredientType(String ingredientType) {
        this.ingredientType = ingredientType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getName();
    }
}
