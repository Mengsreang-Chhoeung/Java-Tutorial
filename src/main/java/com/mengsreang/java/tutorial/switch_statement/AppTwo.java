package com.mengsreang.java.tutorial.switch_statement;

public class AppTwo {

    public static void main(String[] args) {

        // declare a variable
        int day = 4;
        // check condition using switch statement
        switch (day) {
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

    }

}
