package ru.sbrf.User;

import ru.sbrf.Server.UserList;
import ru.sbrf.User.Validation.ValidationUserAccountNumber;
import ru.sbrf.User.Validation.ValidationUserNumber;

import java.util.Scanner;

public class UserIn {
    Scanner scanner = new Scanner(System.in);
    UserList userList = new UserList();

    public void EnterUserNumber() throws Exception {
        System.out.println("Введите ваш индефикационный номер");
        String u = scanner.nextLine();
        if (new ValidationUserNumber().ValidationUserNumber(u) != true){
            System.out.println("Введен некорректный индефикационный номер");
        }else if (userList.inListUserNumber(u).equals(u)){
            System.out.println("Ошибка: reentering UserNumber");
        }else {
            System.out.println("Вы индефицированы");
        }

        }

        public void EnterAccountNumber() throws Exception {
            System.out.println("Введите номер счета");
            String a = scanner.nextLine();
            if (new ValidationUserAccountNumber<String>().ValidationAccountNumber(a) != true){
                System.out.println("Введен некорректный номер счета");
            } else if (userList.inListAccountNumber(a).equals(a)){
                System.out.println(" Ошибка: reentering AccountNumber");
            }else {
                System.out.println("Номер счета принят");
            }

        }
    }



