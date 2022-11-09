package com.mengsreang.java.tutorial.inner_class;

// Outer Class
public class Fruit {
    // define attributes
    public String name;
    public Double price;
    
    // Inner Class
    class Apple {
        public void output() {
            System.out.println("Fruit name: " + name + " and price: $" + price);
        }
    }
}
