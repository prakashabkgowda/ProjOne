package com.String;

import java.util.Arrays;

public class StringProg {
	
	public static void main(String[] args) {
		
		//remove space
		
	/*	String s="my name is prakash";
		
		String s1[]=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			s2=s2+s1[i];
		}
		System.out.println(s2);
		//s.replaceAll(" ", "");
		//s.replaceAll("\\s","");
*/		
		
		
		//rotate string
		
		/*String s="abcde";
		char c[]=s.toCharArray();  //c[0]=a
		
		for(int i=0;i<c.length;i++)
		{
			
			char t=c[0];  //a b c
			for(int j=1;j<c.length;j++)  //b
			{
				c[j-1]=c[j]; //c[0]=c[1];
				
				
			}
			c[c.length-1]=t; //assigning value to last index
			
			System.out.println(String.valueOf(c));
		}*/
	
		//sorting char array 
		/*String s="aMMa";   // String s3 = "mama"; 
		String s1=s.toLowerCase(); //s1=amma
		char c[]=s1.toCharArray();
		Arrays.sort(c);
		System.out.println(String.valueOf(c));  // aamm  aamm
		*/
		//anagra
		
		//uppercase and lowercase
		/*String s="AbBc";
		char c[]=s.toCharArray();
		for(int i=0; i<c.length;i++)
		{
			if(c[i]>='A' && c[i]<='Z') //65 >=65 && 65<=91 B 66 C 67 Z 91   a=97 b=98....
			{
				c[i]=(char)(c[i]+32);
			}
			else
			{
				c[i]=(char)(c[i]-32);  //97-32 =65
			}
		}
		System.out.println(String.valueOf(c));*/
		
		//separate char num spechar in given string
	}

}
