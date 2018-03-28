package com.erikstackelberg.cocktailhour.enums;

public enum Unit {
    OZ("oz"), CL("cl"), DASH("dash"), PEEL("peel"), ML("ml"), PINCH("pinch"), SLICE("Slice"), NONE("");

    private String friendlyName;

    Unit(String friendlyName){
        this.friendlyName = friendlyName;
    }

    @Override public String toString(){
        return friendlyName;
    }
}
