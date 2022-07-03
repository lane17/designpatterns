package com.decorator.mine;

import java.math.BigDecimal;
import java.util.List;

public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "에스프레소";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1.99);
    }

    @Override
    public void setSize() {

    }

    @Override
    public Size getSize() {
        return null;
    }

    @Override
    public void addCondiment() {

    }
}
