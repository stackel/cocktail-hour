package com.erikstackelberg.cocktailhour.enums;

public enum DrinkType {
    OTHER("Other"),
    TIKI("Tiki"),
    CLASSIC("Classic");

    private String friendlyName;

    DrinkType(String friendlyName){
        this.friendlyName = friendlyName;
    }

    @Override public String toString(){
        return friendlyName;
    }
}
