package ru.sbrf.Application.ValidatinApp;

import ru.sbrf.Application.ExceptionApp;

public class ValidationAmount {
    private float amount;

    public float ValidationAmount(float amount) {
        new Amount().accept(amount);
        return amount;
    }
}
