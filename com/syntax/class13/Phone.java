package com.syntax.class13;

public class Phone {

	String make;
	int size;

	
	void canRing() {
		System.out.println(make + " can ring");
	}
	void call() {
		System.out.println("Phone can call");
	}
	
	public static void main(String[] args) {
	Phone iphone = new Phone();
	Phone Android = new Phone();
	Phone Nokia = new Phone();
	
	iphone.make = "X";
	iphone.size = 64;
	iphone.canRing();
	iphone.call();
	}
}
