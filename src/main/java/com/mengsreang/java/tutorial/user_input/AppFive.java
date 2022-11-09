package com.mengsreang.java.tutorial.user_input;
import java.util.Scanner;

public class AppFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		float a, b, mul;
		System.out.print("Enter number of A: ");
		a = input.nextFloat(); // get user input in float
		System.out.print("Enter number of B: ");
		b = input.nextFloat(); // get user input in float
		mul = a * b;
		// Output the value...
		System.out.println("\nHere is your Multiplication: " + mul);
	}
}
