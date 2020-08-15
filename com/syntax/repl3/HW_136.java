package com.syntax.repl3;

public class HW_136 {
	/*
	 * Please create methods with different access modifiers (one for each access
	 * modifier) and call them properly in main method one by one
	 * 
	 * In each method write the logic accordingly like for private method write the
	 * logic in the println Statement as "This is Private Method" accordingly for
	 * rest of the methods that have different access modifiers should be a total of
	 * 4 outputs, please make sure they are in the same order that is printed below.
	 * 
	 * Expected Output: This is Private Method This is Default Method This is
	 * Protected Method This is Public Method
	 */

	private void example() {
		System.out.println("This is Private Method");

	}

	static void example2() {
		System.out.println("This is Default Method");
	}

	protected void example3() {
		System.out.println("This is Protected Method");
	}

	public void example4() {
		System.out.println("This is Public Method");
	}

	public static void main(String[] args) {
		HW_136 obj = new HW_136();
		obj.example();
		obj.example2();
		obj.example3();
		obj.example4();

	}

}
