package ru.sbrf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sbrf.Application.Application;
import ru.sbrf.User.UserIn;
@SpringBootApplication

public class Payment {
    UserIn userIn = new UserIn();
    Application application = new Application();

    public void Payment() throws Exception {

        userIn.enterUserNumber();
        userIn.enterAccountNumber();
        application.enterPhoneNumber();
        application.enterAmount();
        application.enterCurrency();
    }
    public static void main(String[] args) {
        SpringApplication.run(Payment.class, args);
    }
}

