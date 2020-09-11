package com.inheritance;

 class C2 extends C1{
	
	//static int y=25; //20
	 int y=25;
	//x=15
	
	public C2(int x, int y)
	{
	 	//super();
		this.x=x;
		this.y=y;
	}
	
	public C2()
	{
		super();
	}
	
	public void test()
	{
		//System.out.println(super.x);
		System.out.println("test method of class C2");
	}



}
