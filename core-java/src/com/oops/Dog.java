
package com.oops;

/**
 * @author lokesh solanki
 * this is example of method overriding 
 */
public class Dog extends Animal {

	public void sound() {
		System.out.println("this is dog");
	}

	public static void main(String[] args) {
		Animal b = new Dog();
		b.sound();

	}
}