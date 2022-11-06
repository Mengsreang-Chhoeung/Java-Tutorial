package com.mengsreang.java.tutorial.array;

public class AppOne {

    public static void main(String[] args) {

        // declare variables of array
        int[] numbers = {1, 2, 3, 4, 5};
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // output arrays value by index
        System.out.println(numbers[3]);
        System.out.println(cars[0]);
        // modify value of arrays
        numbers[3] = 100;
        cars[0] = "Camery";
        // output again
        System.out.println(numbers[3]);
        System.out.println(cars[0]);
        // output length of both arrays
        System.out.println("Length of Numbers: " + numbers.length);
        System.out.println("Length of Cars: " + cars.length);

    }

}
