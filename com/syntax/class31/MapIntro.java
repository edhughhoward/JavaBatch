package com.syntax.class31;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<>();
		// storing objects inside map as a key and value
		hmap.put(10, "John");
		hmap.put(11, "Jane");
		hmap.put(12, "James");

		System.out.println(hmap);
		/*
		 * System.out.println("====="); hmap.put(12, "Gozde"); hmap.put(13, "Olga");
		 * hmap.put(1, "Olga"); System.out.println(hmap);
		 * 
		 * System.out.println(hmap.size());
		 * 
		 * boolean isEmpty = hmap.isEmpty();
		 * 
		 * System.out.println(isEmpty);
		 * 
		 * boolean keycontain = hmap.containsKey(12); boolean valuecontain =
		 * hmap.containsValue("John");
		 * 
		 * System.out.println(keycontain); System.out.println(valuecontain);
		 * 
		 * String getkey = hmap.get(13); System.out.println(getkey);
		 * System.out.println(hmap); hmap.remove(10);
		 * 
		 * System.out.println(hmap);
		 */
		
	}
}
