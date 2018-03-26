package com.erikstackelberg.cocktailhour.enums;

public enum IngredientType {
    SPIRIT("Spirit"),
    SURYP("Suryp"),
    BITTERS("Bitters"),
    BITTER("Bitter"),
    CITRUS("Citrus"),
    FORTIFIED_WINE("Fortified Wine"),
    LIQUEUR("Liqueur"),
    OTHER("Other"),
    SPICE("Spice"),
    DAIRY("Dairy"),
    SUGAR("Sugar"),
    FRUIT("Fruit"),
    WINE("Wine"),
    SODA("Soda");

    private String friendlyName;

    private IngredientType(String friendlyName){
        this.friendlyName = friendlyName;
    }

    @Override public String toString(){
        return friendlyName;
    }
}
