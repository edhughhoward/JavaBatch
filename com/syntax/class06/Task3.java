package com.syntax.class06;

import java.util.Scanner;

public class Task3 {
public static void main(String [] args) {
	Scanner keyboard = new Scanner(System.in);
	
//	Using scanner class create calculator. 
//	Allow user to enter 2 numbers and operator(+,-,*,/). 
//	Based on operator provide the result to user.
	
	System.out.println("Please enter in 1st number.");
	int num1 = keyboard.nextInt();
	
	System.out.println("Please enter in operator (+,-,*,/");
	char operator = keyboard.next().charAt(0);
	
	System.out.println("Please enter in 2nd number.");
	double num2 = keyboard.nextInt();
	
	double result;
	
	switch (operator) {
	case '+':
		result = num1 + num2;
		break;
	case '-':
		result = num1 - num2;
		break;
	case '*':
		result = num1 * num2;
		break;
	case '/':
		result = num1 / num2;
		break;
	default:
		System.out.println("Invalid Operator");
	
	
	
	
	
	}
	if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
	System.out.println("Your answer is " + result);
	}
	
	
	
	
	
	
	
	
	
	
}
}
