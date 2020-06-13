package com.syntax.class06;

import java.util.Scanner;

public class SeasonsHomework {
	public static void main(String [] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter birth month");
		String month = keyboard.nextLine();
		
		String season = null;  
		
		if 		  (month.equals ("december") || month.equals ("january") || month.equals ("february")) {
				season = "Winter";
		} else if (month.equals ("march") || month.equals ("april") || month.equals ("may")) {
				season = "Spring";
		} else if (month.equals ("June") || month.equals ("July") || month.equals ("August")) {
				season = "Summer";
		} else if (month.equals ("September") || month.equals ("October") || month.equals ("November")) {
				season = "Fall";
		}
	System.out.println("You were born in " + season);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
