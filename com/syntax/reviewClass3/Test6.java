package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test6 {
public static void main(String [] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Do you need a loan?");
	boolean loan = keyboard.nextBoolean();
	
	if (loan == true) {
		System.out.println("What is your credit score?");
		int score = keyboard.nextInt();
		if (score <600) {
			System.out.println("The eligibility is not eligible"); 
		} if (score >= 600 && score <=700) {
			System.out.println("The eligibility is Maybe eligible");
		} if (score >= 701 && score <= 800) {
			System.out.println("The eligibility is Eligibile");
		}if (score >801) {
			System.out.println("The eligibility is Definitely eligible");
		}
	} else {
		System.out.println("The eligibility is Unknown");
	}
	
	
	
	keyboard.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
