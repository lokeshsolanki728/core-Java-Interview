
package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class CollectionMethod {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		Collection c1 = new ArrayList();
		
		c1.add(55);
		c1.add(10);
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);

		
		  System.out.println(c.add(50)); System.out.println(c);
		  System.out.println(c.addAll(c1)); System.out.println(c);
		  System.out.println(c.size()); System.out.println(c.contains(10));
		  System.out.println(c.containsAll(c1) ); System.out.println(c.isEmpty());
		  System.out.println(c.remove(10)); System.out.println(c);
		 System.out.println(c.removeAll(c)); c.clear();
		 
		System.out.println(c);
	}
}
