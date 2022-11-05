package com.mengsreang.java.tutorial.string;

public class AppOne {
    
    public static void main(String[] args) {
        
        // declare a variable of String
        String greeting = "Hello";
        // output length of greeting variable
        System.out.println("Length of greeting variable: " + greeting.length());
        // output greeting value to "HELLO"
        System.out.println("Greeting value in Upper Case: " + greeting.toUpperCase());
        // output greeting value to "hello"
        System.out.println("Greeting value in Lower Case: " + greeting.toLowerCase());
        // modify greeting value
        greeting = "Hello World and Say Hello";
        // output index of the first occurrence of a specified text in a greeting value
        System.out.println("Index of World: " + greeting.indexOf("World"));
        
    }
    
}
