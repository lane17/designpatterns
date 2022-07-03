package com.decorator.mine;

import com.decorator.mine.beverage.Beverage;
import com.decorator.mine.beverage.DarkRoast;
import com.decorator.mine.beverage.Espresso;
import com.decorator.mine.beverage.HouseBlend;
import com.decorator.mine.condiment.Mocha;
import com.decorator.mine.condiment.Soy;
import com.decorator.mine.condiment.Whip;

public class StarBuzzCoffeeMine {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getAllDescription() + " $" + beverage.totalCost());

        Beverage beverage2 = new DarkRoast();
        beverage2.addCondiment(new Mocha());

        beverage2.addCondiment(new Mocha());
        beverage2.addCondiment(new Whip());
        System.out.println(beverage2.getAllDescription() + " $" + beverage2.totalCost());

        Beverage beverage3 = new HouseBlend();
        beverage3.addCondiment(new Soy());
        beverage3.addCondiment(new Mocha());
        beverage3.addCondiment(new Whip());
        System.out.println(beverage3.getAllDescription() + " $" + beverage3.totalCost());
    }
}
