package com.syntax.class19;

public class Iphone {

	static String brand = "Apple";
	static String os = "ios";
	static boolean touchScreen=true;
	
	String model;
	int memory;
	double price;
	String color;
	
	void displayInfo() {
		System.out.println("iPhone belongs to brand " + brand + " and it has an operating system of " + os + " and it has a touchscreen " + touchScreen);
	}
	
	void displayDetails() {
		System.out.println("We built and iphone " + model + " with this memory " + "for this cost " + " and the color is " + color);
	}
	
	
	
}
