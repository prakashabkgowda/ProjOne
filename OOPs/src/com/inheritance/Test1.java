package com.inheritance;

public class Test1 {
	
	
	public static void main(String[] args) {
		
	
	C3 obj = new C3(10,20,30); // object creation
	
	//C4 obj = new C4(10,20,30,40); // object creation
	
	System.out.println(obj.x);
	System.out.println(obj.y);
	System.out.println(obj.z);
	
	C1 obj1 = obj;  //upcasting
	
	System.out.println(obj1.x);
	//System.out.println(obj1.y);
	obj1.test();
	//obj1.test1();
	
	
	
	C2  obj2=(C2)obj1;  //down casting
	System.out.println(obj2.x);
	System.out.println(obj2.y);
	//System.out.println(obj2.z);
	
	//C3 obj3=(C3)obj2;
	
	C3 obj3=(C3)obj1;
	
	
	if(obj instanceof C4)
	{
	
	
	     C4 obj4=(C4)obj3;
	   System.out.println(obj4.y);//20
	   
	}
	else
	{
		System.out.println("C4 is not an instance");
	}
	
	
	C2 cc=new C2(60,70);
	
	C1 cc1=cc;
	
	
	
	if(cc instanceof C3)
	{
	
	
		C3 cc2=(C3)cc1;
		System.out.println(cc2.z);
	   
	}
	else
	{
		System.out.println("C3 is not an instance of cc object ref");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
