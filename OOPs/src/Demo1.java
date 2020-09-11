
public class Demo1 {
	
	public static void main(String[] args) {
		
		Father1 obj1=new Father1("gowda", 25);
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		obj1.smoke();
		 
		  
		 Son1 obj2 = new Son1("surya", 20, "xyz");
		      System.out.println(obj2.age);
			System.out.println(obj2.name);
			System.out.println(obj2.gf);
			obj2.smoke();
			
			obj2.drink();
			
			Gchild obj3 = new Gchild("naveen",30,"bhavya", 001);
		      System.out.println(obj3.age);
			System.out.println(obj3.name);
			System.out.println(obj3.gf);
			System.out.println(obj3.rollno);
			obj3.smoke();
			obj3.drink();
			obj3.playing();
			
			
		
	}
	
	
	
	

}
