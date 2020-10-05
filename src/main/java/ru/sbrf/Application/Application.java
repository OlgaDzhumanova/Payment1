package ru.sbrf.Application;

import ru.sbrf.Application.ValidatinApp.ValidationAmount;
import ru.sbrf.Application.ValidatinApp.ValidationCurrency;
import ru.sbrf.Application.ValidatinApp.ValidationPhoneNumber;
import ru.sbrf.Server.AppList.AppListAmount;
import ru.sbrf.Server.AppList.AppListCurrency;
import ru.sbrf.Server.AppList.AppListPhoneNumber;

import java.util.Scanner;

public class Application {

    Scanner scanner = new Scanner(System.in);
    UserApp userApp = new UserApp();

    public void EnterAmount(){
        float a = scanner.nextFloat();
        ValidationAmount validationAmount = new ValidationAmount();
        AppListAmount appListAmount = new AppListAmount();
        validationAmount.ValidationAmount(userApp.inAmount(a));
        appListAmount.inListAmount(a);
    }

    public void EnterPhoneNumber(){
        String p = scanner.nextLine();
        ValidationPhoneNumber validationPhoneNumber = new ValidationPhoneNumber();
        AppListPhoneNumber appListPhoneNumber = new AppListPhoneNumber();
        validationPhoneNumber.ValidationPhoneNumber(userApp.inPhoneNumber(p));
        appListPhoneNumber.inListPhoneNumber(p);
    }

    public void EnterCurrency(){
        String c = scanner.nextLine();
        ValidationCurrency validationCurrency = new ValidationCurrency();
        AppListCurrency appListCurrency = new AppListCurrency();
        validationCurrency.ValidationCurrency(c);
        appListCurrency.inListCurrency(c);
    }
}
