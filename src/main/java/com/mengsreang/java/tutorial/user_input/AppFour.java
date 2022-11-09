package com.mengsreang.java.tutorial.user_input;
import java.util.Scanner;

public class AppFour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		double a, b, div;
		System.out.print("Enter number of A: ");
		a = input.nextDouble(); // get user input in double
		System.out.print("Enter number of B: ");
		b = input.nextDouble(); // get user input in double
		div = a / b;
		// Output the value...
		System.out.println("\nHere is your Division: " + div);
	}
}
