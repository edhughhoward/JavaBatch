package com.syntax.class19;

public class Employee {

	public static String company;
	public String name, lastName;
	protected int age;
	double salary;
	private long ssn;
	
	public static void displayCompany() {
		System.out.println("Employee works at " + company);
	}
	public void displayName() {
		System.out.println("Employee name is " + name + " " + lastName);
	}
	protected void displayAge() {
		System.out.println("Employee is " + age + " years old");
	}
	void displaySalary() {
		System.out.println("Employee salary is " + salary);
	}
	private void displaySsn() {
		System.out.println("Employee SSN is " + ssn);
	}
public static void main(String[] args) {
	company = "Google";


	Employee emp = new Employee();
	emp.name = "Ahmed";
	emp.lastName = "Smith";
	emp.age = 21;
	emp.salary = 90000;
	emp.ssn = 123456789;
	
	emp.displayName();
	emp.displayAge();
	emp.displaySalary();
	emp.displaySsn();
	
}
	}
	

