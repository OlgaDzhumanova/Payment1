package ru.sbrf.Application.ValidatinApp;

import ru.sbrf.Application.ExceptionApp;

public class ValidationPhoneNumber extends ExceptionApp {
    private String phoneNumber;

    public ExceptionApp ValidationPhoneNumber(String phoneNumber) {
        if ((phoneNumber.length() != 12) && (!phoneNumber.startsWith("+7"))) {
            throw  new ExceptionApp("invalid PhoneNumber" + phoneNumber);
        } else { }
        return this;
    }
}

