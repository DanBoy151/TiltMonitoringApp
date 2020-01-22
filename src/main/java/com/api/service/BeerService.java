package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.model.Beer;
import com.api.repository.BeerRepository;

@Component("BeerService")
public class BeerService{

    @Autowired
    private BeerRepository beerRepository;


    //Create
    public boolean createBeer(Beer beer){
        beerRepository.save(beer);
        return true;
    }

    //Retrieve
    public Beer retrieveBeer(long id){
      return beerRepository.findByBeerID(id);
    }

    //Update
    public boolean updateBeer(Beer beer){
        beerRepository.save(beer);
        return true;
    }

    //Delete
    public boolean deleteBeer(long id){
        beerRepository.deleteById(id);
        return true;
    }

}