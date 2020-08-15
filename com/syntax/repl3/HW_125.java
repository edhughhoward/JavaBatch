package com.syntax.repl3;

public class HW_125 {
	/*
	 * Declare a static variable number that will hold an integer value:
	 * 
	 * Access number from the main method and assign value to it. Create an Object
	 * of the class, access number in a nonstatic way and assing value of 200.
	 * 
	 * Print out number using class name and using instance
	 * 
	 * Expected Output: 200 200
	 */
	
	static int number; // static instance variable
	public static void main(String[] args) {
		HW_125 obj = new HW_125(); // object
		obj.number =200;// assinging the static
		System.out.println(number); // calling by creating object of the class using instance
		System.out.println(obj.number); // calling class name
	}
}
