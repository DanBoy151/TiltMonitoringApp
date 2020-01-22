package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.model.Recipe;
import com.api.repository.RecipeRepository;

@Component("RecipeService")
public class RecipeService{

    @Autowired
    private RecipeRepository recipeRepository;


    //Create
    public boolean createRecipe(Recipe recipe){
        recipeRepository.save(recipe);
        return true;
    }

    //Retrieve
    public Recipe retrieveRecipe(long id){
      return recipeRepository.findByRecipeID(id);
    }

    //Update
    public boolean updateRecipe(Recipe recipe){
        recipeRepository.save(recipe);
        return true;
    }

    //Delete
    public boolean deleteRecipe(long id){
        recipeRepository.deleteById(id);
        return true;
    }

}