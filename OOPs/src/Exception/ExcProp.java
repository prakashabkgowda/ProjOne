package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcProp {
	
	static void test() throws FileNotFoundException 
	{
		
		System.out.println("testing");
		
		
		//System.out.println(10/0);
	
		new FileInputStream("abc.doc");
		
		
	}
	
	static void test1() throws FileNotFoundException 
	{
		
		test();  //calling stamnt
		
		
		
	}

	 public static void main(String[] args) throws FileNotFoundException 
	 {
		
		
		 test1();
		
		
	}
}
