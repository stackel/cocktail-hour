package com.erikstackelberg.cocktailhour.enums;


public enum Filter {
    ALL("All"),
    FAVOURITE("Favourite"),
    TRIED("Tried"),
    NOT_TRIED("Not Tried");

    private String friendlyName;

    Filter(String friendlyName){
            this.friendlyName = friendlyName;
        }

    @Override public String toString(){
            return friendlyName;
        }

}
