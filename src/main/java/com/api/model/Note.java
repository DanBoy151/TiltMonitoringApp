package com.api.model;

import java.util.Date;

import javax.persistence.*;

@Entity()
public class Note {

    @Id
    @GeneratedValue
    private long noteID;
    private String noteText;
    private Date noteDate;

    @OneToOne(mappedBy = "beerNote")
    private Beer beer;

    @OneToOne(mappedBy = "sampleNote")
    private Beer sample;

    @OneToOne(mappedBy = "reviewNote")
    private Review review;

    @OneToOne(mappedBy = "bottleNote")
    private Bottle bottle;

    public Note(){}

    public void setNoteID(long newNoteID){
        noteID = newNoteID;
    }

    public long getNoteID(){
        return noteID;    
    }

    public void setNoteText(String newNoteText){
        noteText = newNoteText;
    }

    public String getNoteText(){
        return noteText;
    }

    public void setNoteDate(Date newNoteDate){
        noteDate = newNoteDate;
    }

    public Date getNoteDate(){
        return noteDate;
    }
}