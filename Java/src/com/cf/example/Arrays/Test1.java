package com.cf.example.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		int[] blots = new int[5];
		//int[] blots;
		int[] blocks = {1,2,3,4,5,6};
		blots=blocks;
		
		for(int i=0; i<blots.length; i++)
			System.out.println(blots[i]);
		
		for(int i=0; i<blocks.length; i++)
			System.out.println(blocks[i]);

	}

}
