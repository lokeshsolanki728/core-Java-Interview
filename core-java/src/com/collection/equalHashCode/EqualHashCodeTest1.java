package com.collection.equalHashCode;

import java.util.*;

public class EqualHashCodeTest1 {
	public static void main(String[] args) {
		EqualHashCode e = new EqualHashCode(100, "lokesh", 500);
		EqualHashCode e1 = new EqualHashCode(100, "lokesh", 500);
		EqualHashCode e2 = new EqualHashCode(2, "lokesh", 100);

		List l = new ArrayList();
		l.add(e1);
		System.out.println(l);

		l.add(e1);
		System.out.println(l);

		System.out.println("setttttttttt");
		Set s = new HashSet();
		s.add(e);
		System.out.println(s);
		
		s.add(e1);
		System.out.println(s);
		//s.remove(e);
		s.add(e2);
		System.out.println(s);

		System.out.println("mapppppppp");
		Map m = new HashMap();

		m.put(1, e);
		m.put(2, e1);
		m.put(3, e2);
		System.out.println(m + "hhhh");

		m.remove(2);
		System.out.println(m);
	}
}