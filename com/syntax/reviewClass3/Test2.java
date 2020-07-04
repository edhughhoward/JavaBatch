package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
//		Ask the user to enter his/her gender 
//		"Please enter your gender: M or F" and their age "Please enter your age"
//
//You have 2 conditions:
//If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
//If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your gender: M or F");
		String sex = keyboard.nextLine();
		System.out.println("Please enter your age");
		int age = keyboard.nextInt();
		boolean f = true;
		
		if (age > 25 && f) {
			System.out.println("Woman");
		}else {System.out.println("Man");
		}
		if (age < 25 && f) {
		System.out.println("Girl");
	} else {
		System.out.println("Boy");
	}
		
		
		
		
		
		
	}
}