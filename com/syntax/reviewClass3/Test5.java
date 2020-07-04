package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test5 {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		int z = keyboard.nextInt();
		
		if (x >= y) {
			if (x >= z) {
				System.out.println("The largest number is " + x);
			} else {
				System.out.println("The largest number is " + z);
			}
		} else {
			if (y >= z) {
				System.out.println("The largest number is " + y);
			} else {
				System.out.println("The largest number is " + z);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
