package com.syntax.repl2;

import java.util.Scanner;

public class HW_100 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String s = inp.nextLine();
		// write your code below
		
		String reverseString = "";
		
		for (int i = s.length()-1; i >=0; i--) {
			
			reverseString = reverseString + s.charAt(i);
		}
		System.out.println(reverseString);
	}
}