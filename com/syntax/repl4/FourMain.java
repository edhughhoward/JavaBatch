package com.syntax.repl4;

public class FourMain {

	public static void main (String [] args) {
	Employee obj1 = new Employee("Joe", "Smith", 35, 35000);
	obj1.detailsEmp();
	
	Student obj2 = new Student("Adam", "Smith", 15, 10);
	obj2.detailsStu();
	
	Retiree obj3 = new Retiree("Frank", "Smith", 15,"tour");
	obj3.detailsRet();
	}
}
