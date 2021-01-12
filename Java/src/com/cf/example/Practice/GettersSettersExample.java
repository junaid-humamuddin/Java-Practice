package com.cf.example.Practice;

public class GettersSettersExample {

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setAge(22);
		e.setName("Junaid");
		e.setId(01);
		e.setValue(true);
		System.out.println("My name is "+e.getName()+" and i am "+e.getAge()+" years old bearing id no "+e.getId()+"and it is "+e.isValue());
	}

}

class Encapsulation {
	private int age;
	private String name;
	private int id;
	boolean value;

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		if (age < 10 || age > 50) {
	        throw new IllegalArgumentException();
	    }
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the value
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(boolean value) {
		this.value = value;
	}

	
}