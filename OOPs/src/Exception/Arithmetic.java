package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Arithmetic extends A{
	
	 int x=10;
	
	public static void main(String[] args) {
		
		
		int a[]= {10,20,30};
		
		String s="abc";
		
		System.out.println("start");
		
	
		//try-catch
		/*try
		{
		System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}*/
		
		
		//try-catch-finally
		/*try
		{
		   System.out.println(a[3]); //AIOOBE
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled AIOOBE");
		}
		
		finally
		{
		
		System.out.println("finally is executing");
		}*/
		
		
		//try with multiple catch
		/*try
		{
		System.out.println(s.charAt(-1));  //SIOOBE
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("ArithmeticException");
		}
         catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		catch(RuntimeException e) 
		{
			System.out.println("RuntimeException");
		}
		
		catch(Throwable e)
		{
		  System.out.println("Throwable");	
		}*/
		
		
		//try-finally
		
	/*try {
			Arithmetic obj = new Arithmetic();
			obj=null;	
		System.out.println(obj.x);
		
		}
		finally
		{
			System.out.println("finally is executing before handling the exception");
			
		}*/
		
		
		
		
		//ClassCastException
		
		/*Arithmetic obj = new Arithmetic();
		 
		 A obj1=obj;
		 Arithmetic obj2=(Arithmetic)obj1;
		 
		     A obj3 = new A();
		     Arithmetic obj4=(Arithmetic)obj3;*/
		     
		
		//main(null);  //StackOverFlowError
		
		try
		{
			
			
			System.out.println("first smnt inside try");
			
			
		   
			
			
			System.out.println(10/0);
		  
		}
		catch(Exception e)
		{
			System.out.println(" Arithmetic");
			try
			{
		     System.out.println(a[3]);
			}
			catch(Exception c)
			{
		     System.out.println("last stmnt inside try");
			}
		}
		
		System.out.println("end");
	}

}
