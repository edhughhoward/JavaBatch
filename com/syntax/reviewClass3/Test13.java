package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test13 {
public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
/*	
	Write a Java program that takes a number as input and prints its multiplication table up to 10. 
	
	Test Data:
	Input a number: 8
	Expected Output :
	8 x 1 = 8
	8 x 2 = 16
	8 x 3 = 24
	...
	8 x 10 = 80
	*/
System.out.println("Please enter a number");
	int num1 = scan.nextInt();
	
	for (int num2 = 0; num2 < 10; num2++) {
		System.out.println(num1 + " x " + (num2 + 1) + " = " + (num1* (num2+1)));
	}
	
	
	
	
	
}
}
