package com.syntax.class18;

public class House {
public static void main(String[] args) {
	
	Cat cat1 = new Cat();
	cat1.name = "Jessy";
	cat1.age = 8;
	cat1.color = "grey";
	// to access static variables we use name of the class where they were declared
	System.out.println("Number of paws = " + Cat.paws);
	
	Cat cat2 = new Cat();
	cat2.name = "Luchy";
	cat2.age = 1;
	cat2.color = "white";
	cat2.name = "Bonchu";

	
	System.out.println(cat1.name);
	System.out.println(cat2.name);
	System.out.println(cat1.age);
	System.out.println("Printing values of cat 1=============");
	cat1.displayCat();
	cat1.displayCommonFeatures();
	cat2.mustache = false;/// don't access static in the main method, only in class 
	Cat.tail = false;
	System.out.println("Printing values of cat 2============");
	cat2.displayCat();
	cat2.displayCommonFeatures();

	Cat cat3 = new Cat();
	cat3.name = "Kathy";
	cat3.age = 4;
	cat3.color = "black";
	
	System.out.println("Printing values of cat 3=======");
	cat3.displayCat();
	cat3.displayCommonFeatures();
	
}
}
