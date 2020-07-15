package com.syntax.repl2;

public class HW_115 {
	/*
	 * Create a method that will accept a String as a parameter and return new
	 * String all in upper case
	 * 
	 * Call method
	 * 
	 * Expected Output: TEST
	 */

	void words(String a) {
		System.out.println(a.toUpperCase());
	}

	public static void main(String[] args) {
		HW_115 repl = new HW_115();

		repl.words("test");
	}
}
