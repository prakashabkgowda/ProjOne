package com.String;

public class StringBuf {
	
	public static void main(String[] args) {
		
		String s="abcde";
		
	      StringBuffer s1 = new StringBuffer(s);  //16+5
	      System.out.println(s1.capacity());
	      System.out.println(s1);
	      System.out.println(s1.capacity());
	      System.out.println(s1.append("xyz"));
	      System.out.println(s1);
	      System.out.println(s1.reverse());
	      System.out.println(s1);
	      System.out.println(s1.capacity());
	      System.out.println(s1.append("xyzablasfdnhfl;lafkjabd"));
	      System.out.println(s1.capacity());  //(21*2)+2 =44
	}

}

//String s=" my name is khan ";   //o/p mynameiskhan

// String s1="AbCdEf" // convert upper to lower and lower to upper