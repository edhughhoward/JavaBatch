package com.syntax.class09;

public class Task5 {
public static void main (String [] args) {
//	Print the following pattern:
//		55555
//		4444
//		333
//		22
//		1
	
	for (int i = 5; i == 5; i++) {
		for (int k = 1; k <= 5; k++)
			System.out.print(i);
		System.out.println();
	}
	for (int i = 4; i == 4; i++) {
		for (int k = 1; k <=4; k++)
		System.out.print(i);
		System.out.println();
	}
	for (int i =3; i==3; i++) {
		for (int k = 1; k<=3; k++)
			System.out.print(i);
		System.out.println();
	}
	for (int i = 2; i == 2; i++) {
		for (int k = 1; k <=2; k++)
			System.out.print(i);
		System.out.println();
	}
	for (int i = 1; i == 1; i++) {
		for (int k = 1; k==1; k++)
			System.out.print(i);
		System.out.println();
	}
	System.out.println("==========================2nd way================");
	
	for (int i =5; i >=1; i--) {
		for (int k = 1; k <=i; k++)
			System.out.print(i);
		System.out.println();

	}
	System.out.println("==================================");
	for (int row = 1; row <= 4; row++) {
		for (int col = row; col >= 1; col--) {
			System.out.print(col);
			System.out.println();
		}
	}
	for (int i = 5; i> 0; i--) {
		for (int j = i; j>= 1; j--)
			System.out.print(j);
		System.out.println();
	}
		
}
}
