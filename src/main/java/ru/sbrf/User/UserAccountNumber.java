package ru.sbrf.User;

import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class UserAccountNumber{
    private String accountNumber;

    public UserAccountNumber() {
        Scanner scanner = new Scanner(System.in);
        accountNumber = scanner.nextLine();

    }

    public String isAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
