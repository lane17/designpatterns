package com.decorator.mine;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public enum SizeType {
    TALL(BigDecimal.valueOf(0.1)),
    GRANDE(BigDecimal.valueOf(0.15)),
    VENTI(BigDecimal.valueOf(0.2));

    public final BigDecimal cost;

    SizeType(BigDecimal cost) {
        this.cost = cost;
    }
}
