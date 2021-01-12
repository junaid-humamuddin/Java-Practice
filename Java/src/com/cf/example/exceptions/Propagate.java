package com.cf.example.exceptions;

class Propagate {
	String reverse(String s) {
		if (s.length() == 0)
			throw new IllegalArgumentException();
		String reverseStr = "";
		for (int i = s.length() - 1; i >= 0; --i) {
			reverseStr += s.charAt(i);
		}
		return reverseStr;
	}

	public static void main(String[] args) {
		Propagate obj = new Propagate();
		try {
			System.out.println(obj.reverse("SALONI"));
			//System.out.println(obj.reverse(""));
		} catch (IllegalArgumentException e) {
			System.out.println("No blank argument!.");
		} finally {
			System.out.println("It's over");
		}
	}
}