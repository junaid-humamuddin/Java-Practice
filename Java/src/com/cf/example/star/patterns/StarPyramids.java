package com.cf.example.star.patterns;

public class StarPyramids {

	public static void main(String[] args) {
		Pyramids p = new Pyramids();
		/*p.simplePyramid();
		p.Seperator();
		p.simpleReversePyramid();*/
		p.simpleRightPyramid();
	}
}

class Pyramids {
	void Seperator() {
		System.out.println("");
		System.out.println("---------------");
		System.out.println("");
	}

	void simplePyramid() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	void simpleReversePyramid() {
		for (int x = 5; x > 0; x--) {
			for (int j = 0; j < x; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	void simpleRightPyramid() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
