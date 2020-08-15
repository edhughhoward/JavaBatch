package com.syntax.repl3;

public class StoreProduct {

	String label, category;
	double price;
	int stock;
	boolean hasExpiration;

	public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
		this.label = label;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.hasExpiration = hasExpiration;
	}

	public StoreProduct(String label, double price, int stock) {
		this.label = label;
		this.price = price;
		this.stock = stock;
		this.category = "misc";

	}

	public StoreProduct(String label, double price) {
		this.label = label;
		this.price = price;
	}

	void displayInfo() {
		System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
	}
}
