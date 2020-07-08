package com.syntax.class18;

public class InstanceVariables {

	String name = "Jane"; // instance variable, is outside of main method
	
	public static void main(String[] args) {
		
		String name = "Kristina";// local variable, is declared inside of main method
		System.out.println(name);
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);
		
		name = "Castro";
		System.out.println(name);
		
		obj.name = "Ed";
		System.out.println(obj.name);
		
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
				
	}
}
