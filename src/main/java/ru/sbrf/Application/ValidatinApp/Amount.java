package ru.sbrf.Application.ValidatinApp;

import lombok.SneakyThrows;
import ru.sbrf.Application.ExceptionApp;
import ru.sbrf.User.ExceptionUser;

import javax.sql.RowSet;
import javax.sql.rowset.Predicate;
import java.sql.SQLException;
import java.util.function.Consumer;
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

