	package com.collection;

	import com.collection.Student;

	public class Student {
		
		
		String name;	 static int c=0;  int id; int age;
		
		
		{
			c++;
		}
		
		
		
		
public Student(String name,int age) {
			
			this.id=c;
			this.age=age;
			this.name=name;		
		}
		
		public String toString()
		{
			return this.name+" "+this.id+" "+this.age;
		}
    


		
	}

	

