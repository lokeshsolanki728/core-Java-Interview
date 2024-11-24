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
//	public void add(int a, long b) {
//		System.out.println(a + b);
//		System.out.println("int long");
//	}

	public void add(byte a, short b) {
		System.out.println(a + b);
		System.out.println("byte short");
	}
	public void add(int a, long b) {
		System.out.println(a + b);
		System.out.println("int long");
	}


	public static void main(String[] args) {
		TypePramotion t = new TypePramotion();
		t.add(14, 4);

	}

}
