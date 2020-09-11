package Comparator;

import java.util.Comparator;

public class MyId implements Comparator{

	@Override
	public int compare(Object obj, Object obj1) {
		
		Student s1=(Student)obj;
		Student s2=(Student)obj1;
		
		//return s1.id-s2.id;
		
		if(s1.id==s2.id)
		{
			return 0;
		}
		else if(s1.id>s2.id)
		{
			return 1;
			
		}
		else
		{
			return -1;
		}
		
	}


	
		

	
	
	
	
	

}
