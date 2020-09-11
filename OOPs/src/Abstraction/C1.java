package Abstraction;

public class C1 extends C implements I,I1{
	
	
	public void a()
	{
		System.out.println("implementation is done");
	}
	
	public void b()
	{
		//x=49;
		//y=100;
		System.out.println(x);
		System.out.println(y);
		System.out.println(m);
		
	}
	
	void m2()
	{
		System.out.println("m2 method is getting impln in class C1");
	}
	
	public void m3()
	{
		System.out.println("m3 method is getting impln in class C1");
	}
	
	public void test()
	{
		System.out.println("test is getting impln");
	}
	

}
