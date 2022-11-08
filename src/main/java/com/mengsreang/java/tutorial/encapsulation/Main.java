package com.mengsreang.java.tutorial.encapsulation;

public class Main {
    
    public static void main(String[] args) {
        
        // create multiple objects
        Fruit apple = new Fruit();
        Fruit banana = new Fruit();
        // modify banana object's attribute value using setter
        banana.setName("Banana");
        banana.setPrice(0.5) ;
        // output both object's attribute value
        System.out.println("Fruit one name: " + apple.getName());
        System.out.println("Fruit one price: $" + apple.getPrice());
        System.out.println("Fruit two name: " + banana.getName());
        System.out.println("Fruit two price: $" + banana.getPrice());
        
    }
    
}
