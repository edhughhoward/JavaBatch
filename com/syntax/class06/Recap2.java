package com.syntax.class06;

import java.util.Scanner;

public class Recap2 {
	public static void main(String [] args) {
		//If hour is between 1am - 11am then it is morning
		// if hour is between 12pm - 15pm then it is afternoon
		// if hour is between 16pm - 20pm it is evening
		// if hour is between 21pm - 24 it is night
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the time");
		double hour = input.nextDouble();
		
		if (hour >= 1 && hour <= 11) {
			System.out.println("It is the morning");
		} else if (hour >= 12 && hour <= 15) {
			System.out.println("It is the afternoon");
		} else if (hour >= 16 && hour <= 20) {
			System.out.println("It is evening");
		} else if (hour >= 21 && hour <= 24) {
			System.out.println("It is night");
		} else {
			System.out.println("this is an invalid number");
		}
		
	
	
	
	
	
	
	
	
	
	
	}
}
