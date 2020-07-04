package com.syntax.repl;

import java.util.Scanner;

public class HW044 {
public static void main(String [] args) {
	/*
	 * Prompt user with questions: "Please enter your favorite car make"
	 * 
	 * if user enters BMW --> carOrigin = "german car" 
	 * if user enters Toyota --> carOrigin = " japanese car" 
	 * if user enters Maserati --> carOrigin = "italian car" 
	 * anything else besides those values --> carOrigin = "unknown"
	 */
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter your favorite car make");
	String make = scan.nextLine();
	
	String result;
	
	switch (make) {
	
	case "BMW":
		result = "german car";
		break;
	case "Toyota":
		result = "japanese car";
		break;
	case "Maserati":
		result = "italian car";
		break;
	default:
		result = "unknown";
		
	}
	System.out.println("Your favorite car is " + result);
}
}
