package ru.sbrf.Server;

import java.util.ArrayList;

public class AppList {
    private float amount;
    private String phoneNumber;
    private String currency;

    public void inListAmount(){
        ArrayList<Float> amounts = new ArrayList<>();
        amounts.add(amount);
    }
    public void inListPhoneNumber(){
        ArrayList<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(phoneNumber);
    }
    public void inListCurrency(){
        ArrayList<String> currencies = new ArrayList<>();
        currencies.add(currency);
    }
}
