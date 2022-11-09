package com.mengsreang.java.tutorial.abstraction;

// Sub Class
public class Apple extends Fruit {
    // define attributes
    public String name;
    public Double price;
    
    // override method
    @Override
    public void output() {
        System.out.println("Fruit name: " + name + " and price: $" + price);
    }
}
