package com.api.repository;

import java.util.List;

import com.api.model.Recipe;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("RecipeRepository")
@EntityScan(basePackageClasses = Recipe.class)
public interface RecipeRepository extends CrudRepository<Recipe, Long>{
    List<Recipe> findAll();
    Recipe findByRecipeID(long recipeID);
}