package com.cf.example.rough;

public class EqualsEx {
	public static void main(String[] args) {
		
/*		String mango = "mango";
		String mango3 = "mango";
	
		System.out.println(mango.equals(mango3));
		*/
		
		String s1 = new String( "Test" );
		String s2 = new String( "Test" );

	        System.out.println( "\n1 - PRIMITIVES ");
	        System.out.println( s1 == s2 ); // false
	        System.out.println( s1.equals( s2 )); // true

		
		/*Object o1 = new Object();
		Object o2 = new Object();
		//o1=o2;
		System.out.println(o1.equals(o2));*/
	}

}
