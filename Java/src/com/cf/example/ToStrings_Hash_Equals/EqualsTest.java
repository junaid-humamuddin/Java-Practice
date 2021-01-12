package com.cf.example.ToStrings_Hash_Equals;

public class EqualsTest {
	public static void main(String[] args) {
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		if (one.equals(two)) {
			System.out.println("one and two are equal");
		}
		else {
			System.out.println("Not equal");
		}
	}
}

class Moof {
	private int moofValue;

	Moof(int val) {
		moofValue = val;
	}

	public int getMoofValue() {
		return moofValue;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moof other = (Moof) obj;
		if (moofValue != other.moofValue)
			return false;
		return true;
	}
	
	
}
