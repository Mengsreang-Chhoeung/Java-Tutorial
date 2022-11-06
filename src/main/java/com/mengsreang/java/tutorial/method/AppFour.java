package com.mengsreang.java.tutorial.method;

public class AppFour {

    // define a method
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        // call or invoke methods multiple times
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }

}
