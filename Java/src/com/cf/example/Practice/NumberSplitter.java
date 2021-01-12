package com.cf.example.Practice;

public class NumberSplitter {

	public static void main(String[] args) {
	/*	int n;
		int[] no = new int[n];
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<no.length;i++) {
			
		}*/
		int num = 5542;
		String number = String.valueOf(num);
		for(int i = 0; i < number.length(); i++) {
		    int j = Character.digit(number.charAt(i), 10);
		    System.out.println("digit: " + j);
		}
	}

}
