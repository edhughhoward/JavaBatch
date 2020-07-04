package com.syntax.class12;

public class Class11Recap {

	public static void main(String [] args) {
	
		String [] colors = new String [3];
		colors [0] = "blue";
		colors [1] = "yellow";
		colors [2] = "red";
		
		System.out.println(colors.length);
		System.out.println("========");
		for (int b = 0; b < colors.length; b++) {
			String color = colors[b];
			System.out.println(color);
		}
		System.out.println("=========");
		for (String c:colors) {
			System.out.println(c);	
		}
	}
}
