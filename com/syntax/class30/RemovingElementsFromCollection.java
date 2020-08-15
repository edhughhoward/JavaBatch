package com.syntax.class30;

import java.util.ArrayList;

public class RemovingElementsFromCollection {

	public static void main(String [] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Kyiv");
		cities.add("LA");// removed
		cities.add("LA");
		cities.add("Istanbul");
		cities.add("DC");
		cities.add("New York");
		
		System.out.println(cities);
		
		for(int i = 0; i < cities.size(); i++) {
			if(cities.get(i).equals("LA") || cities.get(i).equals("DC")) {
				cities.remove(i); // objects will shift when you do remove
			}
		}
		System.out.println(cities);
	}
}
