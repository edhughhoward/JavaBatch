package com.syntax.repl3;

public class HW_138 {
	/*
	 * In AnotherClass declare a private, default, protected, public methods and
	 * have them each return the name of the what access modifier they are using.
	 * All methods should be accessible by class name
	 * 
	 * Call methods of Another class inside Main class
	 * 
	 * Expected Output: default protected public
	 */

class AnotherClass {

		private void ex1() {
			String a = "Private";
			System.out.println(a);
		}

		void ex2() {
			String a = "Default";
			System.out.println(a);

		}

		protected void ex3() {
			String a = "Protected";
			System.out.println(a);
		}

		public void ex4() {
			String a = "Public";
			System.out.println(a);
		}
	}

}
public class Main {
	public static void main(String[] args) {
	
		AnotherClass obj = new AnotherClass();
		
		obj.ex2();
		obj.ex3();
		obj.ex4();
		obj.ex1();
	}
}
