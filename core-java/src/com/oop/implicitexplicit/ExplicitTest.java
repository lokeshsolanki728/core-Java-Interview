package com.oop.implicitexplicit;

public class ExplicitTest extends Explicit {

	public ExplicitTest(String name) {
		super(name);//unresoled compilation err
	}

	public static void main(String[] args) {
		ExplicitTest e = new ExplicitTest("kapil");
	}

}