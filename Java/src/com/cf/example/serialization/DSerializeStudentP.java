package com.cf.example.serialization;

import java.io.*;

public class DSerializeStudentP {

	public static void main(String[] args) throws Exception  {
		
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D://studentFile.txt"));  
		  StudentP sp1=(StudentP)in.readObject();  
		  System.out.println(sp1.id+" "+sp1.name+" "+sp1.course+" "+sp1.fee);  
		  
		  in.close(); 

	}

}
