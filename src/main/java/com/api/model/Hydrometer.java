package com.api.model;

import java.util.Date;
import javax.persistence.*;

import java.math.BigDecimal;

@Entity()
public class Hydrometer {

    @Id
    @GeneratedValue
    private long hydrometerID;
    private String colour;
    private boolean available;
    private boolean inUse;

    public Hydrometer(){}
    
    public Hydrometer(long hydrometerID, String colour,
                      boolean available, boolean inUse){
        super();
        this.hydrometerID = hydrometerID;
        this.colour = colour;
        this.available = available;
        this.inUse = inUse;
    }

    public long getHydrometerID(){
        return hydrometerID;
    }

    public void setHydrometerID(long newhydrometerID){
        hydrometerID = newhydrometerID;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String newColour){
        colour = newColour;
    }

    public boolean getAvailable(){
        return available;
    }

    public void setAvailable(boolean newAvailable){
        available = newAvailable;
    }

    public boolean getInUse(){
        return inUse;
    }

    public void setInUse(boolean newInUse){inUse = newInUse;}
}

