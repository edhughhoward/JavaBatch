package com.syntax.repl2;

import java.util.Scanner;

public class HW_095 {
	public static void main(String[] args) {
//	Using Scanner class input string value. 
//	Print out the following: "The first 3 letters of ___ is ___
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();

		String word2 = word.toLowerCase().substring(0, 3);
		System.out.println("The first 3 letters of " + word + " is " + word2);
	}
}
