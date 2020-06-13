package com.syntax.class06;

public class CompareNumbersNestedIf {
	public static void main(String [] args) {
		double a =13, b=11.5, c=18;
		double largest;
		
		if (a > b) {
			if (a > c) {
				largest = a;
			} else {
				largest = c;
		}
		} else {
			if (b > c) {
				largest = b;
			} else {
				largest = c;
			}
		}
		System.out.println("Largest number is " + largest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
