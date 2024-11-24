package com.string;

public class NotContain {
	/**
	 * @param args
	 * this programe print a to z but not given string
	 * here are 2 types you can use any of them
	 */
	public static void main(String[] args) {
		
//		String str = "lokesh";
//		for (char  chh = 'a'; chh < 'z'; chh++) {
//			if(chh=='l'||chh=='o'||chh=='k'||chh=='e'||chh=='s'||chh=='h') {
//				continue;
//			}
//			System.out.println(chh);
//		}

		String str = "lokesh";
		for (char i = 'a'; i <= 'z'; i++) {
			if(str.indexOf(i)==-1) {
				System.out.println(i);
			}
		}
	}
}
