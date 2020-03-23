package com.api.repository;

import java.util.List;

import com.api.model.Reading;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("ReadingRepository")
@EntityScan(basePackageClasses = Reading.class)
public interface ReadingRepository extends CrudRepository<Reading, Long>{
    List<Reading> findAll();
    List<Reading> findByBeerID(long beerID);
}