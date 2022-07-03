package com.decorator.mine.condiment;

import java.math.BigDecimal;

public class Soy implements Condiment {
    @Override
    public String getDescription() {
        return "두유";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.15);
    }
}
