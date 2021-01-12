package com.cf.example.assertions;

import java.util.Scanner;  

class AssertionExample{  
 public static void main( String args[] ){  
  
  Scanner scanner = new Scanner( System.in );  
  System.out.print("Enter ur age ");  
    
  int value = scanner.nextInt();  
  assert value>=18:" Not valid";  
  
  System.out.println("value is "+value);
  scanner.close();
 }   

}  

//we need to enable assertions to get the expected output for this program.