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

    @OneToOne(mappedBy = "note")
    private Beer beer;

    @OneToOne(mappedBy = "note")
    private Sample sample;

    @OneToOne(mappedBy = "note")
    private Review review;

    @OneToOne(mappedBy = "note")
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