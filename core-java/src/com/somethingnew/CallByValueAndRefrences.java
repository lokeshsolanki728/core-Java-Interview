package com.somethingnew;

class Person {
	String name="lokesh";
	int x;

	Person(String name, int x) {
		this.name = name;
		x = 100;
	}
}

public class CallByValueAndRefrences {
	static void changeName(Person p) {
		p.name = "Alice"; 
	}

	public static void main(String[] args) {
		Person person = new Person("Bob", 10);
		changeName(person);
		System.out.println(person.name+" "+person.x);
	}
}
