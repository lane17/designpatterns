package com.decorator.mine.condiment;

import java.math.BigDecimal;

public class SteamMilk implements Condiment {
    @Override
    public String getDescription() {
        return "스팀밀크";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.1);
    }
}

