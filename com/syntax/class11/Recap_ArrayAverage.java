package com.syntax.class11;

public class Recap_ArrayAverage {
public static void main (String [] args) {
	
	int [] grades = new int [5];
	
	int size = grades.length;

	grades[4] = 90;
	grades[3] = 85;
	grades[2] = 92;
	grades[1] = 75;
	grades[0] = 100;
	
	int average = (grades[4] + grades[3] + grades[2] + grades[1] + grades[0])/size;
	
	System.out.println(average);
	// or
	
	int total = 0;
	for (int k =0; k < size; k++) {
		total += grades[k];
		
	}
	System.out.println(total/size);
	System.out.println("======================================");
	
	String[] cities = {"Fairfax", "Kiev", "Tampa", "Washington", "Arlington"};
	System.out.println(cities[2]);
	
	// or 
	
	int i = 1;
	
	System.out.println(cities[i]); //i is now equal to 1 ---> which is Kiev
	
	i+=2; // i plus 2
	System.out.println(cities[i]); // i is now equal to 3 ---> Washington
	
	int size2 = cities.length;
	System.out.println(size2);
	
	// the size is how many elements there are (5) take away 1 and you will get the last index
	System.out.println(cities[size2-1]); 
	System.out.println("=================================================================");
	// to print all the cites
	for (int j = 0; j < 5; j++) {
		System.out.println(cities[j]);
	}
	
}
}
