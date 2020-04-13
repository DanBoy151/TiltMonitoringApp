package com.api.controller;

import com.api.model.Reading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import com.api.service.*;

import java.util.List;

@RestController
@RequestMapping("/tilt/reading")
public class ReadingController {
    @Autowired
    private ReadingService readingService;

    //Get all Readings for a Beer
    @CrossOrigin
    @GetMapping("/{beerid}")
    public @ResponseBody
    List<Reading> getReadings(@PathVariable("beerid") long beerId){
        return readingService.RetrieveReadings(beerId);
    }

    //Get the most recent reading for a particular beer
    @CrossOrigin
    @GetMapping("/{beerid}/latest")
    public @ResponseBody
    Reading getLatestReading(@PathVariable("beerid") long beerId){
        return readingService.RetrieveLatestReading(beerId);
    }

    //Create New Reading
    @CrossOrigin
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void newReading(@RequestBody Reading newReading){
        readingService.createReading(newReading);
    }

    //Update a Specific Reading
    @CrossOrigin
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateReading(@PathVariable("id") long id, @RequestBody Reading updateReading){
        readingService.updateReading(updateReading);
    }

    //Delete a Hydrometer by ID
    @CrossOrigin
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteReading(@PathVariable("id") long id){
        readingService.deleteReading(id);
    }

}