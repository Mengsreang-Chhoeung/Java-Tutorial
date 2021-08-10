package com.mengsreang.java.tutorial.userInput;
import java.util.Scanner;

public class AppThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		long a, b, sub;
		System.out.print("Enter number of A: ");
		a = input.nextLong(); // get user input in long
		System.out.print("Enter number of B: ");
		b = input.nextLong(); // get user input in long
		sub = a - b;
		// Output the value...
		System.out.println("\nHere is your Subtraction: " + sub);
	}
}
