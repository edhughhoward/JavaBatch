package com.syntax.repl;

public class HW081_2D3 {
public static void main (String [] args) {
	/*
	 * Write a program that prints the highest value in the array.
	 * 
	 * Expected Output: 8
	 */
	int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};

int maxNum = a[0][0];
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a[i].length; j++)
		if (maxNum < a[i][j]) {
			maxNum = a[i][j];
		}
}
System.out.println(maxNum);
}

}

