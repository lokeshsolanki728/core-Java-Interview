package com.exception;

class Parent {

	// defining the method
	void msg() {
		System.out.println("parent method");
	}
}

public class MethodOverridingInException extends Parent {

	// overriding the method in child class
	// gives compile time error
	void msg() { // throws IOException 
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent p = new MethodOverridingInException();
		p.msg();
	}
}