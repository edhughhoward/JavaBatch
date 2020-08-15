package com.syntax.class26;

abstract public class File {
	/*
	 * Create a class File that will have the following behaviors: 
	 * open, edit,close. Edit and close are implemented method while open is an abstract.
	 * 
	 * Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
	 * implementation of open behavior: Example: to open .java file we need
	 * notepad++ or sublime text, to open .doc file we need Microsoft word to be
	 * installed etc
	 */
	
	public String open, edit, close;
	
	public void edit() {
		System.out.println("EDIT");
	}
	public void close() {
		System.out.println("CLOSE");
	}
	abstract void open();
	
	}
class JavaFile extends File{
	public void open() {
		System.out.println("You need note pad");
	}
}
class WordFile extends File{
	public void open() {
		System.out.println("You need word to be installed");
	}
}
class PdfFile extends File{
	public void open() {
		System.out.println("You need adobe installed");
	}
}