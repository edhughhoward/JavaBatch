package com.syntax.repl;

import java.util.Scanner;

public class HW040 {
public static void main(String [] args) {
	/*First Output: "Enter name of the instructor"
	 * case 1: if User provided the name as Shiva as input it should show  "Will take care of Java Assignment
	 * case 2: if User provided the name as Sandish as input it should show  "Will take care of SDLC Assignment
	 * case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
	 * case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
	 * Other than these four names if the user provides any other names --> " Invalid instructor selected"
	 */
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Enter name of the instructor");
	String name = scan.nextLine();
	String result;
	
	switch (name) {
	case "Shiva":
		result = "Will take care of Java Assignment";
		break;
	case "Sandish":
		result = "Will take care of SDLC Assignment";
		break;
	case "Weqas":
		result = "Will take care of Selenium Assignment";
		break;
	case "Asel":
		result = "Will take care of every Assignment";
		default:
			result = " Invalid instructor selected";	

	}
System.out.println(result);	
	
	
	
	
	
}
}
