package com.decorator.mine;

import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;

public interface Beverage {
    List<Condiment> condiments = Lists.newArrayList();
    String getDescription();

    BigDecimal cost();

    void setSize();
    Size getSize();

    void addCondiment();

    static List<Condiment> getCondiments() { // 의미적으로 이게 맞나...
        return condiments;
    }

//    default BigDecimal totalCost() {
//        if(CollectionUtils.isEmpty(condiments)) {
//
//        }
//    }
}
