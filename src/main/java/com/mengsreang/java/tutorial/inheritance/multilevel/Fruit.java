package com.mengsreang.java.tutorial.inheritance.multilevel;

// Super Class
public class Fruit {
    // define attributes
    protected String name;
    protected Double price;
    
    // define methods
    protected String getName() {
        return name;
    }
    
    protected void setName(String _name) {
        name = _name;
    }
    
    protected Double getPrice() {
        return price;
    }
    
    protected void setPrice(Double _price) {
        price = _price;
    }
}
