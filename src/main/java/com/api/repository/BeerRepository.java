package com.api.repository;

import java.util.List;

import com.api.model.Beer;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("BeerRepository")
@EntityScan(basePackageClasses = Beer.class)
public interface BeerRepository extends CrudRepository<Beer, Long>{
	List<Beer> findByBeerName(String BeerName);
    List<Beer> findAll();
    Beer findById(long id);
}