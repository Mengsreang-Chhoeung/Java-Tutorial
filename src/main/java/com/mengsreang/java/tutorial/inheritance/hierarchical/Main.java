package com.mengsreang.java.tutorial.inheritance.hierarchical;

public class Main {
    
    public static void main(String[] args) {
        
        // create objects
        Apple apple = new Apple();
        Banana banna = new Banana();
        Orange orange = new Orange();
        // add values to attribute of objects
        apple.name = "Apple";
        apple.price = 1.0;
        banna.name = "Banana";
        banna.price = 0.5;
        orange.name = "Orange";
        orange.price = 1.5;
        // output
        apple.output();
        banna.output();
        orange.output();
        
    }
    
}
