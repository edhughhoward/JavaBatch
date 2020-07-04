package com.syntax.class11;

public class HomeworkReview {
public static void main(String [] args) {
	
	int[] grades = new int[5];
	
	int size = grades.length;
	System.out.println("Array size is: " + size);
	
	grades[4] =90;
	grades[3] =85;
	grades[2] =92;
	grades[1] =75;
	grades[0] =100;
	
	int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4])/size;
	
	System.out.println("Class average is: " + average);
	
	int total = 0;
	for (int k = 0; k <= 5; k++) {
		total += grades[k];
		
	}
	
	
	
	
	
	
	System.out.println("=====================================================");
	String[] cities = {"Fairfax", "Kiev", "Tampa", "Washington", "Arlington", "NYC", "DC", "Chicago"};
	System.out.println("I live in " + cities[2]);
	
	int i = 1;
	System.out.println("I live in " + cities[i]);
	
	i += 2;
	System.out.println("I moved to " + cities [i]);
	
	int length = cities.length;
	System.out.println("Total number of cities is: " + length);
	
	System.out.println("The last city in the list is: " + cities[4]);
	
	System.out.println("The last city in the list is: " + cities[length-1]);

	// I want to print all the cities
	// cities [0], cities[1], .... cities[7]
	for (int j = 0; j < 8; j++) {
		System.out.println(cities[j]);
	}


}
}
