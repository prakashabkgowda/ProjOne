package com.object;

public class Demo1 {
	
	
	
		
	public static void main(String[] args) {
		
		new Demo1();
		
		
		
		Demo1 obj=new Demo1();
		obj=null;
		
		Demo1 one = new Demo1();
		Demo1 two=new Demo1();
		one=two;
		
		System.gc();
		
	}
	
	protected void finalize()
	{
		System.out.println("finalize method called");
	}

	
}
