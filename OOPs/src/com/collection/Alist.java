package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Alist {
	
	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		   
		
		System.out.println(list);
		
	    list.add("apple");
	    list.add("collection");
	    list.add("mango");
	    list.add("mango");
	    list.add("mango");
	    list.add(10);
	    list.add(15.5);
	    list.add(null);
	    list.add(4);
	    list.add('A'); //70
	    System.out.println(list);
	    
	    System.out.println(list.remove(1));
	    System.out.println(list);
	  // System.out.println(list.remove(-1));
	    
	    System.out.println(list.remove("mango"));
	    System.out.println(list);
	    System.out.println(list.remove("xyz"));
	    list.add("doll");
	    System.out.println(list);
	  //  System.out.println(list.remove("C"));
	    //System.out.println(list.remove("C"));
	    
	  	    
	   System.out.println(list.remove(4));
	   
	   list.add(4);
	   System.out.println(list);
	   
	   System.out.println(list.remove(4));
	 // System.out.println(list.remove(10));
	  /* System.out.println(list.remove(15.5));
	   System.out.println(list);
	  System.out.println(list.remove('A')); */
	    
	 
	}

}
