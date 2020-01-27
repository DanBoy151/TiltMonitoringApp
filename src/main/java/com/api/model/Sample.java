package com.api.model;

import java.util.Date;

import javax.persistence.*;
import org.springframework.data.rest.core.annotation.*;

@Entity
public class Sample {

    @Id
    @GeneratedValue
    private long sampleID;
    private Date sampleDate;
    private boolean brewReady;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "noteID")
    @RestResource(path = "sampleNote", rel="sampleNote")
    private Note note;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "imageID")
    @RestResource(path = "sampleImage", rel="sampleImage")
    private Image image;

    public Sample(){}

    public long getSampleID(){
        return sampleID;
    }

    public void setSampleID(long newSampleID){
        sampleID = newSampleID;
    }

    public Date getSampleDate(){
        return sampleDate;
    }

    public void setSampleDate(Date newSampleDate){
        sampleDate = newSampleDate;
    }

    public boolean getBrewReady(){
        return brewReady;
    }

    public void setBrewReady(boolean newBrewReady){
        brewReady = newBrewReady;
    }

}