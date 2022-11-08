package com.mengsreang.java.tutorial.class_attribute;

public class Main {
    
    public static void main(String[] args) {
        
        // create multiple objects
        Fruit apple = new Fruit();
        Fruit banana = new Fruit();
        // modify banana object's attribute value
        banana.name = "Banana";
        banana.price = 0.5;
        // output both object's attribute value
        System.out.println("Fruit one name: " + apple.name);
        System.out.println("Fruit one price: $" + apple.price);
        System.out.println("Fruit two name: " + banana.name);
        System.out.println("Fruit two price: $" + banana.price);
        
    }
    
}
