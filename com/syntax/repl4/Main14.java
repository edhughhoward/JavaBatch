package com.syntax.repl4;

public class Main14 {
public static void main(String[] args) {
	
	Animal[] animals = {new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten4("kitten3")};
	
	for(Animal a:animals) {
		a.eat();
		a.sleep();
	}
}
}
