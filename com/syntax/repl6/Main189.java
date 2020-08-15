package com.syntax.repl6;

import java.util.Iterator;
import java.util.LinkedList;

public class Main189 {
	public static void main(String[] args) {
		LinkedList<Integer> obj = new LinkedList<>();

		for (int i = 50; i <= 100; i++) {
			obj.add(i);
		}
		Iterator<Integer> it = obj.iterator();
		while (it.hasNext()) {
			if (it.next() % 3 != 0) {
				it.remove();
			}
		}
		System.out.println(obj);

	}

}
