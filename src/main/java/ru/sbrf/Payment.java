package ru.sbrf;

import ru.sbrf.Application.Application;
import ru.sbrf.Application.ValidatinApp.ValidationAmount;
import ru.sbrf.User.UserIn;
import ru.sbrf.User.UserNumber;

import java.util.Currency;

public class Payment {
    UserIn userIn = new UserIn();
    Application application = new Application();
    public void Payment() throws Exception {
        System.out.println("Введите ваш индефикационный номер");
        userIn.EnterUserNumber();
        System.out.println("Введите номер счета для списания");
        userIn.EnterAccountNumber();
        System.out.println("Введите номер телефона для оплаты");
        application.EnterPhoneNumber();
        System.out.println("Введите сумму");
        application.EnterAmount();
        System.out.println("Выберите валюту");
        application.EnterCurrency();
    }

    public static void main(String[] args) throws Exception {

    }
}
