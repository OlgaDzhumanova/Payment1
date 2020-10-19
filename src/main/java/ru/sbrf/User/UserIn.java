package ru.sbrf.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sbrf.Server.UserList;
import ru.sbrf.User.Validation.ValidationUserAccountNumber;
import ru.sbrf.User.Validation.ValidationUserNumber;

import java.util.Scanner;
@Configuration

public class UserIn {
    Scanner scanner = new Scanner(System.in);
    UserList userList = new UserList();
@Bean
    public void enterUserNumber() throws Exception {
        System.out.println("Введите ваш индефикационный номер");
        String u = scanner.nextLine();
        if (new ValidationUserNumber().validationUserNumber(u) != true){
            System.out.println("Введен некорректный индефикационный номер");
        }else if (userList.inListUserNumber(u).equals(u)){
            System.out.println("Ошибка: reentering UserNumber");
        }else {
            System.out.println("Вы индефицированы");
        }

        }
@Bean
        public void enterAccountNumber() throws Exception {
            System.out.println("Введите номер счета");
            String a = scanner.nextLine();
            if (new ValidationUserAccountNumber<String>().validationAccountNumber(a) != true){
                System.out.println("Введен некорректный номер счета");
            } else if (userList.inListAccountNumber(a).equals(a)){
                System.out.println(" Ошибка: reentering AccountNumber");
            }else {
                System.out.println("Номер счета принят");
            }

        }
    }



