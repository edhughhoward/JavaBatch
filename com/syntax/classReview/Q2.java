package com.syntax.classReview;

public class Q2 {
	// Write a java program to check weather a given number is prime or not?
	// A whole number greater than 1 that can not be made by multiplying other whole numbers
	// 2 (1,2) prime
	// 3 (1,3) prime
	// 4 (1, 2, 4) not prime
	// 5 (1, 2, 3, 6) not prime
	public static void main(String[] args) {
		int number = 1; 
		boolean prime = true;
	if (number > 1) {
			for (int i =2; i < number; i++) {
				if (number % i ==0) {
					prime = false;
					break;
				}
			}
		}else {
			prime = false;
		}
	System.out.println("The number " + number + " is prime: " + prime);
	}
}
