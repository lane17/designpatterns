package com.decorator.mine.beverage;

import java.math.BigDecimal;

public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "에스프레소";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.99);
    }
}
