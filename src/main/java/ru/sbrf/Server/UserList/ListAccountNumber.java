package ru.sbrf.Server.UserList;

import ru.sbrf.User.UserAccountNumber;

import java.util.ArrayList;

public class ListAccountNumber {
    private String accountNumber;
    UserAccountNumber userAccountNumber = new UserAccountNumber();

    public ArrayList<String> inListAccountNumber(String a) {
        ArrayList<String> accountsNumbers = new ArrayList<>();
        accountNumber = userAccountNumber.getAccountNumber();
        if (!(accountsNumbers.contains(accountNumber))) {
            accountsNumbers.add(accountNumber);
        } else {
            return accountsNumbers;
        }
        return accountsNumbers;
    }
}
