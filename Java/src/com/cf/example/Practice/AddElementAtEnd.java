package com.cf.example.Practice;

import java.util.Scanner;

public class AddElementAtEnd {
	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int[] array1 = new int[n];
		System.out.println("Enter the array elements");
		for (i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		/*
		 * for (i = 0; i < array1.length; i++) { System.out.println(array1[i]); }
		 */
		int[] array2 = new int[array1.length + 1];
		/*
		 * System.out.
		 * println("Enter the position to place the new array element in the existing list"
		 * ); int posArray = sc.nextInt();
		 */
		for (i = 0; i < array2.length; i++) {
			if (i == array2.length - 1) {
				array2[4] = 555;
			} else {
				array2[i] = array1[i];
			}
			System.out.println(array2[i]);
		}
		sc.close();
	}

}
