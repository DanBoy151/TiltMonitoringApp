package com.api.model;

import javax.persistence.*;

@Entity
public class Style {

    @Id
    @GeneratedValue
    private long styleID;
    private String style;
    private String description;

    @OneToOne(mappedBy = "style")
    private Recipe recipe;

    public Style() {}

    public long getStyleID(){
        return styleID;
    }

    public void setStyleID(long newStyleID){
        styleID = newStyleID;
    }

    public String getStyle(){
        return style;
    }

    public void setStyle(String newStyle){
        style = newStyle;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String newDescription){
        description= newDescription;
    }

}