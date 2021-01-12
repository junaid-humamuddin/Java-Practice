package com.cf.example.rough;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String[] array = new String[] {"abc", "def","ghi"};
		/*for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 2; j++) {
			System.out.println(array[i][j]);
		}
		System.out.println();
	}*/
	
		for (int i = 0; i < array.length; i++) {
			String j=array[i];
			System.out.println(j);
		}
		
		
	}

}
