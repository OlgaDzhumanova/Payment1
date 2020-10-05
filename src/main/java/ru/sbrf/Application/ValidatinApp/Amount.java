package ru.sbrf.Application.ValidatinApp;

import ru.sbrf.Application.ExceptionApp;

import java.util.function.DoubleConsumer;

public class Amount implements DoubleConsumer {

    @Override
    public void accept(double value) {
        if (value <= 0){
            throw new ExceptionApp("invalid amount");
        }else {
            return;
        }
    }
}

