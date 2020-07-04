package com.syntax.repl;

public class HW068_Patterns {
public static void main(String [] args) {
//	Write a program to print out the pattern: 
//
//		 Expected output:
//		$$$$
//		$  $
//		$  $
//		$$$$
	
	for (int row = 1; row <= 4; row++) {
		for (int col = 1; col <= 4; col++) {
			if (row == 1 || row == 4) {
			System.out.print("$");
		} else {
			if (col == 1 || col == 4) {
				System.out.print("$");
			} else {
				System.out.print(" ");
			}	
		}
		}
		System.out.println();
	}
}
}
