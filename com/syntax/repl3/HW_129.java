package com.syntax.repl3;

public class HW_129 {
	/*
	 * Declare two static variables to hold country name continent
	 * 
	 * Create a method to display the value of static variables in the following
	 * format:
	 * 
	 * ____ located on ____ continent
	 * 
	 * In the main method assign values to a static variable and execute method
	 * display
	 * 
	 * Expected Output: Morocco located on Africa continent
	 */

	public static String country;
	public static String continent;
	void displayInfo(String country, String continent) {
		System.out.println(country + " located on " + continent + " continent");
	}
	public static void main(String[] args) {
		HW_129 obj = new HW_129();

		obj.displayInfo("Morocco", "Africa");
	}
}
