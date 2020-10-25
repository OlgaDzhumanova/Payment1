package ru.sbrf.Application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sbrf.Server.AppList;

import java.util.Scanner;

@Configuration

public class Application {

    Scanner scanner = new Scanner(System.in);
    AppList appList = new AppList();
@Bean
    public void enterAmount() {
        System.out.println("Введите сумму");
        float a = scanner.nextFloat();
        if (new ValidationApp().validationAmount(a) != true) {
            System.out.println("Введена некорректная сумма");
        } else if (appList.inListAmount(a).equals(a)) {
            System.out.println("Ошибка: reentering Amount");
        } else {
            System.out.println("Сумма перевода:" + a);
        }
    }
@Bean
    public void enterPhoneNumber(){
        System.out.println("Введите номер телефона");
        String p = scanner.nextLine();
        if (new ValidationApp().validationPhoneNumber(p) != true){
            System.out.println("Введен некорректный номер телефона");
        }else if (appList.inListPhoneNumber(p).equals(p)) {
            System.out.println("Ошибка: reentering PhoneNumber");
        }else {
            System.out.println("Номер телефона:"+ p);
        }


    }
@Bean
    public void enterCurrency(){
        System.out.println("Введите валюту платежа");
        String c = scanner.nextLine();
        if (new ValidationApp().validationCurrency(c) != true){
            System.out.println("Введена некорректная валюта");
        }else if (appList.inListCurrency(c).equals(c)){
            System.out.println("Ошибка: reentering Currency");
        }else {
            System.out.println("Введене валюта:" + c);
        }

        }
}
