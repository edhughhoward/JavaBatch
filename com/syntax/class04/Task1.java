package com.syntax.class04;

public class Task1 {
	public static void main(String[] arg) {
		/*
		 * Prompt user to enter person height in inches Person should be classified as
		 * one of the following - short (under 60) - medium (60 - 72) - tall (over 72)
		 */

		int height = 40;

		if (height < 60) {
			System.out.println("Short");
		} else if (height > 72) {
			System.out.println("Tall");
		} else {
			System.out.println("Medium");
		}

	}
}
