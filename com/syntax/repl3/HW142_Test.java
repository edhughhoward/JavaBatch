package com.syntax.repl3;

public class HW142_Test {

	public static void main(String[] args) {

		Car obj1 = new Car("Toyota", "Prius", 4, 120, 30000.0);
		obj1.displayInfo();

		Car obj2 = new Car("Toyota", "Prius", 120, 30000.0);
		obj2.numberOfDoors = 4;
		obj2.displayInfo();

		Car obj3 = new Car(4, 120, 30000.0);
		obj3.make = "unknown";
		obj3.model = "unknown";
		obj3.displayInfo();

		Car obj4 = new Car("Toyota", "Prius", 4);
		obj4.topSpeed = 90;
		obj4.price = 0;
		obj4.displayInfo();
	}

}
