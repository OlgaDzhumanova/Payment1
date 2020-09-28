package ru.sbrf.Application.ValidatinApp;

import ru.sbrf.Application.ExceptionApp;

public class ValidationAmount {
    private float amount;

    public float ValidationAmount(float amount) {
        if (amount <= 0) {
            throw new ExceptionApp("invalid amount" + amount);
        } else { }
        return amount;
    }
}
