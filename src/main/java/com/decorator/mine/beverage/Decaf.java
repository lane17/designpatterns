package com.decorator.mine.beverage;

import java.math.BigDecimal;

public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        return "디카페인";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.05);
    }
}
