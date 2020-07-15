package com.syntax.class20;

public class Flower {

	String type;

	private Flower(String flowerType){
		type = flowerType;
	}
	
	void Flower(){
		System.out.println("Printing whatever");
	}
	public void display() {
		System.out.println(type);
	}
	
	public static void main(String[] args) {

//		Flower flower = new Flower();
//		System.out.println(flower.type);
		
		Flower flower2 = new Flower("Tulip");
		System.out.println(flower2.type);
		
		flower2.display();
		flower2.Flower();
	}
}
