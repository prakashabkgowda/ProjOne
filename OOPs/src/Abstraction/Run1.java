package Abstraction;

public class Run1 {
	public static void main(String[] args) {
		
	B2 obj = new B2();
	obj.drink();
	obj.test1();
	obj.test2();
	
	B1 obj1=obj;
	obj1.drink();
	obj1.test1();
	obj1.test2();
	
	B obj2=obj1;
	obj2.drink();
	obj2.test1();
	//obj2.test2();
	
	
	}
	
	
	
	
	
	
	

}
