package com.syntax.class09;

import java.util.Scanner;

public class Task2 {
public static void main(String [] args) {
	/*
	 * Write a program to ask a user to enter an item they want to buy
	 * and the price of that item.
	 * Every time user enters money accumulate the amount 
	 * and tell the user how much is left to pay off.
	 * If user give more money program should return a change.
	 * When ever a user is done with payments program should say 
	 * "Thank you for shopping!"
	 */
	Scanner scan = new Scanner(System.in);  
		double money;
		double amount = 0;
		double remainingBalance;
		double change;
		
		System.out.println("Please enter the item that you want to buy!");
		String item = scan.nextLine();
		System.out.println("Please enter the price");
		double price = scan.nextDouble();
		
		do {
			System.out.println("Please give me the payment!");
			money = scan.nextDouble();
			amount += money;
			if (amount < price) {
				remainingBalance = price - amount;
				System.out.println("You owe this much money: " + remainingBalance);
			} else if (amount > price) {
				change = amount - price;
				System.out.println("Your change is " + change);
			} else {
				System.out.println("You gave exact change");
			}
		} while(amount < price);
		System.out.println("Thank you for shopping!");
		
		
		
		
		
		
	
	scan.close();
}
}
