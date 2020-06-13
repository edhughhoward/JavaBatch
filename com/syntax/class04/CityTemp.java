package com.syntax.class04;

import java.util.Scanner;

public class CityTemp {
	public static void main(String [] args) {
		/*Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print "The temperature is the city __ is __"
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your city:");
		String city = scan.nextLine();
		System.out.println("Please enter your temperature in Fahrenheit:");
		int tempF = scan.nextInt();
		int tempC = (tempF) - 32 * 5/9;
		
		
		
		
		System.out.println("The temperature in " + city + " is " + tempC + " celsius");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
