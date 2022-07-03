package com.decorator.mine.beverage;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "다크로스트";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.99);
    }
}
