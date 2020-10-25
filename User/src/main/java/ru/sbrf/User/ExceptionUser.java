package ru.sbrf.User;

public class ExceptionUser extends RuntimeException{
    private boolean accountNumber;
    private boolean userNumber;

    public ExceptionUser() {
    }

    public ExceptionUser(String message) {
        super(message);
    }

    public ExceptionUser(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionUser(Throwable cause) {
        super(cause);
    }

    public ExceptionUser(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
