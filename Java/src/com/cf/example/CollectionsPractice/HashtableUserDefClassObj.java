package com.cf.example.CollectionsPractice;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class StudentNew {
	int rollno;
	String name;

	public StudentNew(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}

public class HashtableUserDefClassObj {

	public static void main(String[] args) {
		StudentNew s1 = new StudentNew(1, "A");
		StudentNew s2 = new StudentNew(3, "B");
		StudentNew s3 = new StudentNew(2, "C");
		Hashtable<Integer, StudentNew> table = new Hashtable<Integer, StudentNew>();
		table.put(1, s1);
		table.put(2, s2);
		table.put(3, s3);
		for (Map.Entry<Integer, StudentNew> entry : table.entrySet()) {
			StudentNew s = entry.getValue();
			int key = entry.getKey();
			System.out.println(key + " Details");
			System.out.println(s.name + " " + s.rollno);
		}

	}
}
