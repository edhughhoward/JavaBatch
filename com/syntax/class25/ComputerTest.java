package com.syntax.class25;

public class ComputerTest {
public static void main(String[] args) {
	
	
	Computer[] comp = {new Apple("APPLE"), new Lenovo("Lenovo"), new HP("HP"), new Dell("Dell")};
	int size = comp.length;
	System.out.println(size);
	
	for (Computer c : comp) {
		c.powerbutton();
		
	}

}
}
