package com.decorator;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.10).add(this.beverage.cost());
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 휘핑크림";
    }
}
