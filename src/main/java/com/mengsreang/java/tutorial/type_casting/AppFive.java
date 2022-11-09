package com.mengsreang.java.tutorial.type_casting;

public class AppFive {
    public static void main(String[] args) {
        String myString = "123";
        // convert String to int
        System.out.println("Convert String into Integer: " + Integer.parseInt(myString));
        System.out.println("Convert String into Integer: " + Integer.valueOf(myString));
        // convert String to double
        System.out.println("Convert String into Double: " + Double.parseDouble(myString));
        System.out.println("Convert String into Double: " + Double.valueOf(myString));
    }
}
