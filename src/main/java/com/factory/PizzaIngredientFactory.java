package com.factory;

import com.factory.cheese.Cheese;
import com.factory.clams.Clams;
import com.factory.dough.Dough;
import com.factory.pepperoni.Pepperoni;
import com.factory.sauce.Sauce;
import com.factory.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
