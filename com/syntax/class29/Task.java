package com.syntax.class29;

import java.util.ArrayList;

public class Task {
	/*
	 * Create an ArrayList that will store 5 names into it. Find out whether the
	 * given ArrayList is empty or not? Check whether the specific name is present
	 * in an ArrayList or not? Find the size of your arrayList and print all values
	 * from that
	 */
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("ed");
		arrayList.add("Adrian");
		arrayList.add("sorina");
		arrayList.add("John");
		arrayList.add("Ishan");

		boolean arrayListEmpty = arrayList.isEmpty();

		boolean arrayListName = arrayList.contains("ed");

		int arrayListSize = arrayList.size();
		
		String elements = arrayList.get(1);

		System.out.println(arrayListEmpty);
		System.out.println(arrayListName);
		System.out.println(arrayListSize);
		System.out.println(elements);
		System.out.println(arrayList);
		System.out.println("=================");
		
		

	}
}
