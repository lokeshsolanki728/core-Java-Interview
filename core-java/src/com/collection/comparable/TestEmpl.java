package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmpl {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(new Employee(2, "lokesh"));
		l.add(new Employee(4, "Nikhil"));
		l.add(new Employee(3, "Deepak"));
		l.add(new Employee(1, "AMit"));
		
		Collections.sort(l);

		System.out.println(l);
	}
}
