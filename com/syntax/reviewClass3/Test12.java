package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test12 {
public static void main(String [] args) {
Scanner scan = new Scanner(System.in);
/*
 * Write a Java program to print the 
 * sum (addition), 
 * multiply, 
 * subtract, 
 * divide
 * and remainder of two numbers. 
 * 
 * Input first number: 125 
 * Input second number: 24 
 * 
 * Expected Output : 
 * 125 + 24 = 149 
 * 125 - 24 = 101
 * 125 x 24 = 3000 
 * 125 / 24 = 5 
 * 125 mod 24 = 5
 */

System.out.println("Please enter 1st number");
int num1 = scan.nextInt();

System.out.println("Please enter 2nd number");
int num2 = scan.nextInt();

System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));

	
	
}

}
