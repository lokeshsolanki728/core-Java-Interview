package com.javabasic;

public class Febonacci {
	public static void main(String[] args) {
		int a =0;
		int b=1;
		int temp=0;
		
		for (int i = 0; i <=10; i++) {
			temp = a + b;
			a=b;
			b=temp;
			System.out.println(temp);
		}
	}
}
