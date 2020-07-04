package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int grade = keyboard.nextInt();
		
		if (grade >= 1 && grade < 25) {
			System.out.println("Your grade is F");
		} if (grade >= 25 && grade < 45) {
			System.out.println("Your grade is E");
		}if (grade >= 45 && grade < 50) {
			System.out.println("Your grade is D");
		}if (grade >= 50 && grade < 60) {
			System.out.println("Your grade is C");
		}if (grade >= 60 && grade < 80) {
			System.out.println("Your grade is B");
		}if (grade >= 80) {
			System.out.println("Your grade is A");
		} else if (grade < 1) {
			System.out.println("Please enter valid mark");
		}
		
		
	
		
	}

}
