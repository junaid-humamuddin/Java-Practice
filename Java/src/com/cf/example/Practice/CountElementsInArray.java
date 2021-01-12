package com.cf.example.Practice;

import java.util.Scanner;

public class CountElementsInArray {

	public static void main(String[] args) {
		
		int[] array = { 1, 4, 5, 67, 24, 6, 46, 7, 45, 56 };
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			count += 1;
		}
		System.out.println("Total no of elements in an array are:" + count);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element to store in an array");
		int newArray = sc.nextInt();
		System.out.println("Enter the position to replace the new array element in the existing list");
		int posArray = sc.nextInt();
		if (newArray >= 0) {
			array[posArray - 1] = newArray;
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}

		}
		sc.close();
	
	}
}
