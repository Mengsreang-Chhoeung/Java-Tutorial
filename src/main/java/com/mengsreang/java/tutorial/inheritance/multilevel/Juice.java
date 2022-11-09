package com.mengsreang.java.tutorial.inheritance.multilevel;

// Sub Class
public class Juice extends Fruit {
    // define attribute
    protected String flavors;
    
    // define methods
    protected String getFlavors() {
        return flavors;
    }
    
    protected void setFlavors(String _flavors) {
        flavors = _flavors;
    }
}
