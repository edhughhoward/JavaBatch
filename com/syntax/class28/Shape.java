package com.syntax.class28;

public interface Shape {
	/*
	 * Create an Interface 'Shape' with undefined methods as calculateArea and
	 * calculatePerimiter. Create 2 classes Circle & Square that implements
	 * functionality defined in the Shape Interface. Test your code.
	 */

	public abstract void calculateArea();

	public abstract void calculatePerimiter();
}

class Circle implements Shape {
	double p = 3.14;
	double radius;

	public void calculateArea() {
		System.out.println(p * radius * radius);
	}

	public void calculatePerimiter() {
		System.out.println(2 * p * radius);
	}
}

class Square implements Shape {

	double side;

	public void calculateArea() {
		System.out.println(side * side);
	}

	public void calculatePerimiter() {
		System.out.println(side * 4);
	}
}
