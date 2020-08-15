package com.syntax.repl3;

public class StoreProductTest {
	public static void main(String[] args) {

		StoreProduct obj1 = new StoreProduct("Eggs", 3, "Produce", true, 10);
		obj1.displayInfo();

		StoreProduct obj2 = new StoreProduct("Paper Towels", 2, 24);
		obj2.displayInfo();

		StoreProduct obj3 = new StoreProduct("Paper Towels", 2);
		obj3.displayInfo();

	}

}
