package com.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

import javax.persistence.*;

@Entity()
public class Reading implements Comparable<Reading> {

    @Id
    @GeneratedValue
    private long readingID;
    private long beerID;
    private long hydrometerID;
    private BigDecimal temp;
    private BigDecimal sG;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date date;


    public Reading(){}

    public void setHydrometerID(long newHydrometerID){
        hydrometerID = newHydrometerID;
    }

    public long getHydrometerID(){
        return hydrometerID;
    }

    public long getReadingID(){
        return readingID;
    }

    public void setReadingID(long newReadingID){
        readingID = newReadingID;
    }

    public long getBeerID(){
        return beerID;
    }

    public void setBeerID(long newBeerID){
        beerID = newBeerID;
    }

    public BigDecimal getTemp(){
        return temp;
    }

    public void setTemp(BigDecimal newTemp){
        temp = newTemp;
    }

    public BigDecimal getSG(){
        return sG;
    }

    public void setSG(BigDecimal newSG) {sG = newSG;}

    public Date getDate() {return  date;}

    public void setDate(Date newDate){date = newDate;}

    @Override
    public int compareTo(Reading r) {
        if (getDate() == null || r.getDate() == null) {
            return 0;
        }
        return getDate().compareTo(r.getDate());
    }
}