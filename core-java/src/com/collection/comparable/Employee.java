package com.collection.comparable;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.name = name;
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id > o.getId()) {
			return 1;
		}
		if (this.id < o.getId()) {
			return -1;
		}

		return 0;
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

}
