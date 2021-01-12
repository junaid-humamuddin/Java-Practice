package com.cf.example.CollectionsPractice;

import java.util.*;

public class TreesetUsingComparable {

	public static void main(String[] args) {
		Employee emp1 = new Employee(2, "a");
		Employee emp2 = new Employee(3, "n");
		Employee emp3 = new Employee(1, "v");
		Employee emp4 = new Employee(7, "b");
		
		TreeSet<Employee> emp=new TreeSet<Employee>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext()) {
			Employee ee=itr.next();
			System.out.println(ee.id+" "+ee.name);
		}
	}

}

class Employee /*implements Comparable<Employee>*/ {
	int id;
	String name;

	public Employee(int id, String name) {
		this.name = name;
		this.id = id;
	}

	/*public int compareTo(Employee e) {
		if (id > e.id) {
			return 1;
		} else if (id < e.id) {
			return -1;
		} else {
			return 0;
		}*/

	}
//}