package com.syntax.repl;

import java.util.Scanner;

public class HW077_ArrayLevel8 {
public static void main(String [] args) {
	/*
	 * Create an array of integers that will store 5 elements taken from a user
	 * Don't print any prompt message for the user Then print out all the elements
	 * you have created in the first loop in reverse order.
	 */
	
	Scanner scan = new Scanner(System.in);
	
			int [] arr = new int [5];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();	
			}for (int j = 5; j > 0; j--) {
					System.out.println(j);
				}
}
}
