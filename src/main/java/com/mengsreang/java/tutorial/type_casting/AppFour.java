package com.mengsreang.java.tutorial.type_casting;

public class AppFour {
    public static void main(String[] args) {
        double myDouble = 15.55;
        boolean myBoolean = true;
        // convert double to String
        System.out.println("Convert Double into String: " + Double.toString(myDouble));        
        System.out.println("Convert Double into String: " + String.valueOf(myDouble));
        // convert boolean to String
        System.out.println("Convert Boolean into String: " + Boolean.toString(myBoolean));
        System.out.println("Convert Boolean into String: " + String.valueOf(myBoolean));
    }
}
