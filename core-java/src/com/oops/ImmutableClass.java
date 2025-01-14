package com.oops;

public final class ImmutableClass {
	private static int id;
	private static String name;

	public ImmutableClass(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
