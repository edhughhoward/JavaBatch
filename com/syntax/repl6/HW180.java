package com.syntax.repl6;

public class HW180 {

	private String empName = "John";
	private int empAge = 30;
	
	public void getEmpAge() {
		System.out.println("Employee Age: " + empAge);
	}
	public void getEmpName() {
		System.out.println("Employee Name: " + empName);
	}
	
	

public static void main(String[] args) {
	
	HW180 obj = new HW180();
	obj.getEmpName();
	obj.getEmpAge();
	
}
}
