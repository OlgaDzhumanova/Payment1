package ru.sbrf.Application;

public class ExceptionApp  extends RuntimeException{
    public ExceptionApp() {
    }

    public ExceptionApp(String message) {
        super(message);
    }

    public ExceptionApp(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionApp(Throwable cause) {
        super(cause);
    }

    public ExceptionApp(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
