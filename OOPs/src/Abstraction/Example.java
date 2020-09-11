package Abstraction;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.coll.Set.Student;

public class Example {
	
	public static void main(String[] args) {
		
		String s1="    ab bc cd de     ";
		
		 String trim = s1.trim();
		 String[] sry = trim.split(" ");
		 
		 
		 System.out.println(s1.trim().split(" ").hashCode());
		 
		
		
		java.util.List list = new ArrayList();
		
		list.add(40);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(40);
		list.add("String");
		
		System.out.println(list);
		
//		for(int j=0;j<list.size();j++)
//		{
//			
//			for(int i=j+1; i<list.size();i++)
//				
//		   {
//			  if(list.get(j).equals(list.get(i)))
//			  {
//				  
//				list.get(i));
//				System.out.println(list.remove(list.get(i)));
//				//System.out.println(list.remove(40));
//				//System.out.println(list.get(i));
//				//list.remove(i);
//				
//			//	Integer elmt = list.get(i);
//				
//				
//			  }
//			
//			
//		 }
//		
//		}
//		System.out.println(list);
		
		System.out.println(list);
		
		for (Object abc : list) {
		
			System.out.println(abc);
		}
		
		
		Set set = new HashSet<>(list);
		
		
		
		
		System.out.println(set);
	}

}
