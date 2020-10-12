package ru.sbrf.Server;

import ru.sbrf.User.ExceptionUser;
import ru.sbrf.User.UserAccountNumber;
import ru.sbrf.User.UserNumber;

import java.util.ArrayList;

public class UserList {
    private String userNumber;
    private String accountNumber;
    UserNumber userNum = new UserNumber();
    UserAccountNumber userAccountNumber = new UserAccountNumber();

    public UserList inListUserNumber(String u) {
        ArrayList<String> usersNumbers = new ArrayList<>();
        userNumber = userNum.getUserNumber();
        if ((usersNumbers.contains(userNumber))) {
            throw new ExceptionUser("reentering UserNumber");
        } else {
            usersNumbers.add(userNumber);
            return this;
        }
    }
    public UserList inListAccountNumber(String a) {
        ArrayList<String> accountsNumbers = new ArrayList<>();
        accountNumber = userAccountNumber.getAccountNumber();
        if ((accountsNumbers.contains(accountNumber))) {
            throw new ExceptionUser("reentering AccountNumber");
        } else {
            accountsNumbers.add(accountNumber);
            return this;
        }
    }
}

