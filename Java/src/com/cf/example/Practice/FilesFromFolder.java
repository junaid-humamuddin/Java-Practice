package com.cf.example.Practice;

import java.io.File;
import java.util.*;

public class FilesFromFolder {

	public static void main(String[] args) {
		File folder = new File("D://Junaid");
		File[] listOfFiles = folder.listFiles();
		List<String> list1 = new ArrayList<String>();
		String arrayList = null;
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				arrayList = listOfFiles[i].getName();
				list1 = Arrays.asList(arrayList);
				Iterator<String> itr = list1.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
				// System.out.println("Serialized Files " + arrayList);
			}
		}

	}

}
