package com.cf.example.Arrays;

public class Shortcut2DArray {

	public static void main(String[] args) {
		
		int[][] scores = {{5,2,4,7}, {9,2}, {3,4}};
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
/*The following code shows the values of some
of the elements in this two-dimensional array:
scores[0] // an array of four ints
scores[1] // an array of 2 ints
scores[2] // an array of 2 ints
scores[0][1] // the int value 2
scores[2][1] // the int value 4
*/