package ru.sbrf.User;

import java.util.Scanner;

public class UserIn {
    Scanner scanner = new Scanner(System.in);
    ValidationUser validationUser = new ValidationUser();

    public void EnterUserNumber() throws Exception {
        UserNumber userNumber = new UserNumber();
        validationUser.ValidationUserNumber(userNumber.isUserNumber());
        return;
        }

        public void EnterAccountNumber() throws Exception {
            UserAccountNumber userAccountNumber = new UserAccountNumber();
            validationUser.ValidationAccountNumber(userAccountNumber.isAccountNumber());
        }
    }



