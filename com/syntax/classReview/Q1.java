package com.syntax.classReview;

public class Q1 {

	public static void main(String[] args) {
// Write a program to swap 2 numbers without a temporary variable
		
		int a = 20;
		int b = 30;
		
		
		System.out.println("value of a = " + a + " value of b = " + b);
		
		a = a + b;//a = 50
		System.out.println("value of a = " + a + " value of b = " + b);
		
		b = a - b;//b = 30
		System.out.println("value of a = " + a + " value of b = " + b);
		
		a = a - b;//a = 20	
		System.out.println("value of a = " + a + " value of b = " + b);
		
	}

}
