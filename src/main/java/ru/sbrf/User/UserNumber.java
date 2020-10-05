package ru.sbrf.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Scanner;

@AllArgsConstructor
@Getter
public class UserNumber {
    private String userNumber;

    public UserNumber() {
    }

    public String getUserNumber(String u) {
        return u;
    }
}
