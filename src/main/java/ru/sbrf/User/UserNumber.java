package ru.sbrf.User;

import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class UserNumber {
    private String userNumber;

    public UserNumber() {
        Scanner scanner = new Scanner(System.in);
        userNumber = scanner.nextLine();

    }

    public String isUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }
}
