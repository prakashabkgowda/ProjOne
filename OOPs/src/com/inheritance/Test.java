package com.inheritance;

 class Test {
	
	public static void main(String[] args) {
		
		
	   // C1	obj=new C1(5);
	     
	     
	  //C2 obj1 = new C2(7, 9);
		
		
		
		/*C3 obj = new C3(10,20,30);
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		
		
		C2 obj1=obj;
		System.out.println(obj1);
		System.out.println(obj);
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);
	//	System.out.println(obj1.z);
		
		//C1 obj2=obj1;
		C1 obj2= obj;
		System.out.println(obj2.x);
		//System.out.println(obj2.y);
		//System.out.println(obj2.z);
		*/
		
		
		C3 obj = new C3(10, 20,30);
		
		obj.test();
		
		C2 obj1=obj;
		
		obj1.test();
		
	    C1 obj2=obj;
		//C1 obj2=obj1;
	    
	    obj2.test();
		
		
		
		
		
	}

}
