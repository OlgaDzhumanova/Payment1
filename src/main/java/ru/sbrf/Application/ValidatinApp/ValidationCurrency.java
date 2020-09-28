package ru.sbrf.Application.ValidatinApp;


import ru.sbrf.Application.ExceptionApp;
import ru.sbrf.Application.UserApp;

public class ValidationCurrency{
    UserApp.Curr cur = UserApp.Curr.EUR;
    UserApp.Curr cur2 = UserApp.Curr.RUB;
    UserApp.Curr cur3 = UserApp.Curr.USD;

    public String ValidationCurrency(String s){
        if ((s.equals(cur))&&(s.equals(cur2))&&(s.equals(cur3))) {
            return s;
        } else {
            throw new ExceptionApp("invalid currency");
        }
    }


}


