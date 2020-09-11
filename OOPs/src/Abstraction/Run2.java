package Abstraction;

public class Run2 {
	
	public static void main(String[] args) {
		
		C1 obj = new C1(); //all  101
		
		
		System.out.println(obj.m);
		obj.a();
		
		
		I obj1=obj; //x,y, a(), test()  101
		System.out.println(obj1.x); 
		obj1.test();
		I.test1();  // only through the interface name
		
		C obj2=(C)obj1; //m m1 m2   101
		obj2.test3();  // through the class name or obj_ref
		
		//I1 obj3=obj;
		//I1 obj3=(I1)obj1;
		//I1 obj3= (I1)obj2;
		
		
		
		
		
		//obj2.m2();
		
		//C1 obj2=(C1)obj1; //101
		
		//I1 obj3=obj2;  //101
		
		//System.out.println(obj3.z);
		
		
	}

}
