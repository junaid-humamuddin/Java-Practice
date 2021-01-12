package com.cf.example.Practice;

import java.util.*;

public class CompareArrayLists2 {
	
	public static void main(String[] args) {
		Collection<String> listOne = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
		Collection<String> listTwo = new ArrayList<String>(Arrays.asList("a", "b", "d", "e", "f", "gg", "h"));

		List<String> sourceList = new ArrayList<String>(listOne);
		List<String> destinationList = new ArrayList<String>(listTwo);

		sourceList.removeAll(listTwo);
		destinationList.removeAll(listOne);

		System.out.println(sourceList);
		System.out.println(destinationList);
	}

}
