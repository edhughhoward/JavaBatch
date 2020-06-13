package com.syntax.class04;

import java.util.Scanner;

public class Loan {
	public static void main(String [] args) {
		/*You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 * 
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the loan amount requested:");
		long text = scan.nextLong();
		System.out.println(text);
	
	if (text <= 200000) {
	System.out.println("You are approved for the loan");
	} else {
	System.out.println("You have been rejected");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
