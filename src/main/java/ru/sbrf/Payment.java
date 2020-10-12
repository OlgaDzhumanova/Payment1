package ru.sbrf;

import ru.sbrf.Application.Application;
import ru.sbrf.User.UserIn;

public class Payment {
    UserIn userIn = new UserIn();
    Application application = new Application();
    public void Payment() throws Exception {
        userIn.EnterUserNumber();
        userIn.EnterAccountNumber();
        application.EnterPhoneNumber();
        application.EnterAmount();
        application.EnterCurrency();
    }

    public static void main(String[] args) throws Exception {

    }
}
