package com.syntax.class26;

public class VehicleTest {
public static void main(String[] args) {
	Vehicle obj = new Car("1233");
	obj.drive();
	obj.start();
	obj.stop();
	obj.openTrunk();
	int total = Vehicle.total();
	System.out.println(total);
	
	
	
}	
}
