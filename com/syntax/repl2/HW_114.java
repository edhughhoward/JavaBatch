package com.syntax.repl2;

public class HW_114 {

	/*
	 * Step1: Create three methods that will accept 2 in parameters on integer type
	 * Step2: Write the logic in methods to perform actions below:
	 * 
	 * The first method for multiplication The second method for addition The third
	 * method for subtraction
	 * 
	 * Step3: execute all methods
	 * 
	 * 1. for the addition method add two numbers to make 30 2. for multiplication
	 * multiply two numbers to make 30 3. for Subtraction subtract two numbers to
	 * equal 20
	 * 
	 * Expected Output: Addition 30 Multiplication 30 Subtraction 20
	 */

	void times(int a, int b) {
		System.out.println("Multiplication " + (a * b));
	}

	void add(int a, int b) {
		System.out.println("Addition " + (a + b));
	}

	void minus(int a, int b) {
		System.out.println("Subtraction " + (a - b));
	}

	public static void main(String[] args) {
		HW_114 method = new HW_114();

		method.add(15, 15);
		method.times(15, 2);
		method.minus(30, 10);
	}
}
