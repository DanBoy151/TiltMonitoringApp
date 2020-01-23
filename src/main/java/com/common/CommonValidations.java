package com.common;

import java.math.BigDecimal;
import java.util.Date;

public interface CommonValidations {

    default boolean checkInputString(String input) {
        return (input == null || input.trim().length() == 0);
    }

    default boolean checkInputDate(Date input) {
        return (input ==null);
    }

     default boolean checkInputDecimal(BigDecimal input) {
        return (input ==null || input.compareTo(BigDecimal.ZERO) < 0);
    }

}