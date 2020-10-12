package ru.sbrf.Application;


public class ValidationApp extends ExceptionApp {

    public boolean ValidationPhoneNumber(String phoneNumber) {
        if ((phoneNumber.length() != 12) && (!phoneNumber.startsWith("+7"))) {
            throw new ExceptionApp("invalid PhoneNumber" + phoneNumber);
        } else {
            return true;
        }
    }

    public boolean ValidationCurrency(String currency) {
        if (!(currency.equals(UserApp.Curr.values()))){
            throw new ExceptionApp("Invalid currency");
        }else {
            return true;
        }

        }

    public boolean ValidationAmount(float amount) {
        if (amount <= 0) {
            throw new ExceptionApp("invalid amount");
        } else {
            return true;
        }
    }
}

