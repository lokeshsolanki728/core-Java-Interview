package com.somethingnew;

public class WordWithNoVowel {
	public static void main(String[] args) {
		String str[] = { "she", "cry", "he", "dry" };
		for (String str1 : str) {
			boolean flag = true;
			for (int i = 0; i < str1.length(); i++) {
				if ("aeiou".indexOf(str1.charAt(i)) == 1) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println(str1);
			}
		}
	}
}
