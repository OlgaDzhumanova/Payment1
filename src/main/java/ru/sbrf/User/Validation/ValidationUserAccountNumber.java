package ru.sbrf.User.Validation;

import ru.sbrf.User.ExceptionUser;

public class ValidationUserAccountNumber <T> {
    private String accountNumber;
    public boolean ValidationAccountNumber(T a){
        a = (T) accountNumber;
        if(accountNumber.length()!= 20){
            throw new ExceptionUser("invalid accountNumber" + accountNumber);
        }else {
            return true;
        }

    }
}
