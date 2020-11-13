package com.syntax.class01;

public class ArrayDemo {
	public static void main(String[] args) {

		int[] arr = { 5, 9, 2, 6, 1 };

		ArrayManipulation a = new ArrayManipulation();
		int biggest = a.largest(arr);
		System.out.println("largest is: " + biggest);
	}
}
