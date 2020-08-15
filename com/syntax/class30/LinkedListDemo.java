package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> food = new LinkedList<>();
		food.add("Besh");
		food.add("pizza");
		food.add("biry");
		food.add("Tacos");

		String myFood = food.get(2);
		System.out.println(myFood);

		LinkedList<String> dessert = new LinkedList<>();
		dessert.add("cake");
		dessert.add("ice cream");
		dessert.add("cookie");

		food.addAll(dessert);
		System.out.println(food);

		food.remove("pizza");
		System.out.println(food);

		food.set(3, "brownie");
		System.out.println(food);

		Iterator<String> foodIterator = food.iterator();
		while (foodIterator.hasNext()) {
			String fooood = foodIterator.next();
			System.out.print(fooood + " ");
			if (fooood.equals("cookie") || fooood.equals("brownie")) {
			foodIterator.remove();
			}

		}
		System.out.println(food);
		
		// LinkedList with country type of objects
		
		LinkedList<Country> countries = new LinkedList<>();
		countries.add(new USA("USA"));
		countries.add(new Kazakhstan("Kazakhstan"));
		countries.add(new Afghanistan("Afghanistan"));
		
		System.out.println("size of list is " + countries.size());
		
		for(Country c : countries) {
			c.election();
		}
		
		List<String> webelements = new LinkedList<>();
		

	}
}
