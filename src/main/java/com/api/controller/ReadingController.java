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

    //Get Hydrometer by ID
    @GetMapping("/{beerid}")
    public @ResponseBody
    List<Reading> getReadings(@PathVariable("beerid") long beerId){
        return readingService.RetrieveReadings(beerId);
    }

    //Create New Reading
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void newReading(@RequestBody Reading newReading){
        readingService.createReading(newReading);
    }

    //Update a Specific Hydrometer
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateReading(@PathVariable("id") long id, @RequestBody Reading updateReading){
        readingService.updateReading(updateReading);
    }

    //Delete a Hydrometer by ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteReading(@PathVariable("id") long id){
        readingService.deleteReading(id);
    }

}