package com.object;

public class Demo  implements Cloneable{
	
  String name="abc";
	int age=25;
	
	
	protected void finalize()
	{
		System.out.println("finalize method called");
	}
		
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		
		Demo obj = new Demo();
		
		Demo obj2=new Demo();
		obj=obj2;
		
		/*System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		
		System.out.println(obj2);
		System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());*/
		
		
		System.out.println(obj.equals(obj2));
		if(obj==obj2)
		{
			System.out.println("trueeeee");
		}
		
		
		System.out.println(obj2);
		
		Demo obj1=(Demo)obj.clone();
		
	
		
		
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj1.age);
		
		
		
		
		
		
		
	}
	
	public String toString()
	{
		return name+" " +age;
	}
	
	public int hashCode()
	{
		return age;
	}
	
	

}
