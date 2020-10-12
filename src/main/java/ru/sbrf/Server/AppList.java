package ru.sbrf.Server;

import ru.sbrf.Application.ExceptionApp;
import ru.sbrf.Application.UserApp;

import java.util.ArrayList;

public class AppList {
    private String phoneNumber;
    private String currency;
    private float amount;
    UserApp userApp = new UserApp();

    public AppList inListPhoneNumber(String p) {
        ArrayList<String> phoneNumbers = new ArrayList<>();
        phoneNumber = userApp.getPhoneNumber();
        if ((phoneNumbers.contains(phoneNumber))) {
            throw new ExceptionApp("reentering PhoneNumber");
        } else {
            phoneNumbers.add(phoneNumber);
            return this;
        }
    }

    public AppList inListCurrency(String c) {
        ArrayList<String> currencies = new ArrayList<>();
        currency = userApp.getCurrency();
        if ((currencies.contains(currency))) {
            throw new ExceptionApp("reentering Currency");
        } else {
            currencies.add(currency);
            return this;
        }
    }


        public AppList inListAmount (float a){
            ArrayList<Float> amounts = new ArrayList<>();
            amount = userApp.getAmount();
            if ((amounts.contains(amount))) {
                throw new ExceptionApp("reentering Amount");
            } else {
                amounts.add(amount);
                return this;
            }
        }
    }

