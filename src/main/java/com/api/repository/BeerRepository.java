package com.api.repository;

import java.util.List;

import com.api.model.Beer;

import org.springframework.data.repository.CrudRepository;

public interface BeerRepository extends CrudRepository<Beer, Long>{
	List<Beer> findByBeerName(String BeerName);
    List<Beer> findAll();
    Beer findById(long id);
}