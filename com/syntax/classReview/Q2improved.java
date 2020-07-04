package com.syntax.classReview;

public class Q2improved {
	public static void main(String[] args) {
		int number = 1; 
		boolean prime = true;
	
		if (number > 1) {
			for (int i = 2; i < number/i; i++) { // finding the square root of number
				if (number % i ==0) {
					prime = false;
				}
			}
			
		} else {
			prime = false;
		}
		
		
		System.out.println("The number " + number + " is prime: " + prime);
	}
}
