package com.String;

public class String4 {
	
	public static void main(String[] args) {
		
		String s="abCDebb";
		
		String s1="abcde";   String s3="my name is surya aa";
		String s4=null;
		String s5="";
		
		System.out.println(s.length());
		System.out.println(s3.length());
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.charAt(0));
		try
		{
		System.out.println(s.charAt(5));
		}
		catch(Exception e)
		{
			
		}
		System.out.println(s.isEmpty());
		try
		{
		System.out.println(s4.isEmpty());
		}
		catch(Exception e)
		{
			
		}
		System.out.println(s5.isEmpty());
		
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.compareToIgnoreCase(s1));
		
		System.out.println(s.contains("b"));
	
		System.out.println(s.contains("bc"));
		System.out.println(s.contains("ac"));
		
		System.out.println(s.replace('b', 'm'));
		System.out.println(s3.replace("my", "no"));
		System.out.println();
		
		System.out.println(s.replace("abc", "xyz"));
		System.out.println(s.replace("bC", "xyz"));
		
			System.out.println(s.replace("b", "mm"));
			
		
		System.out.println(s.replace(s, "xyz"));
		
		System.out.println(s3.replaceAll("a", "o"));
		System.out.println(s3.replaceAll("my", "No"));
		
	}

}
