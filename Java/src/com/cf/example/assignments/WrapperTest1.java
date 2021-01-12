package com.cf.example.assignments;

public class WrapperTest1 {

	public static void main(String[] args) {
		Integer i2 = new Integer(42); // make a new wrapper object
		
		byte b = i2.byteValue(); // convert i2's value to a byte primitive
		
		short s = i2.shortValue(); // another of Integer's xxxValue methods
		
		double d = i2.doubleValue(); // yet another of Integer's xxxValue methods
		 
		System.out.println(b);
		System.out.println(s);
		System.out.println(d);
		
		Float f2 = new Float(3.14f); // make a new wrapper object
		short s1 = f2.shortValue(); // convert f2's value to a short primitive
		System.out.println(s1); // result is 3 (truncated, not rounded)
		
		double d4 = Double.parseDouble("3.14"); // convert a String to a primitive
		System.out.println("d4 = " + d4); // result is d4 = 3.14
		//System.out.println(d4 instanceof Double);  //not applicable
		
		Double d5 = Double.valueOf("3.14");
		System.out.println("d5 = " + d5);
		System.out.println(d5 instanceof Double);
		
	}

}
