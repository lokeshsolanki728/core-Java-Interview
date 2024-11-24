package com.somethingnew;

public class FindReapeatingChar {
	public static void main(String[] args) {
		String str = "lokkeesh";
		int aa = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			aa++;
			for (int j = aa; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					System.out.println(str.charAt(j));
				}
			}
		}
	}
}
