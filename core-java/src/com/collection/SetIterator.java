
package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetIterator {

	public static void main(String[] args) {
		TreeSet s = new TreeSet();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(500);
		s.add(600);

		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
