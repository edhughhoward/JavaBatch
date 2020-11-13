package com.syntax.class08;

public class Hospital {
	public static void main(String[] args) {

		Doctor d1 = new Doctor("John", "Family Doctor", 123456);
		d1.displayInfo();
		d1.checkUp("Luis");
		System.out.println("Doctor name is: " + d1.name);
		
		
	}
}
