package com.syntax.repl5;

public abstract class Tea {

	String teaType;

	Tea(String teaType) {
		this.teaType = teaType;
	}

	abstract void addSugar();

}

class LemonTea extends Tea {
	int spoons;

	LemonTea(String teaType, int spoons) {
		super(teaType);
		this.spoons = spoons;
	}

	void addSugar() {
		System.out.println("For " + teaType + " we need " + spoons + " spoons of sugar");
	}
}

class ChaiTea extends Tea {
	int spoons;

	ChaiTea(String teaType, int spoons) {
		super(teaType);
		this.spoons = spoons;
	}

	void addSugar() {
		System.out.println("For " + teaType + " we need " + spoons + " spoons of sugar");
	}
}
