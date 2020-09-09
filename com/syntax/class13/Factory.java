package com.syntax.class13;

public class Factory {
	public static void main(String[] args) {

		CarRedo car1 = new CarRedo();
		car1.make = "tesla";
		car1.model = "x";
		car1.color = "red";
		car1.year = 2020;
		
		CarRedo car2 = new CarRedo();
		car2.color = "Blue";
		car2.make = "Honda";
		car2.model = "civic";
		car2.year = 2020;
		
		CarRedo car3 = new CarRedo();
		car3.color = "Orange";
		car3.make = "Toyota";
		car3.model = "Tundra";
		car3.year = 1998;
		
		System.out.println(car2.color);
		
	
	}
}
