package com.decorator.mine.beverage;

import com.decorator.mine.SizeType;
import com.decorator.mine.condiment.Condiment;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Beverage {
    private final List<Condiment> condiments = Lists.newArrayList();
    private SizeType sizeType = SizeType.TALL;

    public abstract String getDescription();

    public abstract BigDecimal cost();

    public void setSize(SizeType sizeType) {
        this.sizeType = sizeType;
    }

    public SizeType getSize() {
        return this.sizeType;
    }

    public void addCondiment(Condiment condiment) {
        this.condiments.add(condiment);
    }

    public List<Condiment> getCondiments() {
        return this.condiments;
    }

    public BigDecimal totalCost() {
        if (CollectionUtils.isEmpty(this.condiments)) {
            return this.cost().add(this.getSize().getCost());
        }

        return this.cost()
                .add(this.getSize().getCost())
                .add(this.condiments.stream()
                        .map(Condiment::cost)
                        .reduce(BigDecimal.ZERO, BigDecimal::add));
    }

    public String getAllDescription() {
        if (CollectionUtils.isEmpty(this.condiments)) {
            return getDescription();
        }

        return getDescription() + ", "
                + this.condiments.stream()
                .map(Condiment::getDescription)
                .collect(Collectors.joining(", "));
    }
}
