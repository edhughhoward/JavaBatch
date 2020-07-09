package com.syntax.class18;

public class Employee {

	int empID, salary;

	static String ceo = "Sumair";

	void displayEmployee() {
		System.out.println(
				"The employee number is " + empID + " and " + "the salary is " + salary + " the CEO is " + ceo);
	}
	
	static void sayHello() {
		System.out.println("Hi " + ceo);
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.empID = 001;
		emp1.salary = 50000;
		emp1.displayEmployee();

		Employee emp2 = new Employee();
		emp2.empID = 002;
		emp2.salary = 100;
		emp2.displayEmployee();
		
		sayHello();

	}

}
