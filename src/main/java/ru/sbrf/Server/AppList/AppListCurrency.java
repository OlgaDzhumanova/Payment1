package ru.sbrf.Server.AppList;

import ru.sbrf.Application.UserApp;

import java.util.ArrayList;

public class AppListCurrency {
    private String currency;
    UserApp userApp = new UserApp();

        public ArrayList <String> inListCurrency(String c){
            ArrayList<String> currencies = new ArrayList<>();
            currency = userApp.getCurrency();
            if (!(currencies.contains(currency))) {
                currencies.add(currency);
            } else {
                return currencies;
            }
            return currencies;
        }
    }
