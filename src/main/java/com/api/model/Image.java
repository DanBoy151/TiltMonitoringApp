package com.api.model;

import javax.persistence.*;

@Entity()
public class Image {

    @Id
    @GeneratedValue
    private long imageID;
    private byte[] imageData;

    @OneToOne(mappedBy = "image")
    private Sample sample;

    @OneToOne(mappedBy = "image")
    private Review review;

    @OneToOne(mappedBy = "image")
    private Bottle bottle;


    public Image(){}

    public void setImageID(long newImageID){
        imageID = newImageID;
    }

    public long getImageID(){
        return imageID;    
    }

    public void setImageData(byte[] newImageData){
        imageData = newImageData;
    }

    public byte[] getImageData(){
        return imageData;
    }
}