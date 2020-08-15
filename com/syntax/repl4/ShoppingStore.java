package com.syntax.repl4;

public class ShoppingStore {
	/*
	 * Create variables as below. item, price, quantity
	 * 
	 * Create a constructor to initialize instance variables.
	 * 
	 * Create a method with name itemTotalPrice. write a logic to to calculate the
	 * total values of items in stock. and print the result. return the total value.
	 * 
	 * In Main Class. Create two Object of ShoppingStore and pass the parameters to
	 * Constructor. then using each object call the method itemTotalPrice. Store the
	 * returned value of each object. Calculate sum of both object and print the
	 * result.
	 */

	String item;
	double price;
	int quantity;

	ShoppingStore(String item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}

	public double itemTotalPrice() {
		double itemTotal = price * quantity;
		return itemTotal;
	}

}
