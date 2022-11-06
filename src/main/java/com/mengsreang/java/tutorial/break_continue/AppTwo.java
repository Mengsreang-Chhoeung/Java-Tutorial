package com.mengsreang.java.tutorial.break_continue;

public class AppTwo {

    public static void main(String[] args) {

        // using continue keyword in for loop
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }

}
