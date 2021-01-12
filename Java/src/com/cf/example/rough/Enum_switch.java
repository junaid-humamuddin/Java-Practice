package com.cf.example.rough;

public class Enum_switch {

	enum Color {
		red, green, blue
	}

	class SwitchEnum {
	}

	public static void main(String[] args) {

		Color c = Color.green;
		switch (c) {

		case red:
			System.out.print("red ");
		case green:
			System.out.print("green ");
		case blue:
			System.out.print("blue ");
		default:
			System.out.println("done");
		}
	}
}
