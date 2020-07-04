package com.syntax.class13;
public class Dog {

	String breed;
	String color;
	String size;
	int age;
	
	public static void main(String [] args) {
		
		Dog d1 = new Dog();
		d1.breed = "Husky";
		d1.color = "Brown";
		d1.size = "Large";
		d1.age = 16;
		
		Dog d2 = new Dog();
		d2.breed = "Bulldog";
		d2.color = "white";
		d2.size = "Medium";
		d2.age = 7;
		
		Dog d3 = new Dog();
		d3.breed = "Labrador";
		d3.color = "Black";
		d3.size = "Small";
		d3.age	= 1;
		d1.bark();
		d1.run();
		d2.drinks();
		
		
	}
	void bark() {
		System.out.println(breed + " barks Loud");
	}
	void run() {
		System.out.println("The " + color + " dog runs fast");
	}
	void drinks() {
		System.out.println(" The " + breed + " is " + color + " and is " + size + " and is " + age + " years old");
	}
}
