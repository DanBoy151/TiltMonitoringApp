package com.api.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Beer {

    private long beerID;
    private final String name;
    private long recipeID;
    private final Date startDate;
    private final double oG;
    private final double fG;

    public Beer(long beerID, String name, long recipeID,
                Date startDate, double oG, double fG){
        this.beerID = beerID;
        this.name = name;
        this.recipeID = recipeID;
        this.startDate = startDate;
        this.oG = oG;
        this.fG = fG;
    }

    public long getBeerID(){
        return beerID;
    }

    public void setBeerID(long newBeerID){
        beerID = newBeerID;
    }

    public String getName(){
        return name;
    }

    public Long getRecipeID(){
        return recipeID;
    }

    public void setRecipeID(long newRecipeID){
        recipeID = newRecipeID;
    }

    public Date getStartDate(){
        return startDate;
    }

    public double getOG(){
        return oG;
    }

    public double getFG(){
        return fG;
    }

}

