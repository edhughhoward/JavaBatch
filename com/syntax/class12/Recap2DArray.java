package com.syntax.class12;
public class Recap2DArray {
	public static void main(String[] args) {

		String[][] animals = {
				{"cat", "dog", "bird", "hamster"},
				{"tiger", "children", "bear" },
				{"Salmon", "Shrimp", "Sea Bass"}
		};
		int howManyArrays = animals.length; // how you find out how many arrays/rows
		System.out.println(howManyArrays);
		
		int elements1Array = animals[1].length;// how many elements in array
		System.out.println(elements1Array);
		
		String element = animals[1][1];
		System.out.println(element);
		System.out.println("======for loop");
		for (int r = 0; r < animals.length; r++) {
			for (int c = 0; c < animals [r].length; c++) {
				String animal = animals[r][c];
				System.out.println(animal);
			}
			System.out.println();
		}
				System.out.println("=======enhanced loop ");
				for (String[] array:animals) {
				
				for (String animal1:array) {
					System.out.println(animal1 + " ");
				}
			}
		}
	}