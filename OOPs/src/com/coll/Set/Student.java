package com.coll.Set;

public class Student {
	
	String name;
	int id;
	
	public Student(String name, int id) {
		
		this.id=id;
		
		this.name=name;
		
	}
	
	public String toString()
	{
		return this.name+" "+this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Student s1=(Student)obj;
		
		return (this.id==s1.id || this.name==s1.name);
		
	}
	
	@Override
	public int hashCode() {
		
		return this.id;
	}
	
	
	

}
