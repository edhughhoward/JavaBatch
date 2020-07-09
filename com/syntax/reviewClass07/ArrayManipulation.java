package com.syntax.reviewClass07;

public class ArrayManipulation {

	public int largest(int[] array) {
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	public static void printSum(int[] array) {
		int total =0;
		
		for (int element:array) {
			total = total + element;
		}
		System.out.println(total);
	}
	public static int sum(int[] array) {
		int total =0;
		
		for (int element:array) {
			total = total + element;
		}
		return total;
	}
}
