package com.home.example.javaconcepts;

public class ForEach2D {

	public static void main(String[] args) {
		int [][] twoD= {{1,2,3,4},{5,6,7,8}};
		for(int[] i:twoD) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}

	}

}
