package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Alist1 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		System.out.println(list);
	    
	    list.add("mango");
	    list.add(10);
	    list.add(30);
	    list.add(20);
	    list.add(15.5);
	    list.add(null);
	    list.add(null);
	    list.add(4);
	    list.add('A');
	    list.add(false);
	    
	    System.out.println(list);
	    
	/*  ArrayList list1 = new ArrayList(list);
	   System.out.println(list1);
	   list1.addAll(list);
	   System.out.println(list1);
	   list1.addAll(list);
	   System.out.println(list1);
	   
	   System.out.println(list.size());
	   for(int i=0;i<list.size();i++)
	   {
		   if(list.get(i) instanceof Integer)
		   {
			   Integer j=(Integer)list.get(i);
		     // System.out.println(list.get(i));
			   System.out.println(j);
		  }
	   }
	   */
	   /*for (Object object : list) {
		   
		   System.out.println(object);
		
	}
	   */
	   
	 Iterator ir = list.iterator(); //reading all elemnts from list
	 
	 while(ir.hasNext()) //check if the next element is there or not
	 {
		 System.out.println(ir.next()); //get element
	 }
	 
	   
	}

}
