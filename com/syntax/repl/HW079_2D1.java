package com.syntax.repl;

public class HW079_2D1 {
public static void main(String [] args) {
	/*
	 * Write a program to print values from a 2D array
	 * 
	 * Example Output: 
	 * 1.4 2.0 3.3 2.0 
	 * 4.0 1.5 6.1 1.0 
	 * 1.2 3.1 4.0 1.6
	 */
	double[][] array = {
			{1.4, 2.0, 3.3, 2},
			{4, 1.5, 6.1, 1},
			{1.2, 3.1, 4,1.6}
		};
	
	for (int number = 0; number <array.length; number++) {
		for (int num2 = 0; num2< array[number].length; num2++) {
			System.out.print(array[number][num2] + " ");
		}
	System.out.println();
	}
}
}
