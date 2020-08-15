package com.syntax.repl4;

public class CarObjects {
	/*
	 * Create instance variables as below. model price, quantity
	 * 
	 * Create a constructor that will initialize instance variables.
	 * 
	 * Create a method with name carStockValue. Write logic to calculate the total
	 * values of cars in stock and print the result.
	 * 
	 * run the application in Main Class
	 */

	String model;
	double price;
	int quantity;

	CarObjects(String model, double price, int quantity) {
		this.model = model;
		this.price = price;
		this.quantity = quantity;
	}

	void carStockValue() {
		double stockValue = price * quantity;
		System.out.println(model + " 2019" + " Stock Value " + stockValue);
	}

}
