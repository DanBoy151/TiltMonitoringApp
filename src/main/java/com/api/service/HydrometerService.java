package com.api.service;

import com.api.repository.HydrometerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import com.api.model.Hydrometer;

@Component("HydrometerService")
public class HydrometerService {

    @Autowired
    private HydrometerRepository hydrometerRepository;

    //Create
    public boolean createHydrometer(Hydrometer hydrometer){
        hydrometerRepository.save(hydrometer);
        return true;
    }

    //Retrieve Specific Hydrometer
    public Hydrometer retrieveHydrometerByID(long id){
      return hydrometerRepository.findByHydrometerID(id);
    }

    //Retrieve Specific Hydrometer
    public Hydrometer retrieveHydrometerByColour(String colour){
        return hydrometerRepository.findByColour(colour);
    }

    //Retrieve All Beers
    public List<Hydrometer> retrieveHydrometers(){
      return hydrometerRepository.findAll();
    }

    //Update
    public boolean startLogging(long hydrometerID){
        Hydrometer dbHydrometer = hydrometerRepository.findByHydrometerID(hydrometerID);
        dbHydrometer.setInUse(true);
        hydrometerRepository.save(dbHydrometer);
        return true;
    }

    //Update
    public boolean stopLogging(long hydrometerID){
        Hydrometer dbHydrometer = hydrometerRepository.findByHydrometerID(hydrometerID);
        dbHydrometer.setInUse(false);
        hydrometerRepository.save(dbHydrometer);
        return true;
    }

    //Delete
    public boolean deleteHydrometer(long id){
        hydrometerRepository.deleteById(id);
        return true;
    }

}