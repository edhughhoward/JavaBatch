package com.syntax.repl4;

public class Employee extends Person { 
	int salary; 
	Employee(String name, String lastName, int age, int salary) { 
		super(name, lastName, age);
		this.salary = salary;
		
	}
	public void detailsEmp() {
	System.out.println(name + " " + lastName + " " + age + " " + salary);
}
}
