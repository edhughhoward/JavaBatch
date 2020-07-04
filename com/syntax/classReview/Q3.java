package com.syntax.classReview;

public class Q3 {
public static void main(String [] args) {
	/*
	 * Write a Java Program to print the first 10 number of Fibbonacci series.
	 * 1,1,2,3,5,8,13,21,34,55
	 */
	
	int a, b, c;
	a =1;
	b =1;

	for (int i = 1; i <= 10; i++) {
		System.out.print(a + ", ");
		c = a + b;
		a = b;
		b = c;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
