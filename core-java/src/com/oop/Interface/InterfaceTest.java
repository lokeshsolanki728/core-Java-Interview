package com.oop.Interface;

public class InterfaceTest implements Interfacee,Interface2{

	@Override
	public int sum(int a, int b) {
		return a + b;
	}
	
	@Override
	public int sum(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {

		Interfacee b = new InterfaceTest();
		System.out.println(b.sum(10, 20));
		//System.out.println(b.sum(11, 22, 33));
		System.out.println(b.a);
		Interface2 bb = new InterfaceTest();
		System.out.println(bb.sum(1, 2, 4));
		
	}
}