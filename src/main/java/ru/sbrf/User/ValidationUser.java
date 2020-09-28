package ru.sbrf.User;


public class ValidationUser extends ExceptionUser{
    private String accountNumber;
    private String userNumber;

    public ValidationUser ValidationAccountNumber(String accountNumber){
        if(accountNumber.length() != 20){
            throw  new ExceptionUser("Invalid AccountNumber" + accountNumber);
        }else { }
            return this;
        }

    public ValidationUser ValidationUserNumber(String userNumber){
        if(userNumber.length() != 8) {
            throw  new ExceptionUser("Invalid UserNumber" + userNumber);
        }else { }
            return this;
        }

    }
