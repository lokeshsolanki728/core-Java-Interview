package com.somethingnew;

public class RemoveReapeting {
	public static void main(String[] args) {
		String str = "lokkeeeshh";
		String result = "";
		String resultt = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (result.indexOf(ch) == -1) {
				result += ch;
			} else {

				if (resultt.indexOf(ch) == -1) {
					resultt += ch;
				}
			}
		}
		System.out.println("Unique = "+result);
		System.out.println("Reapeting = "+resultt);
	}
}
