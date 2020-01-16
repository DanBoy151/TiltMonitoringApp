package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import com.api.model.Sample;
import com.api.service.*;

@RestController
@RequestMapping("/samples")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    //Retrieve Sample
    @GetMapping("/{id}")
    public @ResponseBody Sample getSample(@PathVariable("id") long id){
        return sampleService.retrieveSample(id);
    }

    //Create New Beer
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void newSample (@RequestBody Sample newSample){
        sampleService.createSample(newSample);
    }

    //Update a Specific Sample
   @PutMapping("/{id}}")
   @ResponseStatus(HttpStatus.OK)
    public void putSample(@PathVariable("id") long id, @RequestBody Sample updateSample){

    }

    //Delete a Specific Sample
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteSample(@PathVariable("id") long id){

    }

}