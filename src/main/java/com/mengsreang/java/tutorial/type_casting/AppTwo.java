package com.mengsreang.java.tutorial.type_casting;

public class AppTwo {
    public static void main(String[] args) {
        // Narrowing Casting
        double myDouble = 15.55;
        // Automatic casting: int to double
        int myNumber = (int) myDouble;
        System.out.println("Number in Double: " + myDouble);
        System.out.print("\n"); // New Line
        System.out.println("Number in Integer: " + myNumber);
    }
}
