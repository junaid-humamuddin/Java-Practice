package com.cf.example.serialization;

public class StudentP extends Person {
	String course;
	int fee;

	public StudentP(int id, String name, String course, int fee) {
		super(id, name);
		this.course = course;
		this.fee = fee;
	}
}

//Now you can serialize the Student class object that extends the Person class which is Serializable.Parent 
//class properties are inherited to subclasses so if parent class is Serializable, subclass would also be.