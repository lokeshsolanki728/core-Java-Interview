package com.somethingnew;

public class VarArgsMethod {
	public static int sum(int... a) {
		return a[0]+a[1];

	}
	public static void main(String[] args) {
		System.out.println(sum(1,1));
	}
}
