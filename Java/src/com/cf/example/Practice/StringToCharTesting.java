package com.cf.example.Practice;

public class StringToCharTesting {

	public static void main(String[] args) {
	
		String str1 = "Junaid";
		//System.out.println(str1.toString());
		char result=0;
		char array1[]=new char[50];
		for (int i = 0; i < str1.length(); i++) {
			result = str1.charAt(i);
			//System.out.println(result);
			array1[i]=result;
			System.out.println(array1[i]);
		}
	}
}