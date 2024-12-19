package com.preactice;

import java.util.Arrays;
import java.util.List;

public class Okk {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 4, 54, 87, 9);
		l.stream().distinct().forEach(c -> {
			if (c % 2 == 0) {
				System.out.println("even = " + c);
			} else {
				System.out.println("odd = " + c);
			}
		});
	}
}
