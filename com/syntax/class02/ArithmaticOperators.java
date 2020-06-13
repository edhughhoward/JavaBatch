package com.syntax.class02;

public class ArithmaticOperators {
	public static void main(String[] args) {
		/*
		 * Write a Java program to add, subtract, multiply and divide 2 decimal values.
		 * Your program should say.
		 * "The _______ of 2 numbers ___ and ___ is equal to _____"
		 */

		double num1 = 19.84;
		double num2 = 20.21;
		String add = "addition", minus = "subtraction", times = "multiplication", divide = "division";
		System.out.println("The " + add + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 + num2));
		System.out.println("The " + minus + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 - num2));
		System.out.println("The " + times + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 * num2));
		System.out.println("The " + divide + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 / num2));
		System.out.println("=============================================================");
		// Write a program to find the square of the number 3.9. You program should say
		// "The square of the ____ is ____ "
		double num3 = 3.9;
		double square = num3 * num3;
		System.out.println("The square root of the number " + num3 + " is " + square);
		System.out.println("===============================================================");
		/*
		 * Write a program to print the area and perimeter of a rectangle with width = 5
		 * and height = 8. Your program should say.
		 * "The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __"
		 */
		int height = 8;
		int width = 5;
		
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + (2*(height + width)) + " and the area is " + (height * width));
		
		
		
	}
}
