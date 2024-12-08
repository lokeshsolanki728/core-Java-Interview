package com.string;

import java.util.Arrays;

public class ExtractNumberAndChar {
	
	public static void main(String[] args) {
		String s = "9BCD2N3258G09L";
		String ss = "";
		String sss = "";
		for (int i = 0; i < s.length(); i++) {
			char chh = s.charAt(i);
			if (Character.isDigit(chh)) {
				ss += chh;
			} else {
				sss += chh;
			}
		}
		char[] ch = ss.toCharArray();
		char[] chhh = sss.toCharArray();
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(chhh));

	}
}
