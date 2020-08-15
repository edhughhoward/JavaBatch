package com.syntax.repl3;

public class HW_126 {
	/*
	 * Create a variable that will hold the count of all instances of the Main class
	 * 
	 * Create 3 Object of the class and print value of the count variable;
	 * 
	 * Expected Output: 3
	 */

	static int number;

	public static void main(String[] args) {

		HW_126 obj1 = new HW_126();
		number++;

		HW_126 obj2 = new HW_126();
		number++;

		HW_126 obj3 = new HW_126();
		number++;

		System.out.println(number);
	}
}
