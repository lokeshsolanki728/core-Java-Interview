package com.oop.abstractt;

public abstract class Vahical {
	int speed;
	String brand;

	public Vahical(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	abstract void strat();

	public void getInfo() {
		System.out.println("car speed is " + speed);
		System.out.println("car brand is " + brand);
	}
}