package com.string;

public class Okk {
public static void main(String[] args) {
	String [] arr = {"abcdeg","0298647","A9B2Z69EK2"};
	String id="";
	String id2="";
	for(String s:arr) {
		for (int i = 0; i < s.length(); i++) {
			if(id.length()<12) {
				id+=s.charAt(i);
			}
		}
		
		for (int i = s.length()-1; i >=0 ; i--) {
			if(id2.length()<12) {
				id2+=s.charAt(i);
			}
		}
	}
	System.out.println(id);
	System.out.println(id2);
}
}
