package com.mengsreang.java.tutorial.polymorphism;

public class Main {
    
    public static void main(String[] args) {
        
        // create objects
        Fruit apple = new Apple();
        Fruit banna = new Banana();
        // add values to attribute of objects
        apple.name = "Apple";
        apple.price = 1.0;
        banna.name = "Banana";
        banna.price = 0.5;
        // output
        apple.output();
        banna.output();
        
    }
    
}
