package com.factory;

import com.factory.cheese.Cheese;
import com.factory.clams.Clams;
import com.factory.dough.Dough;
import com.factory.pepperoni.Pepperoni;
import com.factory.sauce.Sauce;
import com.factory.veggies.Veggies;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.getName();
    }
}
