package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test17 {
public static void main(String [] args) {
	// Print numbers from 1 to 100 in 1 line with space
	
	
	
	for (int num1= 1; num1 <= 100; num1++) {
		System.out.print(num1 + " ");
		
	}
System.out.println("=========================================");

// Print numbers from 100 to 1

for (int num2=100; num2 >=1; num2--) {
	System.out.println(num2 + " ");
}
System.out.println("====================================================");

//Print even numbers from 20 to 1 (2 ways)

for (int num3 = 20; num3 >= 1; num3--) {
	if (num3 % 2 == 0) {
		System.out.println(num3 + " ");
	}
}
System.out.println("===================================");
// Print odd numbers between 20 and 50 (2 ways)
for (int num4 = 20; num4 <= 50; num4++)
	if (num4 % 2 == 1) {
		System.out.println(num4 + " ");
	}

}
}
