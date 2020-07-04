package com.syntax.repl;

public class HW071_ArrayLevel2 {
public static void main(String [] args) {
//	Write a program that creates an array of integers that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
//	Print only values that stored with even index including 0.
//
//
//	Output:
//	45 12 55 23 88 
	
	int [] numbers = {45, 78, 12, 67, 55, 89, 23, 77, 88};
	
	for (int i = 0; i < numbers.length; i++) {
		if (i % 2 ==0) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	System.out.println("========= or ========================");
	
	int[] arr = {45,78, 12,  67, 55, 89, 23, 77, 88};

	for (int i = 0; i < arr.length; i+=2) {

		System.out.print(arr[i] + " ");
	}
	
}
}
