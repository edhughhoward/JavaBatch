package com.syntax.repl4;

public class Employee1 {
	/*
	 * 1. Complete the Employee.java class:
	 * 
	 * Include the following class variables: name(String) lastName(String)
	 * employeeId(int) startDate(String) salary(int)
	 * 
	 * 
	 * Write two constructors:
	 * 
	 * non-argument constructor parameterized constructor that will initialize all
	 * instance variables
	 * 
	 * Create two different objects of the Employee class using both constructors
	 * and print the values of the properties inline using a print method.
	 */

	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;

	Employee1() {

	}

	Employee1(String name, String lastName, int employeeId, String startDate, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.salary = salary;
	}

	void displayInfo() {
		System.out.println(name + " " + lastName + " " + employeeId + " " + startDate + " " + salary);
	}

}
