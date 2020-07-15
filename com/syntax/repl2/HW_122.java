package com.syntax.repl2;

public class HW_122 {
	/*
	 * Declare 3 instance variables to hold: name of the country, capital,
	 * population size
	 * 
	 * Create a method to display values of instance variables
	 * 
	 * Create 2 Object, assign values to instance variables, execute method display;
	 * 
	 * Expected Output: The capital of USA is Washington DC and population is
	 * 330000000 The capital of Kazakhstan is Astana and population is 18500000
	 */

	String country;
	String capital;
	long population;

	void details(String a, String b, long c) {
		country = a;
		capital = b;
		population = c;
		System.out.println("The capital of " + a + " is " + b + " and population is " + c);
	}

	public static void main(String[] args) {
		HW_122 obj = new HW_122();
		obj.details("USA", "Washington DC", 330000000);
		HW_122 obj2 = new HW_122();
		obj2.details("Kazakhstan", "Astana", 18500000);
	}
}
