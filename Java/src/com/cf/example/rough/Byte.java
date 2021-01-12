package com.cf.example.rough;

import java.util.Scanner;

public class Byte {

	public static void main(String[] args) {
		int[] year = new int[10];
		int i;
		/*
		 * byte b = 3; b = (byte) (b + 7); System.out.println(b);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		for ( i = 0; i < year.length; i++) {
			year[i] = sc.nextInt();
			 System.out.println("year[" + i + "] = " + year[i]);
			
		}
		//for( i = 0; i < year.length; i++)
//		System.out.println(year[i]);
		sc.close();
	}
	
}
