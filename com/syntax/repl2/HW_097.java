package com.syntax.repl2;

import java.util.Scanner;

public class HW_097 {
public static void main(String [] args) {

		    Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter the browser name to proceed further with execution");
		    String browser = sc.nextLine(); 
		    
//		    If browser is Chrome or Chrome or CHROME or ChRoMe it should print the: 
//		    	"Proceed with Chrome browser"
//
//		    	If browser is firefox, FIREFOX or FireFOX it should print the: 
//		    	"Proceed with Firefox browser"
//
//		    	If browser is IE, ie or iE it should print the:
//		    	"Proceed with IE browser"
//
//		    	If any other browser it should print the:  
//		    	"Invalid browser"


			   
			
			if (browser.equalsIgnoreCase("chrome")) {
				System.out.println("Proceed with Chrome browser");
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.out.println("Proceed with Firefox browser");
			} else if (browser.equalsIgnoreCase("IE")) {
			  System.out.println("Proceed with IE browser");
		  } else {
			 System.out.println("Invalid browser");
		  }
			}
		  } 