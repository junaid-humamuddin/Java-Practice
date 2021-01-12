package com.home.example.javaconcepts;

class A1
{
     int i;
 
     {
          System.out.println("First IIB Block");
     }
 
     {
          System.out.println("Second IIB Block");
     }
 
     A1(int j)
     {
          this();
          System.out.println("First Constructor");
     }
 
     A1()
     {
          System.out.println("Second Constructor");
     }
}
 
class MainClass
{
     public static void main(String[] args)
     {
          A1 a = new A1(50);
     }
}
