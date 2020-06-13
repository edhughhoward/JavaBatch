package com.syntax.class04;

public class Nestedifext {
 public static void main(String [] args) {
	 /*check if patient has allergies
	  * if no allergies ----> healthy
	  * otherwise:
	  * - peanut allergy: don't eat peanuts
	  * - lactose allergy: don't drink milk
	  * - bee allergy: don't mess with bees
	  */
	 boolean allergy = true;
	 boolean nut = true;
	 boolean milk = true;
	 boolean bee = true;
	 boolean seafood = true;
	 
	 if (!allergy) {
		 	 System.out.println("You are healthy");
		 } else {
			 if (nut) {
			 System.out.println("Don't eat nuts");
		 }  if (milk) {
			 System.out.println("Don't drink milk");
		 }  if (bee) {
			 System.out.println("Don't hang with bees");
		 }  if (seafood) {
			 System.out.println("dont eat seafood");
		 }
		 } 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
}
