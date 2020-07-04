package com.syntax.class13;

public class Car {
// define car features in variable form
	
	String make;
	String model;
	String color;
	int year;
	int speed;
public static void main(String[] args) {
	System.out.println("Hello, I am code from main method");
	Car c1 = new Car();
	c1.make = "Toyota";
	c1.model = "Camary";
	c1.color = "yellow";
	c1.year = 2020;
	c1.speed = 250;
	
	c1.drive();
	c1.reverse();
	c1.stop();
	c1.trasportPeople();
}
// define behavior in the form of methods
	
	void drive() {
		System.out.println(make + " can drive");
	}
	
	void reverse() {
		System.out.println(make + " can reverse");
	}

	void trasportPeople() {
		System.out.println(make + " can transport people");
	}
	void stop() {
		System.out.println(make + " will stop when press brake");
		System.out.println(make + " will stop");
	}
}
