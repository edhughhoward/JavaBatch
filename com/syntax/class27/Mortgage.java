package com.syntax.class27;

public abstract class Mortgage{
	public abstract void giveMortgage();
}
interface Investments{
	void doInvestments();
	
}
public interface Mortgage {

	void trust();
}
interface Bank extends Mortgage {
	void deposit();
	void withdrawl();
}
class PNC extends Mortgage implements Bank{
	public void deposit(){
		System.out.println("PNC Bank takes deposit");
	}
	public void withdrawl() {
		System.out.println("PNC Bank makes withdrawl");
	}
	public void trust() {
		System.out.println("You can trust PNC Bank");
	}
	public void giveMortage() {
		System.out.println("PNC Can provide a mortgage");
	}
	
} 
