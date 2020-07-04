package com.syntax.class06;

import java.util.Scanner;

public class Task1 {
	public static void main(String [] args) {
		
		/*Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 * 
		 */
//		
//		Scanner keyboard = new Scanner(System.in);
//	System.out.println("Please enter a country, USA, Germany or France");
//		String lang = keyboard.nextLine();
//
//		switch (lang.toLowerCase()) {
//		case "usa":
//		case "england":
//			lang = "english";
//			break;
//		case "germany":
//			lang = "german";
//			break;
//		case "france":
//			lang = "french";
//			break;
//		default:
//			lang = "not recocnized";
//		}
//	
//		System.out.println("The language you are looking for is " + lang);
//		
//		keyboard.close();
		
		
		Scanner keyboard = new Scanner(System.in);
				System.out.println("Please enter country of origin, USA, France or Germany");
		String lang = keyboard.nextLine();
				
				switch (lang.toLowerCase()) {
				
				case "usa":
					lang = "english";
					break;
				case "france":
					lang = "french";
					break;
				case "germany":
					lang = "german";
					break;
					
				default:
					lang = "Invalid";
					break;
		
					
	}	
				
				System.out.println("The language you are looking for is " + lang);
				keyboard.close();
		
		
	
		
		
		
		
		
		
		
		
	}
}
