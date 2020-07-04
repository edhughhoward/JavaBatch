package com.syntax.repl;

import java.util.Scanner;

public class HW045 {
public static void main(String [] args) {
//	Ask the user to enter any number from 1-7.
//	Based on the number define the day of the week
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter any number from 1-7");
	int day = scan.nextInt();
	
	String result;
	
	switch (day) {
	case 1:
		result = "Monday";
		break;
	case 2:
		result = "Tuesday";
		break;
	case 3:
		result = "Wednesday";
		break;
	case 4: 
		result = "Thursday";
		break;
	case 5:
		result = "Friday";
		break;
	case 6:
		result = "Saturday";
		break;
	case 7:
		result = "Sunday";
		break;
		default:
			result ="Invalid";
	}
	System.out.println(result);
	
	
	
	
	
}
}
