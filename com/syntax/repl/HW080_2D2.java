package com.syntax.repl;

public class HW080_2D2 {
public static void main(String [] args) {
//	Write a program to double the values of every element in the array and print it out.
//
//	Example Output:
//	2.8 4.0 6.6 4.0 
//	8.0 3.0 12.2 2.0 
//	2.4 6.2 8.0 3.2
	double[][] a = {
			{1.4,2.0,3.3,2},
			{4,1.5,6.1,1},
			{1.2,3.1,4,1.6}
		};
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j] * 2+" ");
		}
		System.out.println();
	}
}

}