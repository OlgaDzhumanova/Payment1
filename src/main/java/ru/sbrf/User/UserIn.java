package ru.sbrf.User;

import ru.sbrf.Server.UserList.ListAccountNumber;
import ru.sbrf.Server.UserList.ListUserNumber;
import ru.sbrf.User.Validation.ValidationUserAccountNumber;
import ru.sbrf.User.Validation.ValidationUserNumber;

import java.util.Scanner;

public class UserIn {
    Scanner scanner = new Scanner(System.in);

    public void EnterUserNumber() throws Exception {
        String u = scanner.nextLine();
        UserNumber userNumber = new UserNumber();
        ValidationUserNumber validationUserNumber = new ValidationUserNumber();
        ListUserNumber listUserNumber = new ListUserNumber();
        validationUserNumber.ValidationUserNumber(userNumber.getUserNumber(u));
        listUserNumber.inListUserNumber(u);

        }

        public void EnterAccountNumber() throws Exception {
            String a = scanner.nextLine();
            ValidationUserAccountNumber validationUserAccountNumber = new ValidationUserAccountNumber();
            ListAccountNumber listAccountNumber = new ListAccountNumber();
            UserAccountNumber userAccountNumber = new UserAccountNumber();
            validationUserAccountNumber.ValidationAccountNumber(userAccountNumber.getAccountNumber(a));
            listAccountNumber.inListAccountNumber(a);
        }
    }



