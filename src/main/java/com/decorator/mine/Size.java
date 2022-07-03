package com.decorator.mine;

import java.math.BigDecimal;

public enum Size {
    TALL(BigDecimal.valueOf(0.1)),
    GRANDE(BigDecimal.valueOf(0.15)),
    VENTI(BigDecimal.valueOf(0.2));

    BigDecimal cost;

    Size(BigDecimal cost) {
        this.cost = cost;
    }
}
