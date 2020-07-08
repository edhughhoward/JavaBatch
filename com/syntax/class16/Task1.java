package com.syntax.class16;

public class Task1 {
	public static void main (String [] args) {
		
		// creat a string and based on teh length define whether string is long or short
		// long if 10+
		
		String str = "I love Java";
		
		int length = str.length();
		if (length >= 10) {
			System.out.println("String is long");
		} else {
			System.out.println("String is short");
		}
		
		// define which number is the largest and then define if the largest number is even or odd
		
		DifferentMethods number = new DifferentMethods();
		number.largest(10,20);
		
		
		if (num2 % 2==0) {
			System.out.println(num2 + " is even");
		} else {
			System.out.println(num2 + " is odd");
		}
				
		
	}
 int largest(int a, int b) {
	 
	 int largest;
	 
	 if(a>b) {
		 largest =a;
	 } else {
		 largest =b;
	 }
	 return largest;
 }
}
