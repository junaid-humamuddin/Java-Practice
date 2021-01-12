package com.cf.example.exceptions;

// Rule: If the superclass method declares an exception, subclass overridden method can declare same, 
//subclass exception or no exception but cannot declare parent exception. 

/*//Example in case subclass overridden method declares parent exception
 * import java.io.*;  
class Parent{  
  void msg()throws ArithmeticException{System.out.println("parent");}  
}  
  
class ExceptionChild2 extends Parent{  
  void msg()throws Exception{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent p=new ExceptionChild2();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
} */


/*//Example in case subclass overridden method declares same exception
import java.io.*;  
class Parent1{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class ExceptionChild2 extends Parent1{  
  void msg()throws Exception{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent1 p=new ExceptionChild2();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}*/


//Example in case subclass overridden method declares subclass exception
 import java.io.*;  
class Parent2{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class ExceptionChild2 extends Parent2{  
  void msg()throws ArithmeticException{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent2 p=new ExceptionChild2();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
} 