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
    private BigDecimal oG;
    @Column(precision = 4, scale = 3)
    private BigDecimal fG;

    public Beer(){}
    
    public Beer(long beerID, String name, long recipeID,
                Date startDate, BigDecimal oG, BigDecimal fG){
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

    public BigDecimal getOG(){
        return oG;
    }

    public void setOG(BigDecimal newOG){
        oG = newOG;
    }

    public BigDecimal getFG(){
        return fG;
    }

    public void setFG(BigDecimal newFG){
        fG = newFG;
    }

}

