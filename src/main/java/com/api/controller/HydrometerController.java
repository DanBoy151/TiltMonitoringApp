package com.api.controller;

import com.api.model.Hydrometer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

import java.util.List;

import com.api.service.*;

@RestController
@RequestMapping("/tilt/hydrometer")
public class HydrometerController {

    @Autowired
    private HydrometerService hydrometerService;

    //Get All Hydrometers
    @GetMapping("")
    public @ResponseBody List<Hydrometer> GetAllHydrometers(){
        return hydrometerService.retrieveHydrometers();
    }

    //Get Hydrometer by ID
    @GetMapping("/{id}")
    public @ResponseBody
    Hydrometer GetHydrometer(@PathVariable("id") long id){
        return hydrometerService.retrieveHydrometerByID(id);
    }

    //Create New Hydrometer
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void NewHydrometer(@RequestBody Hydrometer newHydrometer){
        hydrometerService.createHydrometer(newHydrometer);
    }

    //Update a Specific Hydrometer
   @PutMapping("/{id}/start")
   @ResponseStatus(HttpStatus.OK)
    public void StartLogging(@PathVariable("id") long id){
        hydrometerService.startLogging(id);
    }

    //Update a Specific Hydrometer
    @PutMapping("/{id}/stop")
    @ResponseStatus(HttpStatus.OK)
    public void StopLogging(@PathVariable("id") long id){
        hydrometerService.stopLogging(id);
    }

    //Delete a Hydrometer by ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteHydrometer(@PathVariable("id") long id){
        hydrometerService.deleteHydrometer(id);
    }

}