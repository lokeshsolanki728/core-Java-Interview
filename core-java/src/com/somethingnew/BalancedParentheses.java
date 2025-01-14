package com.somethingnew;

public class BalancedParentheses {

	public static void main(String[] args) {
		String s ="[([])]";
		String ss="";
		for (int i = s.length()-1; i >= s.length()/2; i--) {
			ss+=s.charAt(i);
		}
		
		System.out.println(ss);
	}

}
