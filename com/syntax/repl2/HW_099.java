package com.syntax.repl2;

import java.util.Scanner;

public class HW_099 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.println("In:");

		String givenString = inp.nextLine();

		givenString = givenString.replaceAll(" ", "");
		String reverseString = "";

		for (int i = givenString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + givenString.charAt(i);
		}
		if (givenString.equalsIgnoreCase(reverseString)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
