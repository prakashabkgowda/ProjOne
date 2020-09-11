package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	
	//static Student s1;
	//static Student s2;
	//static Student s3;
	
	public static void main(String[] args) {
		
		
		int a=10;  //30 20
		int b=20;   //10
		System.out.println(a);
		System.out.println(b);
		/*int temp=a;
		a=b;
		b=temp;*/
		
		a=a+b;  //10+20
       b=a-b; //30-20 ==10
       a=a-b;  //30-10 ==20
		
		System.out.println(a);
		System.out.println(b);
		
		
		ArrayList<Student> list2 = new ArrayList<Student>();
		
		
		
		  Student  s1=new Student("aaa", 23);
		   Student  s2=new Student("aab", 24);
		   Student  s3=new Student("aac", 25);
		     list2.add(s1);
		     list2.add(s2);
		     list2.add(s3);
		     System.out.println(list2);
		
		/*Student s1 = new Student("a", 1, 10);
		Student s2 = new Student("a", 1, 10);
		Student s3 = new Student("a", 1, 10);
		list2.add(s1);
		list2.add(s2);
		list2.add(s3);
		System.out.println(list2);
		list2.remove(s1);
		System.out.println(list2);*/
		
		 
		 /*System.out.println(list2);
	     Collections.sort(list2, new MyComp());
	     Collections.sort(list2, new MyComp1());
	     System.out.println(list2);
	     Collections.reverse(list2);
	     System.out.println(list2);*/
	     
	     
	  /*  boolean yes=true;
	     while(yes)
	     {
	    	 
	    	 System.out.println("press 1 for adding students");
		     System.out.println("press 2 for reading elements based on age");
		     System.out.println("press 3 for reading elements based on id");
		     System.out.println("press 4 for reading elements one by one");
		     System.out.println("press 5 for remove elements ");
		    Scanner scan = new Scanner(System.in);
		     int x=scan.nextInt();
		     int y=0;
	    	 switch(x)
	     {
	    	 
	    	 case 1: 
	    		        //  s1 = new Student("abc ",scan.nextInt(), 20);
	    		       //   list2.add(s1);
	    		   Student  s1=new Student("aaa", 23);
	    		   Student  s2=new Student("aab", 24);
	    		   Student  s3=new Student("aac", 25);
	    		     list2.add(s1);
	    		     list2.add(s2);
	    		     list2.add(s3);
	    		     
	    		     
	    		     // list2.add(new Student("abc", 20));
	    	          // list2.add(new Student("xyz", 50));
	    	           //  list2.add(new Student("mon", 10));
	    	            // list2.add(new Student("efg", 40));
	    	             //  list2.add(new Student("ihk",30));
	    	               
	    	               System.out.println("all the elements are added suxccessfully");
	    	               System.out.println("press 1 to continue: 0 to exit"); 
	    		    	     y=scan.nextInt();  break;
	    	 
	     case 2:    Collections.sort(list2, new MyComp()); 
	    	      System.out.println(list2);
	    	     System.out.println("press 1 to continue: 0 to exit"); 
	    	     y=scan.nextInt();break;
	    	      
	     case 3:  Collections.sort(list2, new MyComp1()); 
	      System.out.println(list2); 
	      System.out.println("press 1 to continue: 0 to exit");
	      y=scan.nextInt();break;
	      
	     case 4:            for (Student student : list2) {
	    	                                    System.out.println(student);
			
		                                              }
	                                 System.out.println("press 1 to continue: 0 to exit"); 
	                                    y=scan.nextInt();  break;
	                                    
	      
	     case 5:     System.out.println(list2);
	    	       //  list2.remove(scan.nextInt());
	     			//list2.remove(s1);
	                 System.out.println(list2);
	                   System.out.println("press 1 to continue: 0 to exit"); 
	                      y=scan.nextInt();break;
	    	      
	      
	     }
	    	 if(y==0)
	    	 {
	    		 yes=false;
	    	 }
	     }
		*/
	}
}