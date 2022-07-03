package com.decorator;

import java.math.BigDecimal;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }
    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.99);
    }
}
