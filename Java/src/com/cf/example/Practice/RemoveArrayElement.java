package com.cf.example.Practice;

import java.util.Scanner;

public class RemoveArrayElement {

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
		System.out.println("Enter the position to remove the array element in the existing list");
		int posArray = sc.nextInt();
		
		int j;
		int[] array2 = new int[array1.length];
		if (posArray != -1) {

			for (j = 0; j < posArray - 1; j++) {
				array2[j] = array1[j];
			}
			//array2[posArray - 1] = ;
			for (j = posArray; j < array2.length; j++) {
				array2[j-1] = array1[j];
			}
		}
		System.out.println("Resultant Array");
		for (j = 0; j < array2.length-1; j++)
			System.out.println(array2[j]);
		sc.close();
	}
}
