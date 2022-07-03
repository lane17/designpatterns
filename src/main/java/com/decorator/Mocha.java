package com.decorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.20).add(this.beverage.cost());
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 모카";
    }
}
