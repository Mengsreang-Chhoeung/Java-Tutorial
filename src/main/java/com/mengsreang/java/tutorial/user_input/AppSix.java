package com.mengsreang.java.tutorial.user_input;
import java.util.Scanner;

public class AppSix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		char a, b;
		System.out.print("Enter Character One: ");
		a = input.nextLine().charAt(0); // get user input in char
		System.out.print("Enter Character Two: ");
		b = input.nextLine().charAt(0); // get user input in char
		// Output the value...
		System.out.println("\nHere is your Character: " + a + " and " + b);
	}
}
