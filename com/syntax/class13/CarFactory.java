package com.syntax.class13;

public class CarFactory {
public static void main(String [] args) {
	
	Car car1 = new Car();
	car1.make = "Tesla";
	car1.model = "X";
	car1.color = "Red";
	car1.year = 2020;
	car1.speed = 200;
	System.out.println(car1.make + " Color is " + car1.color);
	System.out.println("====== accessing methods=====");
	car1.drive();
	car1.reverse();
	car1.trasportPeople();
	
	Car car2 = new Car();
	car2.make = "BMW";
	car2.model = "M5";
	car2.color = "Blue";
	car2.year = 2018;
	car2.speed = 240;
	System.out.println(car2.make + " Color is " + car2.color);
	car2.drive();
	car2.reverse();
	car2.trasportPeople();
	
	
	Car car3 = new Car();
	car3.make = "Toyta";
	car3.model = "Tundra";
	car3.color = "Black";
	car3.year = 2000;
	car3.speed = 200;
	System.out.println(car3.make + " Color is " + car3.color);
	car3.drive();
	car3.reverse();
	car3.trasportPeople();
	
	Car car4 = new Car();
	car4.make = "Land Rover";
	car4.model = "Range";
	car4.color = "Orange";
	car4.year = 2020;
	car4.speed = 2000;
	System.out.println(car4.make + " Color is " + car4.color);
	car4.drive();
	car4.reverse();
	car4.trasportPeople();
	
}
	
	
}
