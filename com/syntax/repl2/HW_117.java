package com.syntax.repl2;

public class HW_117 {
	/*
	 * Create a method with the following specs:
	 * 
	 * Returns: an integer Name: sumEvenToX Parameters: an integer called "x"
	 * Purpose: calculate the sum of the EVEN integers from 1 to x (including x)
	 * 
	 * Examples: sumEvenToX(5) ==> 6 sumEvenToX(8) ==> 20
	 */

	public static int sumEvenToX(int x) {
		int sum = 0;
		for (int i = 1; i <= x; i++)
			if (i % 2 == 0) {
				sum += i;
			}
		return sum;
	}

	public static void main(String[] args) {
	  HW_117 str = new HW_117();
	  int numbers = str.sumEvenToX(5);
	  int numbers2 = str.sumEvenToX(8);
		System.out.println(numbers);
		System.out.println(numbers2);
	}
}
