package com.syntax.classReview;

public class Q4improved {

	public static void main(String[] args) {
		int [] numbers = {32, 61, 16, 89, 74, 25};
		
		int largest = numbers[0];
		int largest2 = numbers[0];
		
		int min = numbers[0];
		
		for (int num : numbers) {
			
			if (num > largest ) {
				largest2 = largest;
				largest = num;
			} else if (num > largest2 && num != largest) {
				largest2 = num;
			} else if (num < min) {
			min = num;
			}
		}
		System.out.println("The smallest is: " + min);
		System.out.println("The largest is: " + largest);
		System.out.println("The 2nd largest is: " + largest2);
		
	}

}
