package com.cf.example.Practice;

import java.util.Scanner;

public class InsertArrayAtNewLocation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of elements to store in an array");
		int no = scan.nextInt();
		int[] array2 = new int[no];
		System.out.println("Enter the array elements");
		for (int i = 0; i < no; i++) {
			array2[i] = scan.nextInt();
		}
		for (int j = 0; j < array2.length; j++) {
			System.out.println(array2[j]);
		}
		System.out.println("Enter an element to store in an array");
		int newArray = scan.nextInt();
		System.out.println("Enter the position to place the new array element in the existing list");
		int posArray = scan.nextInt();

		if (newArray >= 0) {
			array2[posArray - 1] = newArray;
			for (int i = 0; i < array2.length; i++) {
				System.out.println(array2[i]);
			}

		}
		scan.close();

	}

}
