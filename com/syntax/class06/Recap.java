package com.syntax.class06;

public class Recap {
	public static void main(String [] args) {
		//If hour is between 1am - 11am then it is morning
		// if hour is between 12pm - 15pm then it is afternoon
		// if hour is between 16pm - 20pm it is evening
		// if hour is between 21pm - 24 it is night
		
		int hour = 35;
		String dayTime;
		
		if (hour >= 1 && hour <= 11) {
			dayTime = "morning";
		} else if (hour >= 12 && hour <= 15) {
			dayTime = "afternoon";
		} else if (hour >= 16 && hour <= 20) {
			dayTime = "evening";
		} else if (hour >= 21 && hour <= 24) {
			dayTime = "night";
		} else {
			dayTime = "unknown";
		}
		if (!dayTime.equals ("Unknown")) {
		System.out.println("Right now it is " + dayTime);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
