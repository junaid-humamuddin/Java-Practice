package com.cf.example.Practice;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int n,key,first,last,mid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of binary list");
		n = sc.nextInt();
		int[] arrayList = new int[n];
		System.out.println("Enter " + n + " values");
		for (int i = 0; i < arrayList.length; i++) {
			arrayList[i] = sc.nextInt();
		}

		for (int c = 0; c < n; c++)
			arrayList[c] = sc.nextInt();
		System.out.println("Enter Key to serach");
		key=sc.nextInt();
		first=0;
		last=n-1;
		mid=(first+last)/2;
		while(first<=last) {
			if(key<=arrayList[mid]) {
				if(key==arrayList[first]) {
					key=arrayList[first];
					System.out.println("key is" +key);
				}
				else {
//				if(key)
				}
			}
		}
		sc.close();

	}

}
