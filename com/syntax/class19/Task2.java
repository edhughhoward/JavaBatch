package com.syntax.class19;

public class Task2 {
	/*
	 * * Create a method that will take a String as a parameter and returns reversed
	 * String. Method should be available to all classes within your project and
	 * accessible by class name.
	 */

	public String printReversed(String name) {


		String reverseString = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			reverseString = reverseString + name.charAt(i);
		}
		System.out.println(reverseString);
		return reverseString;
	}

	public static void main(String args) {
		Task2 wording = new Task2();

		String homework = "I love Java";
		wording.printReversed(homework);
	}
}
