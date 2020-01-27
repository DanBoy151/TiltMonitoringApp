package com.api.model;

import java.util.Date;
import javax.persistence.*;
import org.springframework.data.rest.core.annotation.*;

@Entity()
public class Review {

    @Id
    @GeneratedValue
    private long reviewID;
    private Date reviewDate;
    private int rating;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "noteID")
    @RestResource(path = "reviewNote", rel="reviewNote")
    private Note note;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "imageID")
    @RestResource(path = "reviewImage", rel="reviewImage")
    private Image image;

    public Review(){}

    public void setReviewID(long newReviewID){
        reviewID = newReviewID;
    }

    public long getReviewID(){
        return reviewID;    
    }

    public void setReviewDate(Date newReviewDate){
        reviewDate = newReviewDate;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setRating(int newRating){
        rating = newRating;
    }

    public int getRating(){
        return rating;
    }
}