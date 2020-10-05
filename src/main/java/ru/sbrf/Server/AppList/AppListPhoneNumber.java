package ru.sbrf.Server.AppList;

import ru.sbrf.Application.UserApp;

import java.util.ArrayList;

public class AppListPhoneNumber {
    private String phoneNumber;
    UserApp userApp = new UserApp();

    public ArrayList<String> inListPhoneNumber(String p) {
        ArrayList<String> phoneNumbers = new ArrayList<>();
        phoneNumber = userApp.getPhoneNumber();
        if (!(phoneNumbers.contains(phoneNumber))) {
            phoneNumbers.add(phoneNumber);
        } else {
            return phoneNumbers;
        }
        return phoneNumbers;
    }
}
