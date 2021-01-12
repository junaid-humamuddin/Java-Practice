package com.cf.example.oop;

public class Foo {

		
		public int left = 9;
		public int right = 3;
		
		public void setLeft(int leftNum) {
		left = leftNum;
		right = leftNum/3;
		System.out.println(left);
		System.out.println(right);
		
		}
		
		public static void main(String args[]) {
			Foo f=new Foo();
			f.setLeft(12);
		}
		
}