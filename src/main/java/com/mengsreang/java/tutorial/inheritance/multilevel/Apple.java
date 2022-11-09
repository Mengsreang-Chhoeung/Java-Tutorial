package com.mengsreang.java.tutorial.inheritance.multilevel;

// Sub Class
public class Apple extends Juice {
    // define a method
    public void output() {
        System.out.println("Fruit name: " + name + " and price: $" + price);
        System.out.println("Fruit juice flavors: " + flavors);
    }
}
