package com.cf.example.Collections;

import java.util.*;

enum Pets {
	DOG, CAT, HORSE
}

class Cat {
}

class DogMap {
	public DogMap(String n) {
		name = n;
	}

	public String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

class MapTest {
	public static void main(String[] args) {
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new DogMap("aiko")); // add some key/value pairs

		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");

		DogMap d1 = new DogMap("clover"); // let's keep this reference
		m.put(d1, "Dog key");
		m.put(new Cat(), "Cat key");
		System.out.println(m.get("k1")); // #1
		String k2 = "k2";
		System.out.println(m.get(k2)); // #2
		Pets p = Pets.CAT;
		System.out.println(m.get(p)); // #3
		System.out.println(m.get(d1)); // #4
		System.out.println(m.get(new Cat())); // #5
		System.out.println(m.size()); // #6
	
	}
}