package com.decorator;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.89);
    }
}
