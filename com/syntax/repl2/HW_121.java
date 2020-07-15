package com.syntax.repl2;

public class HW_121 {
	/*
	 * declare 3 instance variables to hold an integer, double and char values.
	 * 
	 * Create 2 instances of the class and assign values to variables and the print
	 * them
	 * 
	 * Expected Output: 10 10.23 a 100 100.23 s
	 */

	int num1;
	double num2;
	char letter;

	void details(int a, double b, char c) {
		System.out.println(a + " " + b + " " + c);
	}

	public static void main(String[] args) {

		HW_121 obj = new HW_121();
		obj.details(10, 10.23, 'a');
		HW_121 obj2 = new HW_121();
		obj2.details(100, 100.23, 's');
	}
}
