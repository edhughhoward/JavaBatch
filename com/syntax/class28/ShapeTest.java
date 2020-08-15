package com.syntax.class28;

public class ShapeTest {
	public static void main(String[] args) {

		Circle c = new Circle();
		c.radius = 20;

		c.calculateArea();
		c.calculatePerimiter();

		Square s = new Square();
		s.side = 10;

		s.calculateArea();
		s.calculatePerimiter();
	}
}
