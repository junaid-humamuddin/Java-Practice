package com.cf.example.excercise6;

import java.io.File;

class Maker {
	public static void main(String[] args) {
		try {
			File dir = new File("D://dir3");
			dir.mkdir();
			File file = new File(dir, "file3");
			file.createNewFile();
		} catch (Exception x) {
		}
	}
 }