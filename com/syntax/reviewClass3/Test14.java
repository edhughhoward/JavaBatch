package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test14 {
public static void main(String [] args) {
	// Using scanner class create calculator.
	// Allow user to enter 2 numbers and operator(+,-,*,/).
	// Based on operator provide the result to user.
	Scanner scan = new Scanner(System.in);
System.out.println("Please enter 1st number");
double num1 = scan.nextDouble();

System.out.println("please enter operator");
char operator = scan.next().charAt(0);

System.out.println("Please enter 2nd number");
double num2 = scan.nextDouble();
double result = 0;

switch (operator) {

case '+': result = (num1 + num2); break;
case '-': result = (num1 - num2); break;
case '*': result = (num1 * num2); break;
case '/': result = (num1 / num2); break;
default: System.out.println("invalid options");
}

	if (operator == '+' || operator == '-' || operator == '*' || operator == '/' )
		
		System.out.println(num1 + " " + operator + num2 + " = " +result);
	
	scan.close();
	
}
}