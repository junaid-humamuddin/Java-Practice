package com.cf.example.rough;

public class Brk_Cnt_Test {

	public static void main(String[] args) {
		
		outer:
			for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
			System.out.println("Hello " +j);
			continue outer;
			} // end of inner loop
			System.out.println("outer "+i); // Never prints
			}
			System.out.println("Good-Bye");

		
/*		boolean isTrue = true;
		outer:
		for(int i=0; i<5; i++) {
		while (isTrue) {
			System.out.println("Hello");
			break outer;
			} // end of inner while loop
			System.out.println("Outer loop."); // Won't print
			} // end of outer for loop
			System.out.println("Good-Bye");*/
			
			
		}

	}


