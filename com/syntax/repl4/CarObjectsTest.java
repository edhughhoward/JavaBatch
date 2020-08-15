package com.syntax.repl4;

public class CarObjectsTest {
	public static void main(String[] args) {
		CarObjects obj1 = new CarObjects("Toyota", 625000, 4);
		obj1.carStockValue();

		CarObjects obj2 = new CarObjects("BMW", 163245, 4);
		obj2.carStockValue();
	}
}
