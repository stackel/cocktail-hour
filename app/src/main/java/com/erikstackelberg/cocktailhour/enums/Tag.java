package com.erikstackelberg.cocktailhour.enums;

public enum Tag {
    ALL("All"),
    HAS_INGREDIENTS("Has Ingredients"),
    TRIED("Tried"),
    FAVORITE("Favorite"),
    NOT_TRIED("Not Tried"),
    TIKI("Tiki"),
    CLASSIC("Classic"),
    TRY_SOON("Try Soon"),
    HOT("Hot"),
    OTHER("Other");

    private String friendlyName;

    Tag(String friendlyName){
        this.friendlyName = friendlyName;
    }

    @Override public String toString(){
        return friendlyName;
    }
}
