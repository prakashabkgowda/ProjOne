package com.collection;

import java.util.Comparator;

public class MyComp1 implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
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
