package com.mengsreang.java.tutorial.constructor;

// create a class
public class Fruit {
    String name;
    Double price;
    
    // create a default constructor
    public Fruit() {
        name = "Apple";
        price = 1.0;
    }
    
    // create a constructor parameters
    public Fruit(String _name, Double _price) {
        name = _name;
        price = _price;
    }
}
