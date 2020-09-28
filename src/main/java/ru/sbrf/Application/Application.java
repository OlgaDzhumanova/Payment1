package ru.sbrf.Application;

import ru.sbrf.Application.ValidatinApp.ValidationAmount;
import ru.sbrf.Application.ValidatinApp.ValidationCurrency;
import ru.sbrf.Application.ValidatinApp.ValidationPhoneNumber;
import ru.sbrf.User.ValidationUser;

import java.util.Scanner;

public class Application {

    Scanner scanner = new Scanner(System.in);
    UserApp userApp = new UserApp();

    public void EnterAmount(){
        float a = scanner.nextFloat();
        ValidationAmount validationAmount = new ValidationAmount();
        validationAmount.ValidationAmount(userApp.inAmount(a));
    }

    public void EnterPhoneNumber(){
        String p = scanner.nextLine();
        ValidationPhoneNumber validationPhoneNumber = new ValidationPhoneNumber();
        validationPhoneNumber.ValidationPhoneNumber(userApp.inPhoneNumber(p));
    }

    public void EnterCurrency(){
        String c = scanner.nextLine();
        ValidationCurrency validationCurrency = new ValidationCurrency();
        validationCurrency.ValidationCurrency(c);
    }
}
