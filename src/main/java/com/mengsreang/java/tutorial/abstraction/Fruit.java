package com.mengsreang.java.tutorial.abstraction;

// Super Class
abstract class Fruit {
    // define methods
    public abstract void output();
    
    final public void greeting() {
        System.out.println("Hello Fruit");
    }
}
