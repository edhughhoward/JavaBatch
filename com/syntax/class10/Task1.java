package com.syntax.class10;

import java.util.Scanner;

public class Task1 {
public static void main (String [] args) {
Scanner scan = new Scanner(System.in);

	System.out.println("How many floors does your hotel have?");
	int floors = scan.nextInt();
	
	System.out.println("How many rooms does each floor have");
	int rooms = scan.nextInt();

	for (int i = 1; i <= floors; i++) {
		System.out.println("Floor # is: " + i);
		for (int j = 1; j <= rooms; j++) {
			System.out.println("Room # is: " + j);
		}System.out.println();
	}

}
}
