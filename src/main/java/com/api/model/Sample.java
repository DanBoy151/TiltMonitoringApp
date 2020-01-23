package com.api.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Sample {

    @Id
    @GeneratedValue
    private long sampleID;
    private Date sampleDate;
    private boolean brewReady;
    private long noteID;
    private long imageID;

    @ManyToOne()
    @JoinColumn(name="beerID")
    private Beer beer;

    public Sample(){}

    public Sample(long sampleID, Date sampleDate, boolean brewReady,
                  long noteID, long imageID){

                    this.sampleID =sampleID;
                    this.sampleDate = sampleDate;
                    this.brewReady = brewReady;
                    this.noteID = noteID;
                    this.imageID = imageID;
    }

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

    public void setBrewReady(Boolean newBrewReady){
        brewReady = newBrewReady;
    }
    public long getNoteID(){
        return noteID;
    }

    public void setNoteID(long newNoteID){
        noteID= newNoteID;
    }

    public long getImageID(){
        return imageID;
    }

    public void setImageID(long newImageID){
        imageID = newImageID;
    }






}