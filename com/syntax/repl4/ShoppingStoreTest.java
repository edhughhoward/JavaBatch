package com.syntax.repl4;

public class ShoppingStoreTest {
	public static void main(String[] args) {

		ShoppingStore obj1 = new ShoppingStore("Blanket", 99.98, 1);
		System.out.println(obj1.item + " Total Value " + obj1.itemTotalPrice());

		ShoppingStore obj2 = new ShoppingStore("Mattress", 439.18, 1);
		System.out.println(obj2.item + " Total Value " + obj2.itemTotalPrice());

		System.out.println("You purchased " + (obj1.itemTotalPrice() + obj2.itemTotalPrice()) + " Today");
	}
}
