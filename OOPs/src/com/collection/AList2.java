package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class AList2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();  //generic arraylist
		
		System.out.println(list);
		list.add("abc");
		list.add("xyz");
		list.add("mno");
		list.add("ijk");
		list.add("pqr");
		//list.add(10, 10);
		//list.add(null);
		//list.add(e)
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		/*ArrayList list1 = new ArrayList(); 
		Student s1 = new Student(3,25);
		Student s2 = new Student(1,15);
		Student s3 = new Student(2,20);
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(10);
		list1.add(20);
		System.out.println(s1);
		System.out.println(list1);*/
		
		ArrayList<Student> list2 = new ArrayList<Student>(); 
		 list2.add(new Student("abc",3,25));
		 list2.add(new Student("xyz",1,15));
		 list2.add(new Student("mno",5,10));
		 list2.add(new Student("pqr",4,20));
		 
		 System.out.println(list2);
		 
	    Collections.sort(list2);
	    
	    System.out.println(list2);
	    Collections.reverse(list2);
	     
	     System.out.println(list2);
	    
		 
		
		
		
	}

}
