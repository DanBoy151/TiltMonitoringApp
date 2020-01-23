package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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

    //Retrieve Specific Beer
    public Beer retrieveBeer(long id){
      return beerRepository.findByBeerID(id);
    }

    //Retrieve All Beers
    public List<Beer> retrieveBeers(){
      return beerRepository.findAll();
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