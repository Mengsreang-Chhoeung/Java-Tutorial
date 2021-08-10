package com.mengsreang.java.tutorial.userInput;
import java.util.Scanner;

public class AppSeven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		int id; String name, sex; double salary;
		System.out.print("Enter your ID: ");
		id = input.nextInt(); // get user input in int
		input.nextLine(); // used to catch input name statement
		System.out.print("Enter your Name: ");
		name = input.nextLine(); // get user input in String
		System.out.print("Enter your Sex: ");
		sex = input.nextLine(); // get user input in String
		System.out.print("Enter your Salary: ");
		salary = input.nextDouble(); // get user input in double
		// Output the value...
		System.out.println("\nHere is your ID: " + id);
		System.out.println("Here is your Name: " + name);
		System.out.println("Here is your Sex: " + sex);
		System.out.println("Here is your Salary: " + salary + "$");
	}
}
