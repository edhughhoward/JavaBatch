package com.syntax.repl2;

public class HW_112 {
	/*
	 * 1. Create a method in which you will be printing numbers from 1 to 10 2. Call
	 * the method in the main method
	 * 
	 * Expected Output: 1 2 3 4 5 6 7 8 9 10
	 */
	
	void numbers() {
		for (int num = 0; num <=10; num++) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		
		HW_112 method = new HW_112();
		method.numbers();
	}
}
