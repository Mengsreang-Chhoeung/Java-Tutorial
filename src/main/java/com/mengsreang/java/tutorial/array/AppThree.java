package com.mengsreang.java.tutorial.array;

public class AppThree {

    public static void main(String[] args) {

        // declare a variables 
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        // output a single value
        System.out.println(myNumbers[1][2]); // output is 7
        // output with for loop
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

    }

}
