package com.api.service;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.model.Beer;
import com.api.repository.BeerRepository;

@Component("BeerService")
public class BeerService{
    private final AtomicLong beerID = new AtomicLong();
    private final AtomicLong recipeID = new AtomicLong();

    @Autowired
    private BeerRepository beerRepository;


    //Create
    public boolean createBeer(Beer beer){
        beer.setBeerID(beerID.incrementAndGet());
        beer.setRecipeID(recipeID.incrementAndGet());

        beerRepository.save(beer);
        return true;
    }

    //Retrieve
    public Beer retrieveBeer(long id){
      return beerRepository.findByBeerId(id);
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