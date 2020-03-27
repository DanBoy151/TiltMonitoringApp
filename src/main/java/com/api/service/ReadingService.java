package com.api.service;

import com.api.model.Reading;
import com.api.repository.ReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
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

    public Reading RetrieveLatestReading(long beerID) {
        List<Reading> readings = readingRepository.findByBeerID(beerID);
        Collections.reverse(readings);

        Reading latestReading = readings.get(0);

        return latestReading;
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
