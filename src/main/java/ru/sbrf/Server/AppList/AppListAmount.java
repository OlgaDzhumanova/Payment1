package ru.sbrf.Server.AppList;

import ru.sbrf.Application.UserApp;

import java.util.ArrayList;


public class AppListAmount {
    private float amount;
    UserApp userApp = new UserApp();

    public ArrayList<Float> inListAmount(float a) {
        ArrayList<Float> amounts = new ArrayList<>();
        amount = userApp.getAmount();
        if (!(amounts.contains(amount))) {
            amounts.add(amount);
        } else {
            return amounts;
        }
        return amounts;
    }
}
