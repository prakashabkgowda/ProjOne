package com.inheritance;

 class C3 extends C2{
	
	//static int z=35;
	 
	int z=35;
        //int x=50; //10
	
	
	 C3(int x, int y, int z)
	{
		//super()
		
		this.x=x;
		this.y=y;
		this.z=z;
	}
	 
	 public C3()
	 {
		 
	 }
	
	public  void test()
	{
		//System.out.println(super.x);
		
		//System.out.println(super.y);
		
		//System.out.println(x);
		
		System.out.println("test method of class C3");
	}

}
