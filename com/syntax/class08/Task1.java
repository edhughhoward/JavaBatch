package com.syntax.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3

		for (int i = 1; i<=50; i++){
			if (i %3 == 0 ) {
				continue;
			}
			System.out.println(i);
		}
		
		
		System.out.println("===================================");
		/*Create a program that will be asking user to apply for a credit card 10 times. 
		 * As soon you get an �yes� from a user program should stop asking.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to apply for the credit card?");
		String answer = scan.next();
		
		for (int i = 101; i <= 110; i++) {
			if (answer.equals("yes")){
				System.out.println("You will get a card");
				continue;
				
			}
		
			}
		}
		
	}


