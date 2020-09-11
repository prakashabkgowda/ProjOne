package Comparator;

import java.util.Comparator;

public class MyName implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.name.compareTo(s2.name)==0)
		{
			return 0;
		}
		else if(s1.name.compareTo(s2.name)>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	

}
