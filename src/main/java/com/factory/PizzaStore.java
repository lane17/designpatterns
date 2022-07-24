package com.factory;

public abstract class PizzaStore {
    /**
     * 이 메소드는 어떤 종류의 피자가 만들어졌는지 알지 못한다.
     * 다만 피자라는 것만 알 뿐이다.
     * @param type
     * @return
     */
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = this.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
