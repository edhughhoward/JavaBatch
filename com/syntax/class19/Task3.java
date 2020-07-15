package com.syntax.class19;

import com.syntax.repl2.HW_118;

public class Task3 {
	/*
	 * create a method that will accept a String as a parameter and return a new
	 * String that consist only of vowels. Method should be available inside the
	 * class where it was declared and executed by calling it is name
	 */
	
private static String displayVowels(String value) {
		return value.replaceAll("[^aeiouAEIOU]", "");

		}
public static void main(String[] args) {
	
}
}
