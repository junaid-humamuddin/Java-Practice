package com.cf.example.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Emp implements Comparable<Emp> {
	int id;
	String name, designation;

	public Emp(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;

	}

	public int compareTo(Emp e) {
		if (id == e.id)
			return 0;
		else if (id > e.id)
			return 1;
		else
			return -1;
	}
}

public class ComparableExample {

	public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp(101,"Junaid","Trainee1"));
		list.add(new Emp(122,"Zain","Trainee2"));
		list.add(new Emp(103,"jz","Trainee4"));
		list.add(new Emp(106,"ff","Trainee3"));
		Collections.sort(list);
		Iterator<Emp> itr=list.iterator();
		while(itr.hasNext()) {
			Emp e=itr.next();
			System.out.println(e.id+" "+e.name+" "+e.designation);
		}
	}

}
