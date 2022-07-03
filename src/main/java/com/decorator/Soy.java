package com.decorator;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.15).add(this.beverage.cost());
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 두유";
    }
}
