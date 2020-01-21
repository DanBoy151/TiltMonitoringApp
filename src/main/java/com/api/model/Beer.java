package com.api.model;

import java.util.Date;
import javax.persistence.*;

@Entity()
public class Beer {

    @Id
    @GeneratedValue
    private long beerID;
    private String name;
    private long recipeID;
    private Date startDate;
    private double oG;
    private double fG;

    public Beer(){}
    
    public Beer(long beerID, String name, long recipeID,
                Date startDate, double oG, double fG){
        super();
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

    public void setName(String newBeerName){
        name = newBeerName;
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

    public void setStartDate(Date newStartDate){
        startDate = newStartDate;
    }

    public double getOG(){
        return oG;
    }

    public void setOG(double newOG){
        oG = newOG;
    }

    public double getFG(){
        return fG;
    }

    public void setFG(double newFG){
        fG = newFG;
    }

}

