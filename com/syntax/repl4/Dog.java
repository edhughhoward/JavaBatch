package com.syntax.repl4;

public class Dog {
	/*
	 * 1. Complete the Dog.java class:
	 * 
	 * Create following class variables. dogName dogWeight static dogBreed=Mutt; For
	 * all methods and variables use proper naming convention.
	 * 
	 * Create constructor to initialize instance variables
	 * 
	 * 2. In Main class Create 2 Objets of a Dog class and using each object
	 * reference variable print details of objects.
	 */
	String dogName;
	double dogWeight;
	static String dogBreed = "Mutt";

	Dog(String dogName, double dogWeight) {
		this.dogName = dogName;
		this.dogWeight = dogWeight;
	}

	public void details() {
		System.out.println(dogName + " " + dogBreed + " " + dogWeight);
	}

}
