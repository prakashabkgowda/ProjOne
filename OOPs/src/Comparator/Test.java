package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("rohith", 3));
		list.add(new Student("arbind", 1));
		list.add(new Student("sumithra", 2));
		list.add(new Student("sobhana", 4));
		list.add(new Student("mukesh", 5));
		
		
		System.out.println(list);
		
		Collections.sort(list, new MyId());
		
		System.out.println(list);
		
		Collections.sort(list,new MyName());
		System.out.println(list);
		
		
	}
}
