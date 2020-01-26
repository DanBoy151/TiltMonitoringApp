package com.api.validator;

//import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.api.model.Beer;
import com.api.model.Recipe;
import com.common.CommonValidations;

//@Component("beforeCreateBeerValidator")
public class BeerValidator implements Validator, CommonValidations {

    @Override
    public boolean supports(Class<?> clazz) {
        return Beer.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Beer beer = (Beer) target;
        if (checkInputString(beer.getName())) {
            errors.rejectValue("name", "name.empty");
        }
        if (checkInputDate(beer.getStartDate())){
            errors.rejectValue("startDate", "startDate.empty");
        }
        if (checkInputDecimal(beer.getFg())){
            errors.rejectValue("fG", "fG.empty");
        }
        if (checkInputDecimal(beer.getOg())){
            errors.rejectValue("oG", "oG.empty");
        }
        if (checkInputRecipe(beer.getRecipe())){
            errors.rejectValue("recipe", "recipe.empty");
        }
    }

     private boolean checkInputRecipe(Recipe input) {
        if (input == null){
            return true;
        }
        return false;
    }

}