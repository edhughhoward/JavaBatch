package com.syntax.class26;

public abstract class Phone {

	void makeCall() {
		System.out.println("Phone makes call");
	}
	void sendText() {
		System.out.println("Phone can send text");
	}
	abstract void navigate();
	
	abstract void playMusic();
}
class Samsung extends Phone{

	void navigate(){
		System.out.println("Samsung uses google GPS");
	}
	
	void playMusic() {
		System.out.println("Samsung uses google play");
	}
	
}
class iphone extends Phone{
	void navigate(){
		System.out.println("iphone uses apple GPS");
	}
	
	void playMusic() {
		System.out.println("iphone uses apple music");
	}
}