package com.String;

public class String3 {
	
	public static void main(String[] args) {
		
		
		//check if the given string is palindrome or not
		String s1="dada";
		char c[]=s1.toCharArray();
		char c1[]=new char[s1.length()];
		
		for(int j=0, i=s1.length()-1;i>=0;i--,j++)
		{
			c1[j]=c[i];
		}
		
		String s2=new String(c1);
		System.out.println(s1);
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("paly");
		}
		else
		{
			System.out.println("not paly");
		}
	}

}
