package com.syntax.class04;

public class mortage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Create a Java program and store values of mortgage rate and mortgage price. 
 * First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. 
 * Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
 */
	
	double rate = 3.1;
	long price = 1000;
	
	if (rate > 4.5) {
		System.out.println("I will not buy the house.");
	} else {
		System.out.println("I will consider buying the house.");
		if (price > 200000) {
			System.out.println("I will take a loan");
		} else {
				System.out.println("I will pay in cash");
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
