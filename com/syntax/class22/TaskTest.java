package com.syntax.class22;

public class TaskTest {

	public static void main(String[] args) {
		
		Developer obj = new Developer();
		
		obj.work();
		obj.fullName = "Ed Howard";
		obj.getPaid();
		Developer.company = "WellsFargo";
		obj.salary = 100.00;
	
		Employee.company = "google";
	}
}
