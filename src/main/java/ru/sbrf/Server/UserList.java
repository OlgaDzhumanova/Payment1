package ru.sbrf.Server;

import java.util.ArrayList;

public class UserList {
    private String accountNumber;
    private String userNumber;

    public void inListAccountNumber(){
        ArrayList<String> accountsNumbers = new ArrayList<>();
        accountsNumbers.add(accountNumber);
    }
    public void inListUserNumber(){
        ArrayList<String> usersNumbers = new ArrayList<>();
        usersNumbers.add(userNumber);
    }
}

