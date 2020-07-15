package com.syntax.repl2;

public class HW_113 {
	/*
	 * Step1: Create a method that will accept with 2 parameters of integer type
	 * Step2: Write the logic in that method in println statement to print hours and
	 * minutes Step3: Call the method
	 * 
	 * Expected Output: 11:30
	 */

	void time(int hour, int min) {
		System.out.println(hour + ":" + min);

	}

	public static void main(String[] args) {

		HW_113 method = new HW_113();
		method.time(11, 30);
	}

}
