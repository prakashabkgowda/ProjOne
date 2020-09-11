package com.coll.TreeSet;

import java.util.TreeSet;

import com.collection.MyComp;

public class Test {
	
	public static void main(String[] args) {
		
		
		/*TreeSet<Student> set = new TreeSet<Student>();
		System.out.println(set);
		
		set.add(new Student("abc", 1));
		set.add(new Student("xyz", 3));
		set.add(new Student("nmo", 5));
		set.add(new Student("efg", 2));
		set.add(new Student("ijk", 4));
		set.add(new Student("ijk", 4));
		set.add(new Student("manju", 1));
		set.add(new Student("xyz", 6));
		System.out.println(set);*/
		
		TreeSet<Student1> set1 = new TreeSet<Student1>(new MyId());
		System.out.println(set1);
		set1.add(new Student1("abc", 1));
		set1.add(new Student1("xyz", 3));
		set1.add(new Student1("nmo", 5));
		set1.add(new Student1("efg", 2));
		set1.add(new Student1("ijk", 4));
		set1.add(new Student1("ijk", 4));
		set1.add(new Student1("manju", 1));
		set1.add(new Student1("xyz", 6));
		System.out.println(set1);
	}

}
