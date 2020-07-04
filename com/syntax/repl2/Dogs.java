package com.syntax.repl2;

public class Dogs {

	/*
	 * In this class, you should specify the following attributes: 
	 * breed, name, color,
	 * following behaviors: bark(), run(), play(). 
	 * Create 3 different
	 * objects of it: Husky, Bulldog, Labrador with specific attributes and
	 * behaviors.
	 * Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
	 */
	
	String breed;
	String name;
	String color;
	
	public static void main(String [] args) {
	
	Dogs dog1 = new Dogs();	
	dog1.breed = "Husky";
	dog1.name = "Alex";
	dog1.color = "Black";
	dog1.bark();
	dog1.run();
	dog1.play();
	
	Dogs dog2 = new Dogs();
	dog2.breed = "Bulldog";
	dog2.name = "John";
	dog2.color = "White";
	dog2.bark();
	dog2.run();
	dog2.play();
	
	
	Dogs dog3 = new Dogs();
	dog3.breed = "Labrador";
	dog3.name = "Mush";
	dog3.color = "Brown";
	dog3.bark();
	dog3.run();
	dog3.play();
	
	}
	void bark() {
		System.out.println(breed + " can bark");
	}
	void run() {
		System.out.println(breed + " can run");
	}
	void play() {
		System.out.println(breed + " can play");

	}
	
	
	
}
