package com.syntax.class20;

public class Car {

		public static String make;
		protected String model, color;
		private double price;
		int year, door, speed;
		
		public void displayInfo() {
			System.out.println("We build " + year + " " + make + " " + model + " for this much "+ price);
		}
		
		Car(){
			System.out.println("I am a constructor");
		}
		
		public static void main(String [] args) {
			
			Car car = new Car();
			
			make = "BMW";
			car.model = "M5";
			car.year = 2021;
			car.color = "pink";
			car.door = 2;
			car.speed = 200;
			car.price = 90000;
			
			Car car1 = new Car();
			car1.model = "i5";
			car1.year = 2020;
			car1.color = "blue";
			car1.door = 4;
			car1.speed = 180;

			car.displayInfo();
			car1.displayInfo();
		
			
			//String driver; // driver is a local variable and needs to be initialized and CAN NOT BE STATIC
			// System.out.println(driver);
		}
}
