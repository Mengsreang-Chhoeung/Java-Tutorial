package com.mengsreang.java.tutorial.inheritance.hierarchical;

// Super class
public class Fruit {
    // define attributes
    protected String name;
    protected Double price;
    
    // define a method
    protected void output() {
        System.out.println("Fruit name: " + name + " and price: $" + price);
    }
}
