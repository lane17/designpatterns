package com.factory;

import com.factory.cheese.Cheese;
import com.factory.cheese.Mozzarella;
import com.factory.clams.Clams;
import com.factory.clams.FrozenClam;
import com.factory.dough.Dough;
import com.factory.dough.ThickCrustDough;
import com.factory.pepperoni.Pepperoni;
import com.factory.pepperoni.SlicedPepperoni;
import com.factory.sauce.PlumTomatoSauce;
import com.factory.sauce.Sauce;
import com.factory.veggies.BlackOlives;
import com.factory.veggies.EggPlant;
import com.factory.veggies.Spinach;
import com.factory.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClam();
    }
}
