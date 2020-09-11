
public class C5 {
	 
	 protected int x=23;
	
	
	

}
package com.collection;

import com.collection.Student;

public class Student implements Comparable{

	int id;
	int age;
	
	 public Student(int id,int age) {

    this.age=age;
    this.id=id;
	}
	 public String toString()
	 {
		 return this.id+" "+this.age;
	 }
	@Override
	public int compareTo(Object obj) {
		
		
		
		Student s=(Student)obj;
		
		return this.age-s.age;
		
		
	}
	
	
	

	
	

}


