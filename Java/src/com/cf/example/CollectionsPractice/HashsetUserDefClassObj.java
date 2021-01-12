package com.cf.example.CollectionsPractice;

import java.util.HashMap;
import java.util.Map;

class Empl{
	int id;
	String name;
	String role;
	public Empl(int id, String name,String role) {
		this.id=id;
		this.name=name;
		this.role=role;
	}
}

public class HashsetUserDefClassObj {

	public static void main(String[] args) {
		Empl e1=new Empl(01,"A","Engineer");
		Empl e2=new Empl(02,"B","Doctor");
		Empl e3=new Empl(01,"C","Scientist");
		HashMap<Integer,Empl>e=new HashMap<Integer,Empl>();
		e.put(1, e1);
		e.put(2, e2);
		e.put(3, e3);
		for(Map.Entry<Integer, Empl> entry:e.entrySet()){   
			//System.out.println(entry.getValue().id+entry.getValue().name+entry.getValue().role);
			Empl ee=entry.getValue();
			int key=entry.getKey();
			System.out.println(key+" Details:");
			System.out.println(ee.id+" "+ee.name+" "+ee.role);
		}
	}

}
