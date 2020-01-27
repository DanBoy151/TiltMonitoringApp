package com.api.model;

import java.util.Date;

import javax.persistence.*;

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
    private Note note;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "imageID")
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