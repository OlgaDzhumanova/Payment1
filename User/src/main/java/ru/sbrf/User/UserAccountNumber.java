package ru.sbrf.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

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


