package com.api.model;

import java.util.Date;
import javax.persistence.*;

import java.math.BigDecimal;
import org.springframework.data.rest.core.annotation.*;


@Entity()
public class Beer {

    @Id
    @GeneratedValue
    private long beerID;
    private String name;
    private Date startDate;
    @Column(precision = 4, scale = 3)
    private BigDecimal og;
    @Column(precision = 4, scale = 3)
    private BigDecimal fg;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "recipeID")
    @RestResource(path = "beerRecipe", rel="recipe")
    private Recipe recipe;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "noteID")
    @RestResource(path = "beerNote", rel="beerNote")
    private Note note;

    public Beer(){}
    
    public Beer(long beerID, String name,
                Date startDate, BigDecimal og, BigDecimal fg){
        super();
        this.beerID = beerID;
        this.name = name;
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

    public Recipe getRecipe(){
        return recipe;
    }

    public void setRecipe(Recipe newRecipe){
        recipe = newRecipe;
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

