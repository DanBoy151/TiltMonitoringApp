package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import com.api.model.Recipe;
import com.api.service.*;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    //Get Recipe by ID
    @GetMapping("/{id}")
    public @ResponseBody Recipe getRecipe(@PathVariable("id") long id){
        return recipeService.retrieveRecipe(id);
    }

    //Create New Recipe
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void newBeer(@RequestBody Recipe newRecipe){
        recipeService.createRecipe(newRecipe);
    }

    //Update a Specific Recipe
   @PutMapping("/{id}")
   @ResponseStatus(HttpStatus.OK)
    public void putRecipe(@PathVariable("id") long id, @RequestBody Recipe updateRecipe){
        recipeService.updateRecipe(updateRecipe);
    }

    //Delete a Recipe by ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteRecipe(@PathVariable("id") long id){
        recipeService.deleteRecipe(id);
    }

}