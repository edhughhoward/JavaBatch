package com.syntax.class26;

public abstract class Vehicle {
	public String vin;
	public static int totalVehicles;
	
	public Vehicle(String vin) {
		this.vin = vin;
		totalVehicles++;
	}
	public static int total() {
		return totalVehicles;
	}
	public void drive() {
		System.out.println("All vehicle drives");
	}
	public void stop() {
		System.out.println("All vehicles stop by pressing break");
	}
	public abstract void start();
	public abstract void openTrunk();
	
}
class Car extends Vehicle{
	public Car(String vin) {
		super(vin);
	}
	public void start() {
		System.out.println("The car can start");
	}
	public void openTrunk() {
		System.out.println("The trunk can open");
	}
}
