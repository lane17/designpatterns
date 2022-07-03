package com.decorator.mine.beverage;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "하우스블렌드";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.89);
    }
}
