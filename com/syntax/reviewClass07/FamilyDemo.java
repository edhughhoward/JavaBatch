package com.syntax.reviewClass07;

public class FamilyDemo {
public static void main(String[] args) {
		SmithMember.lastName = "Smith";
		SmithMember member1 = new SmithMember();
		
		member1.firstName = "Adam";
		member1.age = 45;
		member1.printInfo();
		
		SmithMember member2 = new SmithMember();
		member2.firstName = "Mary";
		member2.age = 42;
		member2.printInfo();

		member1.printInfo();
		member2.printInfo();
		
		SmithMember baby = new SmithMember();
		baby.firstName = "Ali";
		baby.age = 1;
		baby.printInfo();
	}
}
