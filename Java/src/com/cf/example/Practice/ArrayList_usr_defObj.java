package com.cf.example.Practice;

import java.util.ArrayList;
import java.util.Iterator;

class StudentInfo {
	int rollno;
	String name, stream;

	StudentInfo(String name, int rollno, String stream) {
		this.name = name;
		this.rollno = rollno;
		this.stream = stream;
	}
}

public class ArrayList_usr_defObj {

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo("junaid", 29, "cse");
		StudentInfo s2 = new StudentInfo("abcd", 59, "ece");
		StudentInfo s3 = new StudentInfo("xyz", 29, "mec");
		
		ArrayList<StudentInfo> info= new ArrayList<StudentInfo>();
		info.add(s1);
		info.add(s2);
		info.add(s3);
		
		Iterator<StudentInfo> itr=info.iterator(); 
		while(itr.hasNext()) {
			   StudentInfo s=itr.next();
			   System.out.println(s.name+" "+s.rollno+" "+s.stream);
		}

	}

}
