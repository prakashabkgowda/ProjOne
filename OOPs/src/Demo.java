

public class Demo  {
	
	

	public static void main(String[] args) {
		
		
		
		
		
		Father obj1=new Father("gowda", 25);
		
		  System.out.println(obj1.getAge());
		  System.out.println(obj1.getName());
		  
		 Son obj2 = new Son("surya", 20, "xyz");
		  
		 System.out.println(obj2.getAge());  
		
		/*Demo obj1 = new Demo();
		System.out.println(obj1);
		obj1.test();
		
		Demo obj2 = new Demo();
		System.out.println(obj2);
		obj2.test();*/
		 
		  		
	}
	
	public void test()
	{
		System.out.println(this);
	}
	
	

}
