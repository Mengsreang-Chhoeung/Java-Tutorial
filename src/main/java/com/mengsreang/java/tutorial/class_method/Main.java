package com.mengsreang.java.tutorial.class_method;

public class Main {
    
    public static void main(String[] args) {
        
        // create multiple objects
        Fruit apple = new Fruit();
        Fruit banana = new Fruit();
        // call or invoke each object's methods
        apple.greeting();
        apple.getFruitName("Apple");
        banana.greeting();
        banana.getFruitName("Banana");
        
    }
    
}
