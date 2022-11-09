package com.mengsreang.java.tutorial.interfaces;

// Sub Class
public class Apple implements Fruit {
    // define attributes
    public String name;
    public Double price;
    
    // override method
    @Override
    public void output() {
        System.out.println("Fruit name: " + name + " and price: $" + price);
    }
}
