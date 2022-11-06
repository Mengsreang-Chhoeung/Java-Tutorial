package com.mengsreang.java.tutorial.break_continue;

public class AppThree {

    public static void main(String[] args) {

        // using break keyword in while loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

    }

}
