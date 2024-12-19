package com.somethingnew;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighInList {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 3, 5, 6, 3, 2, 7);
		l = l.stream().sorted(Collections.reverseOrder()).limit(1).collect(Collectors.toList());
		System.out.println(l);
	}
}
