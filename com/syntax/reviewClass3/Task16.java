package com.syntax.reviewClass3;

import java.util.Scanner;

public class Task16 {
public static void main(String [] args) {
	
	/*
	 * We are playing a lottery game and the lucky number is 17; We want to keep
	 * asking the user to enter any numbers from 1-20; until he guesses the lucky
	 * number --> In that case we print "Congrats, you won!"
	 */

	Scanner scan = new Scanner(System.in);
	int lucky = 9;
	int num;
	
	do { System.out.println("Please enter a number between 1-20");
	num = scan.nextInt();

	} while (num != lucky);
		System.out.println("Congratulations, you won!");

		
		scan.close();
	} 
		
	}
	
	
	


