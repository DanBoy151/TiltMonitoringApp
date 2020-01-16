package com.api.model;

import java.util.Date;

public class Sample {

    private long sampleID;
    private final Date sampleDate;
    private final boolean brewReady;
    private long noteID;
    private long imageID;

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

    public boolean getBrewReady(){
        return brewReady;
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