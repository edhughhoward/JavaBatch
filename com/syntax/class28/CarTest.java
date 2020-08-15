package com.syntax.class28;

public class CarTest {
public static void main(String[] args) {
	
	Sedan car1 = new Sedan();
	car1.length = 40;
	car1.carPrice = 100000;
	System.out.println(car1.calculateSalePrice());
	
	Truck car2 = new Truck();
	car2.weight = 280;
	car2.carPrice = 20000;
	System.out.println(car2.calculateSalePrice());
}
}
