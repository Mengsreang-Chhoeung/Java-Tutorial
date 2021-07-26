package com.mengsreang.java.tutorial.typeCasting;

public class AppThree {
    public static void main(String[] args) {
        int myNumber = 123;
        double myDouble = 15.55;
        boolean myBoolean = true;
        // convert int to String
        System.out.println("Convert Integer into String: " + Integer.toString(myNumber));        
        System.out.println("Convert Integer into String: " + String.valueOf(myNumber));
        // convert int to double
        System.out.println("Convert Integer into Double: " + (double) myNumber);
        // convert double to int
        System.out.println("Convert Double into Integer: " + (int) myDouble);
    }
}
