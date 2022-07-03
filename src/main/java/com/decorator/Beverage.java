package com.decorator;

import java.math.BigDecimal;

public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }
    public abstract BigDecimal cost();
}
