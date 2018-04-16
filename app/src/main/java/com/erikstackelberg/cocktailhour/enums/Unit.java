package com.erikstackelberg.cocktailhour.enums;

public enum Unit {
    OZ("oz"), CL("cl"), DASH("dash"), PEEL("peel"), ML("ml"), PINCH("pinch"), SLICE("Slice"),
    NONE(""), DROP("Drop"), WEDGE("Wedge"), LEAF("Leaf"), SPRIG("Sprig");

    private String friendlyName;

    Unit(String friendlyName){
        this.friendlyName = friendlyName;
    }

    @Override public String toString(){
        return friendlyName;
    }
}
