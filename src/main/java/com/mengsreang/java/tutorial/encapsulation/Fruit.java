package com.mengsreang.java.tutorial.encapsulation;

// create a class
public class Fruit {
    // define attributes
    private String name = "Apple";
    private Double price = 1.0;
    
    // define methods
    public String getName() {
        return name;
    }
    
    public void setName(String _name) {
        name = _name;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double _price) {
        price = _price;
    }
}
