package ru.sbrf.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Scanner;

@AllArgsConstructor
@Getter
public class UserAccountNumber {
    private String accountNumber;

    public UserAccountNumber() {

    }

    public String getAccountNumber(String a) {
        return a;
    }
}


