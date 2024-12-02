package com.somethingnew;

public class TypePramotion {
	public void add(long a, long b) {
		System.out.println(a + b);
		System.out.println("long long");
	}

	public void add(double a, long b) {
		System.out.println(a + b);
		System.out.println("double long");
	}
	public void add(double a, int b) {
		System.out.println(a + b);
		System.out.println("double int");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
		System.out.println("int int");
	}

	public void add(byte a, short b) {
		System.out.println(a + b);
		System.out.println("byte short");
	}

	public void add(long a, int b) {
		System.out.println(a + b);
		System.out.println("long int");
	}
	public void add(float a, int b) {
		System.out.println(a + b);
		System.out.println("float int");
	}

	public static void main(String[] args) {
		TypePramotion t = new TypePramotion();
		t.add(14, 4);

	}

}
