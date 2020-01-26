package com.api.validator;

//import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.api.model.Recipe;
import com.common.CommonValidations;

//@Component("beforeCreateRecipeValidator")
public class RecipeValidator implements Validator, CommonValidations {

    @Override
    public boolean supports(Class<?> clazz) {
        return Recipe.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Recipe recipe = (Recipe) target;
        if (checkInputString(recipe.getMethod())) {
            errors.rejectValue("recipe", "recipe.empty");
        }
        if (checkInputString(recipe.getIngredients())){
            errors.rejectValue("ingredients", "ingredients.empty");
        }
    }

}