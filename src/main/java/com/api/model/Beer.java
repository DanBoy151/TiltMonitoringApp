package com.api.model;

import java.util.Date;
import javax.persistence.*;

import java.math.BigDecimal;

@Entity()
public class Beer {

    @Id
    @GeneratedValue
    private long beerID;
    private String name;
    private long recipeID;
    private Date startDate;
    @Column(precision = 4, scale = 3)
    private BigDecimal og;
    @Column(precision = 4, scale = 3)
    private BigDecimal fg;

    public Beer(){}
    
    public Beer(long beerID, String name, long recipeID,
                Date startDate, BigDecimal og, BigDecimal fg){
        super();
        this.beerID = beerID;
        this.name = name;
        this.recipeID = recipeID;
        this.startDate = startDate;
        this.og = og;
        this.fg = fg;
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

    public BigDecimal getOg(){
        return og;
    }

    public void setOg(BigDecimal newOg){
        og = newOg;
    }

    public BigDecimal getFg(){
        return fg;
    }

    public void setFg(BigDecimal newFg){
        fg = newFg;
    }

}

