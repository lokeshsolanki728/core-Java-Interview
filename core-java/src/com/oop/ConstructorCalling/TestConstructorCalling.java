package com.oop.ConstructorCalling;

public class TestConstructorCalling extends ConstructorCalling {

	public TestConstructorCalling(String fName, String lName, String Address) {
		super(fName, lName, Address);
	}

	public static void main(String[] args) {
		TestConstructorCalling t = new TestConstructorCalling("kapil", "dudhe", "khargone");
	}

}