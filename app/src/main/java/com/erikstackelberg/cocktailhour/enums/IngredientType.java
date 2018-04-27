package com.erikstackelberg.cocktailhour.enums;

public enum IngredientType {
    ALL("All"),
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
    HERB("Herb"),
    SODA("Soda");

    private String friendlyName;

    IngredientType(String friendlyName){
        this.friendlyName = friendlyName;
    }

    @Override public String toString(){
        return friendlyName;
    }
}
