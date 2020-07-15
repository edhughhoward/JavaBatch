package com.syntax.repl2;

public class HW_123 {
	/*
	 * Declare the instance variables to hold: integer values String values double
	 * values boolean values float values
	 * 
	 * Access instance variables and then print them all without assigning any
	 * values to them. Print variables one by one the same sequence that you declare
	 * them.
	 * 
	 * Expected Output: 0 null 0.0 false 0.0
	 */

	int num1;
	String word1;
	double num2;
	boolean word = false;
	float num3;
	void details() {
		System.out.println(num1);
		System.out.println(word1);
		System.out.println(num2);
		System.out.println(word);
		System.out.println(num3);
	}
	public static void main(String[] args) {
		HW_123 obj = new HW_123();
		obj.details();
	}
}
