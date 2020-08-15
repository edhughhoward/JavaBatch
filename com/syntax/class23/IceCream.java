package com.syntax.class23;

public class IceCream {

	String flavor;
	String brand;
	String color;
	
	public IceCream(String flavor, String brand, String color){
		this.flavor = flavor;
		this.brand = brand;
		this.color = color;
		
	}
}
class Gelato extends IceCream{
	
	public Gelato(String flavor, String brand, String color) {
		super(flavor, brand, color);
	}
}

class Sorbeto extends IceCream{
	
	public Sorbeto (String flavor, String brand, String color, double price) {
		super(flavor, brand, color);
		this.price = price;
		
	}
	public Sorbeto(double price) {
		this.price = price;
	}
}
