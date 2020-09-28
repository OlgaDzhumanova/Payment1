package ru.sbrf;

import ru.sbrf.Application.Application;
import ru.sbrf.Application.ValidatinApp.ValidationAmount;
import ru.sbrf.User.UserIn;
import ru.sbrf.User.UserNumber;

import java.util.Currency;

public class Payment {
    public static void main(String[] args) throws Exception {
        Application application = new Application();
        application.EnterCurrency();

    }
}
