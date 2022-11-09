package com.mengsreang.java.tutorial.user_input;
import java.util.Scanner;

public class AppOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        String firstName, lastName;
        System.out.print("Enter your First Name: ");
        firstName = input.nextLine(); // get user input in String
        System.out.print("Enter your Last Name: ");
        lastName = input.nextLine(); // get user input in String
        // Output the value...
        System.out.println("Here is your Full Name: " +  firstName + " " + lastName);
    }
}
