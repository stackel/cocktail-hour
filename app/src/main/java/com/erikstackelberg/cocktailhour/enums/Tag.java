package com.erikstackelberg.cocktailhour.enums;

public enum Tag {
    ALL("All"),
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

    public static Tag fromString(String text) {
        for (Tag b : Tag.values()) {
            if (b.toString().equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }

}
