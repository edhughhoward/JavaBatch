package com.syntax.repl6;

public class HW178 {

	private String empName;
	private int empAge;

	public void setName(String empName) {
		this.empName = empName;
	}

	public void setAge(int empAge) {
		this.empAge = empAge;
	}

	public void getName() {
		System.out.println("Employee Age: " + empName);
	}

	public void getAge() {
		System.out.println("Employee Age: " + empAge);
	
	}

}
