package Exception;

public class B1 {
	
	public static void main(String[] args) throws A {
		
		int x=75; //101 75
		
		if(x>100)
		{
			System.out.println("continue execution");
		}
		else
		{
			//throw new A1();
			throw new A();
		}
		
		
		
	}

}
