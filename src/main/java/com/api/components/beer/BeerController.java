package com.api.components.beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

@RestController
@RequestMapping("/beer")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping("/{id}")
    public @ResponseBody Beer getBeer(@PathVariable("id") long id){
        return beerService.retrieveBeer(id);
    }

    //Create New Beer
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void newBeer(@RequestBody Beer newBeer){
        beerService.createBeer(newBeer);
    }

    //Update a Specific Beer
   @PutMapping("/{id}}")
   @ResponseStatus(HttpStatus.OK)
    public void putBeer(@PathVariable("id") long id, @RequestBody Beer updateBeer){

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteBeer(@PathVariable("id") long id){

    }

}