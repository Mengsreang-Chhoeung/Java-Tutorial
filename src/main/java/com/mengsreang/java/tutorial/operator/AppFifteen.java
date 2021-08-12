package com.mengsreang.java.tutorial.operator;

public class AppFifteen {
	public static void main(String[] args) {
		int a = 30, b = 20;
		System.out.println("A= " + a + "\tB= " + b);
		// using ! operator
		if (!(a > 50 && b > 50)) {
			System.out.println("\nA and B are not Bigger than 50");
		}
	}
}
