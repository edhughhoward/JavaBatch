package com.syntax.class12;

public class Task1 {

	public static void main(String[] args) {

		String[][] food = {
				{"apples", "oranges", "bananas"},
				{"kale", "spinach", "beans"},
				{"pudding", "cake", "pie"}
		};
	for (String[] array:food) {
		for (String list:array) {
			System.out.println(list);
		}
	}
	System.out.println("===================");
	
	
	for (int row = 0; row < food.length; row++) {
		for (int col = 0; col < food[row].length; col++) {
			String list2 = food[row][col];
			System.out.println(list2);
		}
	}
	}
}
