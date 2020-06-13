package com.syntax.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not. 
		// If you user does not have a credit card then offer them. 
		// If they do have one ask what is balance on the card? 
		// If balance of the card is larger than 1000, tell them to pay off immediately,
		// otherwise you can tell them that they can spend more.

		
		Scanner input = new Scanner(System.in);
//		boolean card = true;
//		boolean yes = true;
//		boolean no = false;
//		long balance;
		
		System.out.println("Do you have a credit card? (YES or NO)");
		String text = input.nextLine();
			if (text.equals ("NO")) {
				System.out.println("Can I offer you a credit card.");
				} else {
					System.out.println("What is the balance on your card?");
				} long balance = input.nextLong();
				if (balance > 1000) {System.out.println("Please pay off your card immediately");}
				else
				{System.out.println("You can spend more! ");}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
