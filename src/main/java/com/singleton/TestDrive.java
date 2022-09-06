package com.singleton;

public class TestDrive {
    public static void main(String[] args) {
        System.out.println("Test Drive");
        Singleton singleton = Singleton.getInstance();
        System.out.println("I got it!");
    }
}
