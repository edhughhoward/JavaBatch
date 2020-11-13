package com.syntax.class08;

public class Doctor {
	public String name;
	public String specialty;
	public int id;

	public Doctor(String name, String specialty, int id) {
		this.name = name;
		this.specialty = specialty;
		this.id = id;
	}
	public void checkUp(String name) {
		System.out.println("Doctor: " + this.name + " ordered a blood test for: " + name);
	}

	public void chargePatient() {
		System.out.println();
	}

	public void displayInfo() {
		System.out.println("Doctor " + name + " with license ID: " + id + " is a " + specialty);
	}
}
