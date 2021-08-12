package com.mengsreang.java.tutorial.operator;

public class AppTwo {
	public static void main(String[] args) {
		int a = 30, b = 20;
		int mod;
		System.out.println("A= " + a + "\t\tB= " + b);
		mod = a % b; // using % operator
		System.out.println("A % B = " + mod);
		// changing the value in variable...
		a = 90; b = 80;
		System.out.println("\nA= " + a +  "\t\tB= " + b);
		System.out.println("A % B = " + mod);
	}
}

