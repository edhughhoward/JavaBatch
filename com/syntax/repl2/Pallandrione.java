package com.syntax.repl2;

public class Pallandrione {
	public static void main(String[] args) {

		String sampleWords = "I Love Java";

		String reverseString = "";

		for (int i = sampleWords.length() - 1; i >= 0; i--) {

			reverseString = reverseString + sampleWords.charAt(i);
		}
		System.out.println(reverseString);
	}
}

//avaJ evoL I