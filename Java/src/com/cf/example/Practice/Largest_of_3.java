package com.cf.example.Practice;

import java.util.Scanner;

public class Largest_of_3 {

	public static void main(String[] args) {
		int x, y, z;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		x = sc.nextInt();
		System.out.println("Enter Second number");
		y = sc.nextInt();
		System.out.println("Enter Third number");
		z = sc.nextInt();
		if (x > y) {
			if (x > z) {
				System.out.println("Value " + x + " is greater ");
			} else {
				System.out.println("Value " + z + " is greater");
			}
		} else {
			if (z > y) {
				System.out.println("Value " + z + " is greater");
			} else {
				System.out.println("Value " + y + " is greater");
			}

		}
	}
}
