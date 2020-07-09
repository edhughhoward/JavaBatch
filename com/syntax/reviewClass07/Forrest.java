package com.syntax.reviewClass07;

public class Forrest {

	 public static void main(String[] args) {
		
		 
		Bear b1 = new Bear();
		b1.name = "Bobby";
		Bear.count++;
		
		Bear b2 = new Bear();
		b2.name = "Baby";
		Bear.count++;
		
		Bear b3 = new Bear();
		b3.name = "Baba";
		Bear.count++;
		
		Wolf w1 = new Wolf();
		w1.name = "Wolfy";
		Wolf.count++;
		
		Wolf w2 = new Wolf();
		w2.name = "Cucumber";
		Wolf.count++;
		
		Wolf w3 = new Wolf();
		w3.name = "Stinger";
		Wolf.count++;
		
		System.out.println("There are " + Bear.count);
		System.out.println("There are " + Wolf.count);
	}
}
