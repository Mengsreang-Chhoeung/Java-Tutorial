package com.mengsreang.java.tutorial.break_continue;

public class AppFour {

    public static void main(String[] args) {

        // using continue keyword in while loop
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

    }

}
