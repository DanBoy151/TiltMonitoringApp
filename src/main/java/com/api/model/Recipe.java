package com.api.model;

import javax.persistence.*;

import org.springframework.data.rest.core.annotation.*;

@Entity()
public class Recipe {

    @Id
    @GeneratedValue
    private long recipeID;
    private long styleID;
    private String method;
    private String ingredients;

    @OneToOne(mappedBy = "recipe")
    private Beer beer;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "styleID")
    @RestResource(path = "recipeStyle", rel="style")
    private Style style;

    public Recipe(){}

    public void setRecipeID(long newRecipeID){
        recipeID = newRecipeID;
    }

    public long getRecipeID(){
        return recipeID;    
    }

    public void setStyleID(long newStyleID){
        styleID = newStyleID;
    }

    public long getStyleID(){
        return styleID;
    }

    public void setMethod(String newMethod){
        method = newMethod;
    }

    public String getMethod(){
        return method;
    }

    public void setIngredients(String newIngredients){
        ingredients = newIngredients;
    }

    public String getIngredients(){
        return ingredients;
    }

}