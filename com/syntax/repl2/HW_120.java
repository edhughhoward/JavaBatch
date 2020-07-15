package com.syntax.repl2;

public class HW_120 {
	/*
	 * Declare 3 instance variables to hold:
	 * 
	 * year, school name and batch #
	 * 
	 * Access variables from the main method and assign specific values to them
	 * Print values of your variables in the following format:
	 * 
	 * Expected Output: I am a student of batch 6 studying at Syntax in the year of
	 * 2020
	 */

	int year;
	String schoolName;
	int batch;

	void details(int Tyear, String name, int batchnumber) {
		year = Tyear;
		schoolName = name;
		batch = batchnumber;
		
		System.out.println("I am a student of batch " + batch + " studying at " + schoolName + " in the year of " + year);
	}

	public static void main(String[] args) {

		HW_120 obj1 = new HW_120();
		obj1.details(2020, "Syntax", 6);
	}
}
