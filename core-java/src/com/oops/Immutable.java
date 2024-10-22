package com.oops;

public final class Immutable {
	private final int no;

	public Immutable(int no) {
		this.no = no;
	}
	 
	public int getNo() {
		return no;
	}
	
	public static void main(String[] args) {
		Immutable i = new Immutable(100);
		System.out.println(i.getNo());
	}
}