package com.api.repository;

import java.util.List;

import com.api.model.Review;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("ReviewRepository")
@EntityScan(basePackageClasses = Review.class)
public interface ReviewRepository extends CrudRepository<Review, Long>{
    List<Review> findAll();
    Review findByReviewID(long reviewID);
}