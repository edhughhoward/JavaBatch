package com.syntax.reviewClass07;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = {5,9,6,2,1};
		
		ArrayManipulation a = new ArrayManipulation();
		int biggest = a.largest(arr);
		System.out.println("largest is " + biggest);
		
		ArrayManipulation.printSum(arr);
		int result = ArrayManipulation.sum(arr);
		System.out.println("The sum is: " + result);
	}
}
