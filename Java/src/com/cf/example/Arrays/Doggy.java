package com.cf.example.Arrays;

class Dog {
	String s;

	Dog(String s) {
		this.s = s;
	}


	@Override
	public String toString() {
		return "Dog [s=" + s + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	
	
}

public class Doggy {

	public static void main(String[] args) {

		Dog puppy = new Dog("Frodo");
		Dog[] myDogs = { puppy, new Dog("Clover"), new Dog("Aiko") };
		
		for (int i = 0; i < myDogs.length; i++) {
			System.out.println(myDogs[i].toString());
		}

	}

}
