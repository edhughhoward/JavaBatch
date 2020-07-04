package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ask the user to enter any number
//		if a user enters a number and it is even, print "Value is even", otherwise print "Value is odd"
//		If the number if even then check if it is greater than 1000 or not.
//		If the number is greater than 1000, then print "Even value is large", else print "Even value is just right". 

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter any number");
		int num1 = keyboard.nextInt();
		int sum = (num1 % 1);
			
		if (sum == 1){
			System.out.println("Value is even");
		} else {
			System.out.println("Value is odd");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
