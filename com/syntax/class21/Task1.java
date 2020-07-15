package com.syntax.class21;

public class Task1 {

	String name;
	String address;

	Task1(String name, String address) {
		this.name = name;
		this.address = address;
	}

	void displayName() {
		System.out.println("Student Name is: " + name);
	}

	void displayAddress() {
		System.out.println("Their address is: " + address);
	}

	void displayInfo() {
		displayName();
		displayAddress();
	}

	public static void main(String[] args) {
			
			Task1 obj = new Task1("Ed Howard", "5069 Sheriff Road NE");
			obj.displayInfo();
		}

}
