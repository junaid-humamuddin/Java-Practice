package com.cf.example.rough;

public class ContinueTest {
	 int doStuff(int i) {
		 
		//System.out.println("pass");
		return i;
	}

	public static void main(String[] args) {

		ContinueTest foo = new ContinueTest();

		for (int i = 0; i < 10; i++) {
			
			if (foo.doStuff(i)== 5) {
				continue;
			}
			else
				System.out.println("Inside loop" +i);
		}

	}

}
