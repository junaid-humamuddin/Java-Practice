package com.cf.example.Practice;


/*	Note: Other type of array construction and initialization(Anonymous array)
int[] testScores=new int[] {4,7,2};
	for(int i=0;i<testScores.length;i++)
		{
		System.out.println(testScores[i]);
	}
}*/

public class ArrayTest {

	void takesAnArray(int[] someArray) {
		// use the array parameter
	}

	public static void main(String[] args) {
		ArrayTest f = new ArrayTest();
		f.takesAnArray(new int[] { 7, 7, 8, 2, 5 }); // we need an array argument
		/*_____________________________*/
		
		ArrayTest[] abcd = {new ArrayTest2(), new ArrayTest3()};
	}
}
class ArrayTest2 extends ArrayTest{
	
}

class ArrayTest3 extends ArrayTest{
	
}