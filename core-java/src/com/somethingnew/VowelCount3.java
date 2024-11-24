package com.somethingnew;

public class VowelCount3 {
	public static void main(String[] args) {
		String str = "introduction";
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

		for (char ch : str.toCharArray()) {
			switch (ch) {
			case 'a':
				aCount++;
				break;
			case 'e':
				eCount++;
				break;
			case 'i':
				iCount++;
				break;

			case 'o':
				oCount++;
				break;
			case 'u':
				uCount++;
				break;
			}
		}
		System.out.println("a = " +aCount);
		System.out.println("e = " +eCount);
		System.out.println("i = " +iCount);
		System.out.println("o = " +oCount);
		System.out.println("u = " +uCount);
	}
}
