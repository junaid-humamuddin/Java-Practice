package com.cf.example.CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int rollno;
	String name;

	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;

	}
}

public class ArraylistUserDefClassObj {

	public static void main(String[] args) {
		Student st1 = new Student("Junaid", 29);
		Student st2 = new Student("Zain", 81);
		ArrayList<Student> s_List = new ArrayList<Student>();
		s_List.add(st1);
		s_List.add(st2);
		
		/* for(Student s:s_List) {
		 System.out.println("Name is "+s.name+", Roll No is "+s.rollno); 
		 }*/
		
		Iterator<Student> itr = s_List.iterator();
		while (itr.hasNext()) {
			Student s =itr.next();
			System.out.println("Name is "+s.name+", Roll No is "+s.rollno);
		}

	}
}
