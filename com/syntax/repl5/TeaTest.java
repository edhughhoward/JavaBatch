package com.syntax.repl5;

public class TeaTest {
	public static void main(String[] args) {
		Tea obj1 = new LemonTea("Lemon Tea", 2);
		obj1.addSugar();

		Tea obj2 = new ChaiTea("Chai Tea", 1);
		obj2.addSugar();

	}
}
