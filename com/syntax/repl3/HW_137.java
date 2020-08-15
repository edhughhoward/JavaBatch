package com.syntax.repl3;

public class HW_137 {
	/*
	 * In main class please declared the variables using different access modifiers
	 * that will hold value for: name city name of the school batch number
	 * 
	 * Create a method to display details in following format: My name is ___ and I
	 * live in ___. I study at ___ in batch ___
	 * 
	 * Assign values to the variables and execute method display
	 * 
	 * Expected Output: My name is John and I live in Miami. I study at Syntax in
	 * batch 6
	 */

	public String name, city, school;
	public int batch;

	void details(String name, String city, String school, int batch) {
		this.name = name;
		this.city = city;
		this.school = school;
		this.batch = batch;
		System.out.println(
				"My name is " + name + " and I live in " + city + ". " + "I study at " + school + " in batch " + batch);
	}

	public static void main(String[] args) {
		HW_137 obj = new HW_137();

		obj.details("John", "Miami", "Syntax", 6);
	}

}
