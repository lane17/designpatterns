package com.adapter;

public class MallardDuck implements Duck {

    @Override
    public void guack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
