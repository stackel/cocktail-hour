package com.erikstackelberg.cocktailhour.models;

import io.realm.RealmObject;

public class TagWrapper extends RealmObject {
    String string;

    public TagWrapper() {
        this.string = "";
    }

    TagWrapper(String string) {
        this.string = string;
    }
}
