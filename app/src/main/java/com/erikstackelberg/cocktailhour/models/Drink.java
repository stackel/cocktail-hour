package com.erikstackelberg.cocktailhour.models;

import com.erikstackelberg.cocktailhour.enums.Tag;

import java.util.ArrayList;
import java.util.UUID;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Drink extends RealmObject {
    @PrimaryKey
    @Required
    private String id;
    private String name;
    private String instructions;
    private String variations;
    private String description;
    private String tastingNotes;
    private RealmList<DrinkIngredient> drinkIngredients = new RealmList<>();

    private RealmList<TagWrapper> tags = new RealmList<>();

    public Drink() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getVariations() {
        return variations;
    }

    public String getTastingNotes() {
        return tastingNotes;
    }

    public void setTastingNotes(String tastingNotes) {
        this.tastingNotes = tastingNotes;
    }

    public void setVariations(String variations) {
        this.variations = variations;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RealmList<DrinkIngredient> getDrinkIngredients() {
        return drinkIngredients;
    }

    public void addDrinkIngredient(DrinkIngredient drinkIngredient){
        drinkIngredients.add(drinkIngredient);
    }

    public void setDrinkIngredients(RealmList<DrinkIngredient> drinkIngredients) {
        this.drinkIngredients = drinkIngredients;
    }

    public String getAllIngredientsString() {
        String returnString = "";
        for(DrinkIngredient drinkIngredient: drinkIngredients){
            if(drinkIngredient.getIngredient() != null) {
                returnString += drinkIngredient.getIngredient().getName();
                if (drinkIngredients.indexOf(drinkIngredient) < drinkIngredients.size() - 1) {
                    returnString += ", ";
                }
            }
        }
        return returnString;
    }

    public ArrayList<Tag> getTags() {
        ArrayList<Tag> tagArray = new ArrayList<>();
        for (TagWrapper tagString : tags){
            tagArray.add(Tag.valueOf(tagString.string));
        }
        return tagArray;
    }

    public void addTag(Tag tag) {
        tags.add(new TagWrapper(tag.toString()));
    }

    public String getAllTagsAsString() {
        StringBuilder sb = new StringBuilder();
        for (TagWrapper t : tags)
        {
            sb.append(t.string);
            sb.append(" ");
            sb.append(" | ");
        }

        return sb.toString();
    }

    public boolean hasAllIngredients() {
        for(DrinkIngredient drinkIngredient : drinkIngredients) {
            if (!drinkIngredient.getIngredient().hasIngredient()) {
                return false;
            }
        }
        return true;
    }

    public String getMissingIngredientsString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Missing: ");
        for(DrinkIngredient drinkIngredient : drinkIngredients) {
            if (!drinkIngredient.getIngredient().hasIngredient()) {
                sb.append(drinkIngredient.getIngredient().toString());
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getName();
    }

}

