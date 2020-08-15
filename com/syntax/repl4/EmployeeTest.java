package com.syntax.repl4;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee1 obj1 = new Employee1();
		obj1.displayInfo();

		Employee1 obj2 = new Employee1("Joe", "Smith", 12345, "01/01/1970", 35000);
		obj2.displayInfo();
	}
}
