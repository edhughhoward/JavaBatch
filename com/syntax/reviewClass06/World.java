package com.syntax.reviewClass06;

public class World {
public static void main(String [] args) {
	
	Baby baby1;
	
	baby1 = new Baby();
	
	baby1.firstName = "Ali";
	baby1.gender = 'M';
	baby1.lastName = "Khan";
	baby1.weight = 7;
	
	baby1.hairColor = "Brown";
	
	System.out.println("The name of the babdy is: " + baby1.firstName);
	System.out.println("The weight is: " + baby1.weight);
	
	String lastNameOfBaby = baby1.lastName;
	System.out.println(lastNameOfBaby);
	
	baby1.cry();
}
}
