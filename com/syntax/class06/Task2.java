package com.syntax.class06;

import java.util.Scanner;

public class Task2 {
public static void main(String [] args) {
	
//	Allow user to enter grade and then provide explanation: 
//		A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
//		At the end your program should print which grade was entered by a user with explanation.
//	
	
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Please enter a grade");
	String grade = keyboard.nextLine();
	
	switch (grade.toLowerCase()) {
	
	case "a":
		grade = "A - Excellent";
		break;
	case "b":
		grade = "B - Good";
		break;
	case "c":
		grade = "C - Average";
		break;
	case "d":
		grade = "D - Bad";
		break;
	default:
		grade = "Not Acceptable";
		break;
	
	
	
	}
	System.out.println("The grade you entered is " + grade);
	
	keyboard.close();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
