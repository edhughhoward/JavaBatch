package com.syntax.class25;

public class Computer {
	
	String name;
	
	public Computer (String name) {
		this.name = name;
	}
	public void powerbutton() {
		System.out.println("I turn on");
	}
}

	class Apple extends Computer {
		public Apple(String name) {
			super(name);
		}
		
		public void powerbutton() {
			System.out.println("I turn on with " + name + " logo");
		}
		public void popularity() {
			System.out.println("I am the most popular");
		}
	}
	class Lenovo extends Computer {
		public Lenovo(String name) {
			super(name);
		}
		public void powerbutton() {
			System.out.println("I turn on with Lenovo logo");
		}
		
	}
	class HP extends Computer{
		public HP(String name) {
			super(name);
		}
		public void powerbutton() {
			System.out.println("I turn on with HP logo");
		}
		
	}
	class Dell extends Computer{
		public Dell(String name) {
			super(name);
		}
		public void powerbutton() {
			System.out.println("I turn on with Dell logo");
		}
	}

