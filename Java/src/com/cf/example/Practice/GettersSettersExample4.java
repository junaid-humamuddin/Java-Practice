package com.cf.example.Practice;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
	
	public Object clone() {
	    Person aClone = new Person(this.name);
	    return aClone;
	}
}

public class GettersSettersExample4 {
	private List<Person> listPeople = new ArrayList<Person>();
	
	public void setListPeople(List<Person> listPeople) {
		// this.listPeople = listPeople;
		for (Person aPerson : listPeople) {
			this.listPeople.add((Person) aPerson.clone());
		}
	}
	public List<Person> getListPeople() {
		// return listPeople;
		List<Person> listReturn = new ArrayList<Person>();
		for (Person aPerson : this.listPeople) {
			listReturn.add((Person) aPerson.clone());
		}

		return listReturn;
	}

	

	public static void main(String[] args) {
		GettersSettersExample4 app = new GettersSettersExample4();
		List<Person> list1 = new ArrayList<>();
		Person p1 = new Person("Junaid");
		Person p2 = new Person("zain");
		Person p3 = new Person("person3");
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		app.setListPeople(list1);
		System.out.println("List 1: " + list1);
		list1.get(2).setName("Maryland");
		List<Person> list2 = app.getListPeople();
		System.out.println("List 2: " + list2);
	}

}
