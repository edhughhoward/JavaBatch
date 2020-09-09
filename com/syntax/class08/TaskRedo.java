package com.syntax.class08;

public class TaskRedo {
	
	public static void main(String[] args) {
		for (int i = 0; i <= 50; i++) {
			if (i %3 == 0) {
				System.out.print(i + " ");
			}
		}
		String answer = "no";
		
		for (int i = 0; i <=10; i++) {
			if (answer.equals("yes")) {
				System.out.println("Thank you for applying");
			} else {
				System.out.println("Would you like to apply?");
			}
		}
		
	}
	/*
	 * 1.Print numbers from 1 to 50 except those that are divisible by 3
	 * 1.Create a program that will be asking user to apply for a credit card 10 times. 
	 * As soon you get an “yes” from a user program should stop asking.
	 */}
