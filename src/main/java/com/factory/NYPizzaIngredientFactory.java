package com.factory;

import com.factory.cheese.Cheese;
import com.factory.cheese.ReggianoCheese;
import com.factory.clams.Clams;
import com.factory.clams.FreshClams;
import com.factory.dough.Dough;
import com.factory.dough.ThinCrustDough;
import com.factory.pepperoni.Pepperoni;
import com.factory.pepperoni.SlicedPepperoni;
import com.factory.sauce.MarinaraSauce;
import com.factory.sauce.Sauce;
import com.factory.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
