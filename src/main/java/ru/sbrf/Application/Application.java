package ru.sbrf.Application;

import ru.sbrf.Server.AppList;

import java.util.Scanner;

public class Application {

    Scanner scanner = new Scanner(System.in);
    AppList appList = new AppList();

    public void EnterAmount() {
        System.out.println("Введите сумму");
        float a = scanner.nextFloat();
        if (new ValidationApp().ValidationAmount(a) != true) {
            System.out.println("Введена некорректная сумма");
        } else if (appList.inListAmount(a).equals(a)) {
            System.out.println("Ошибка: reentering Amount");
        } else {
            System.out.println("Сумма перевода:" + a);
        }
    }

    public void EnterPhoneNumber(){
        System.out.println("Введите номер телефона");
        String p = scanner.nextLine();
        if (new ValidationApp().ValidationPhoneNumber(p) != true){
            System.out.println("Введен некорректный номер телефона");
        }else if (appList.inListPhoneNumber(p).equals(p)) {
            System.out.println("Ошибка: reentering PhoneNumber");
        }else {
            System.out.println("Номер телефона:"+ p);
        }


    }

    public void EnterCurrency(){
        System.out.println("Введите валюту платежа");
        String c = scanner.nextLine();
        if (new ValidationApp().ValidationCurrency(c) != true){
            System.out.println("Введена некорректная валюта");
        }else if (appList.inListCurrency(c).equals(c)){
            System.out.println("Ошибка: reentering Currency");
        }else {
            System.out.println("Введене валюта:" + c);
        }

        }
}
