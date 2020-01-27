package com.api.model;

import java.util.Date;

import javax.persistence.*;
import org.springframework.data.rest.core.annotation.*;

@Entity()
public class Bottle {

    @Id
    @GeneratedValue
    private long bottleID;
    private String bottleType;
    private Date bottleDate;
    private int bottleCount;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "noteID")
    @RestResource(path = "bottleNote", rel="bottleNote")
    private Bottle bottle;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "imageID")
    @RestResource(path = "bottleImage", rel="bottleImage")
    private Image image;

    public Bottle(){}

    public void setBottleID(long newBottleID){
        bottleID = newBottleID;
    }

    public long getBottleID(){
        return bottleID;    
    }

    public void setBottleType(String newBottleType){
        bottleType = newBottleType;
    }

    public String getBottleType(){
        return bottleType;
    }

    public void setBottleDate(Date newBottleDate){
        bottleDate = newBottleDate;
    }

    public Date getBottleDate(){
        return bottleDate;
    }

    public void setBottleCount(int newBottleCount){
        bottleCount = newBottleCount;
    }

    public int getBottleCount(){
        return bottleCount;
    }
}