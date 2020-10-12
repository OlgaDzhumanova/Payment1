package ru.sbrf.User.Validation;

import ru.sbrf.User.ExceptionUser;

public class ValidationUserNumber {
    private String userNumber;

    public boolean ValidationUserNumber(String userNumber){
        if (userNumber.length() != 8){
            throw new ExceptionUser("invalid userNumber" + userNumber);
        } else {
            return true;
        }
    }
}
