package com.syntax.class09;

import java.util.Scanner;

public class Task1 {
public static void main(String [] args) {
	/* Write a program that reads a range of integers (start and end point),
	 * provided by a user and then from that range
	 * prints the sum of the even and odd integers
	 * 
	 */
	Scanner scan = new Scanner(System.in);
			int start, end; 
			int sumOdd = 0; 
			int sumEven = 0;
	
	System.out.println("Please enter a starting number:");
	start = scan.nextInt();
	
	System.out.println("Please enter a ending number:");
	end = scan.nextInt();
	
	for (int i = start; i <= end; i++) {
		if(i % 2 == 0) {
			sumEven += i;
		}
		if(i % 2 == 1) {
			sumOdd += 1;
		}
	}
	
	System.out.println("The sum of even numbers is " + sumEven);
	System.out.println("The sum of odd numbers is " + sumOdd);
	
	scan.close();
	
}
}
