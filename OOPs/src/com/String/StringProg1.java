package com.String;

public class StringProg1 {

	public static void main(String[] args) {
		
		String s="my name is khan";  
		
		String c[]=s.split(" ");
		
		for(int i=0;i<c.length;i++)
		{
			String s1="";
			String t=c[0];  
			
			for(int j=1;j<c.length;j++)  
			{
				c[j-1]=c[j]; 
				s1=s1+" "+c[j-1];
				
				
			}
			c[c.length-1]=t; //assigning value to last index
			s1=s1+" "+c[c.length-1];
			System.out.println(s1);
			
			
		}
		
	}
	
}
