package com.syntax.class21;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.breed = "";
		a.color = "grey";
		a.paws = 4;
		
		a.sleep();
		a.eat();
		
		Dog dog = new Dog();
		dog.breed = "Huskie";
		dog.color = "Yellow";
		dog.paws = 4; 
		dog.tail = true;
		dog.eat();
		dog.sleep();
		dog.bark();
		
		Cat cat = new Cat();
		cat.breed = "Tabby";
		cat.color = "White";
		cat.paws = 4;
		cat.purr();
		cat.eat();
		cat.sleep();
		
		Kitten kat = new Kitten();
		kat.purr();
		kat.tail = true;
	}
}
