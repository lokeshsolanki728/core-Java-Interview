package com.oop;

public class ConstructorCallingg {
	public String fName;
	public String lName;
	public String address;

	public ConstructorCallingg(String fname, String lname) {
		this.fName = fname;
		this.lName = lname;
		System.out.println(fName);
		System.out.println(lName);
	}
	public ConstructorCallingg(String fname, String lname,String addresss) {
		this(fname,lname);
		this.address = addresss;
		System.out.println(address);
	}
}
