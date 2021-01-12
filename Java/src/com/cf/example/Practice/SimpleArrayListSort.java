package com.cf.example.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimpleArrayListSort {

	public static void main(String[] args) {
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(new Employee(2, "Junaid"));
		list1.add(new Employee(3, "Zain"));
		list1.add(new Employee(1, "ManishSir"));

		System.out.println("Sorting by Name using Comparaator");

		Collections.sort(list1, new NameComparator());

		for (Employee e : list1) {
			System.out.println(e.idNo + " " + e.name);
		}
		
	}

}

class Employee {
	int idNo;
	String name;

	Employee(int idNo, String name) {
		this.idNo = idNo;
		this.name = name;

	}
}

class NameComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}
