
package com.exception;

public class TryWithMultiCatchFInally {
	/**
	 * in this class sir ask many cross question ok
	 */
	public static void main(String[] args) {
		int a=10;
		String s = "abc";
		try {
			System.out.println(a/5);
			System.out.println(s.length());
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			//System.exit(0);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			// System.exit(0);
		}
	
	}
}
