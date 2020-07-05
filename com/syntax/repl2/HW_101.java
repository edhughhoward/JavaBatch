package com.syntax.repl2;

import java.util.Scanner;

public class HW_101 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();
		// write your code below

		String newWord = "";

		for (int i = 0; i < word.length() - 1 / 2; i += 2) {
			System.out.print(word.charAt(i));
		}

	}
}