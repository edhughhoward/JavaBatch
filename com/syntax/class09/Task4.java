package com.syntax.class09;

public class Task4 {
public static void main(String [] args) {
//	Print the following pattern:
//		*
//		**
//		***
//		****
//		*****
	
	for (int i = 1; i <=5; i++) {
		for (int k =1; k<=i; k++ )
			System.out.print("*");
		System.out.println();
	}
	
}
}
