package com.mengsreang.java.tutorial.user_input;
import java.util.Scanner;

public class AppTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		int a, b, sum;
		System.out.print("Enter number of A: ");
		a = input.nextInt(); // get user input in int
		System.out.print("Enter number of B: ");
		b = input.nextInt(); // get user input in int
		sum = a + b;
		// Output the value...
		System.out.println("\nHere is your sum up: " + sum);
	}
}
