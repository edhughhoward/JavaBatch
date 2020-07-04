package com.syntax.class13;

public class Phone {

	/*
	 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
	 * specific attributes and behaviors.
	 */	
	
	String make;
	String model;
	String color;
	int year;
	
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.make = "iphone";
		p1.model = "6plus";
		p1.color = "Black";
		p1.year = 2000;
		p1.ring();
		p1.call();
		p1.buzz();
	
		Phone p2 = new Phone();
		p2.make = "Android";
		p2.model = "galaxy";
		p2.color = "white";
		p2.year = 1999;
		p2.ring();
		p2.call();
		p2.buzz();
		
		Phone p3 = new Phone();
		p3.make = "Nokia";
		p3.model = "90";
		p3.color = "green";
		p3.year = 1985;
		p3.ring();
		p3.call();
		p3.buzz();
		
	}
	
	
	
	void ring () {
		System.out.println("the " + make +" can ring");
	}
	void call() {
		System.out.println("the phone can call");
	}
	void buzz(){
		System.out.println("the phone will vibrate");
	}
	}
	

