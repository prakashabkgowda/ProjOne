package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExc implements Cloneable {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CheckedExc obj = new CheckedExc();
		
		CheckedExc obj2=(CheckedExc)obj.clone();
		
		//new FileInputStream("abc.doc");  //FileNotFound
		
		
		// new FileWriter("abc.doc");  //IOException
	}

}
