package com.decorator.mine.condiment;

import java.math.BigDecimal;

public class Whip implements Condiment {
    @Override
    public String getDescription() {
        return "휘핑크림";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.10);
    }
}