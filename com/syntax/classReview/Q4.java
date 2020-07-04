package com.syntax.classReview;

import java.util.Arrays;

public class Q4 {
public static void main(String [] args) {
	// Write a java program to find the 2nd largest number in the array?
	// Maximum and minimum in the array
	
	int [] numbers = {32, 61, 16, 89, 74, 25};
	
	System.out.println("====enhanced loop for max and min ====");
	int max = numbers[0];
	int min = numbers[0];
	for (int num:numbers) {
		if (num > max) {
			max = num;
		} else if (num < min) {
			min = num;
		}
	}
	System.out.println("Minimum is: " + min);
	System.out.println("Maximum is: " + max);
	
	// or
	
	
	System.out.println("=====short way====");
	Arrays.sort(numbers);
	for (int num : numbers) {
		System.out.println(num);
	}
	System.out.println();
	System.out.println("Minimum is: " + numbers[numbers.length-1]);
	System.out.println("2nd largest is: " + numbers[numbers.length-2]);
	System.out.println("Maximum is: " + numbers[0]);
	
	
}
}
