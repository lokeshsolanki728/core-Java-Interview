package com.exception;

public class CheckedExceptionn {
	/**
	 * in this class sir ask if we dont use try catch so what heppen 
	 * you jast say, we throws the Exception on main method
	 */
	public static void main(String[] args)  {
		
		try {
		dad();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

	public static void dad() throws Exception {
		mom();
	}

	public static void mom() throws Exception {
		son();
	}

	public static void son() throws Exception {
		throw new Exception("dad i am sorray");
	}
}