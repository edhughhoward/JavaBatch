package com.syntax.class19;

public class AppleStore {
public static void main(String[] args) {
	
	Iphone.touchScreen = false;
	
	Iphone phone1 = new Iphone();
	
	phone1.model = "11pro";
	phone1.memory = 256;
	phone1.price = 1000;
	phone1.color = "blue";
	
	phone1.displayDetails();
	phone1.displayInfo();
	
	Iphone phone2 = new Iphone();
	phone2.model = "6s";
	phone2.memory = 64;
	phone2.price = 500;
	phone2.color = "black";
	
	phone2.displayDetails();
	phone2.displayInfo();
}
}
