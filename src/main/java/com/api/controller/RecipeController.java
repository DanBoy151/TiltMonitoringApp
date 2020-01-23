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

    //Update a Specific Recipe
   @PutMapping("/{id}")
   @ResponseStatus(HttpStatus.OK)
    public void putRecipe(@PathVariable("id") long id, @RequestBody Recipe updateRecipe){
        recipeService.updateRecipe(updateRecipe);
    }

}