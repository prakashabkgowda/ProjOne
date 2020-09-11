package com.coll.TreeSet;

public class Student implements Comparable<Student>{
	
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
	public int compareTo(Student s) {
		
		//return this.id-s.id;
		return this.name.compareTo(s.name);
	}

}
