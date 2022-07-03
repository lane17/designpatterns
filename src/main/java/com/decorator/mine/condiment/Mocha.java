package com.decorator.mine.condiment;

import java.math.BigDecimal;

public class Mocha implements Condiment {
    @Override
    public String getDescription() {
        return "모카";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.2);
    }
}
