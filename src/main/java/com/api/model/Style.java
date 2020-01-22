package com.api.model;

import javax.persistence.*;

@Entity()
public class Style {

    @Id
    @GeneratedValue
    private long styleID;
    private String style;
    private String description;

    public Style(){}

        public void setStyleID(long newStyleID){
        styleID = newStyleID;
    }

    public long getStyleID(){
        return styleID;
    }

    public void setStyle(String newStyle){
        style = newStyle;
    }

    public String getStyle(){
        return style;
    }

    public void setDescription(String newDescription){
        description = newDescription;
    }

    public String getDescription(){
        return description;
    }

}