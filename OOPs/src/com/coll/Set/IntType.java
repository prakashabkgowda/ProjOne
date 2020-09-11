package com.coll.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class IntType {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		//System.out.println(set.size());
		System.out.println(set.add(40));
		set.add(20);
		set.add(10);
		set.add(50);
		set.add(30);
		set.add(null);
		/*System.out.println(set.size());
		System.out.println(set.add(10));*/
		
		System.out.println(set);
		
		/*ArrayList list = new ArrayList(set);
		    Collections.sort(list);
		    System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);*/
		
		
		
	}

}
