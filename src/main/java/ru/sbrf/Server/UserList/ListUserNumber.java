package ru.sbrf.Server.UserList;

import ru.sbrf.User.UserNumber;

import java.util.ArrayList;

public class ListUserNumber {
    private String userNumber;
    UserNumber userNum = new UserNumber();

    public ArrayList<String> inListUserNumber(String u) {
        ArrayList<String> usersNumbers = new ArrayList<>();
        userNumber = userNum.getUserNumber();
        if (!(usersNumbers.contains(userNumber))) {
            usersNumbers.add(userNumber);
        } else {
            return usersNumbers;
        }
        return usersNumbers;
    }
}

