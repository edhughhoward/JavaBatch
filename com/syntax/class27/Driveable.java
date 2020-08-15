package com.syntax.class27;

public interface Driveable {
	String DRIVE = "Drive safe";// compiler will add: public static final 
	 void drive();// compiler will add: public abstract
}
class Motorcycle implements Driveable {
	
	public void drive() {
		System.out.println("The motorcycle can drive");
	}
}
