package com.somethingnew;

public class GCD {
	// Find the GCD (Greatest Common Divisor) of Two Numbers
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		System.out.println("hello");
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		int num1 = 56, num2 = 98;
		System.out.println("GCD is " + gcd(num1, num2));
	}
}
