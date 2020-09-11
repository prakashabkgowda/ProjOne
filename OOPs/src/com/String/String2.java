package com.String;

public class String2 {
	
	public static void main(String[] args) {
		
		
		char c[]= {'x','y','z','k'};
		
		//using assignment operator
		String s1="Abc"; //String pool, can not get duplica
		String s6="abc";
		
		
		/*String s8="xbc";
		String s9="ZBC";
		String s10="oBc";
		
		System.out.println(s1.compareTo(s6));
		System.out.println(s1.compareTo(s8));
		System.out.println(s1.compareTo(s9));
		System.out.println(s1.compareTo(s10));*/
		
		/*System.out.println(s6.toString());
		
		//using new keyword
		String s2=new String(); //heap
		String s3=new String("abcd");
		String S7=new String("abcd");
		
		//convert from arry of char to String by cnstr
		String s4=new String(c);
		String s5=new String(c,1,3);
		
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(S7.toString());*/
		
		//convert from arry of char to String by valueOf method
		String s11=String.valueOf(c);
		String s12=String.valueOf(c, 1, 3);
		System.out.println(s11);
		System.out.println(s12);
		
		//compare the value of obj
		/*if(s1.equals(s6)) //
		{
			System.out.println("true");
		}
		
		//compare the address of obj
		if(s1==s6)
		{
			System.out.println("duplica is not allowed");
		}
		else
		{
			System.out.println("duplica is not allowed");
		}
		*/
		
		//convert String to char array
		
		char c1[]=s1.toCharArray();
		
		for(int i=0;i<c1.length;i++)
		{
			System.out.println(c1[i]);
		}
		
		/*char c2[]=new char[s1.length()];
		
		for(int i=0 ; i<s1.length(); i++)
		{
			c2[i] = s1.charAt(i);
		}
	*/
		
	}

}
