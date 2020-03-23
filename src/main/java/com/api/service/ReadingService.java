package com.api.service;

import com.api.model.Reading;
import com.api.repository.ReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ReadingService")
public class ReadingService {

    @Autowired
    private ReadingRepository readingRepository;


    //Create
    public boolean createReading(Reading reading){
        readingRepository.save(reading);
        return true;
    }

    //Retrieve
    public List<Reading> RetrieveReadings(long beerID){
        return readingRepository.findByBeerID(beerID);
    }

    //Update
    public boolean updateReading(Reading reading){
        readingRepository.save(reading);
        return true;
    }

    //Delete
    public boolean deleteReading(long id){
        readingRepository.deleteById(id);
        return true;
    }

}
