package com.syntax.class19;

public class Task1 {
	/*
	 * Create a method that will accept an array as parameters and will return a sum
	 * of all elements from that array. Method should be visibly only within same
	 * package and accessible by the creating an instance of the class.
	 */

	protected int printSum(int[] array) {
		int total = 0;
		for (int element : array) {
			total = total + element;
		}
		System.out.println(total);
		return total;
	}

	public static void main(String[] args) {

		Task1 numbers = new Task1();

		int[] arr = { 5, 5, 5, 5 };
		numbers.printSum(arr);

	}
}
