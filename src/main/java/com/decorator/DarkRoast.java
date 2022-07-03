package com.decorator;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "다크로스트";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.99);
    }
}
