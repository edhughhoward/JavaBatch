package com.syntax.class18;

public class Cat {
	
// instance variables
	
String name, color;
int age;

// static variables (common for all objects)

static int paws = 4;
static boolean mustache = true;
static boolean tail = true;

	void displayCat() {
		System.out.println("Name of the cat " + name + " and this is a " + color + " and it is" + age);
	}
 void displayCommonFeatures() {
	 System.out.println(name + " has " + paws + " paws and " + " tail = " + tail + " and mustache = " + mustache);
 }
}
