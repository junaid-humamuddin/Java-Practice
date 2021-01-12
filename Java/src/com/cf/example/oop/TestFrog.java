package com.cf.example.oop;

class Frog2 {
static int frogCount = 0; // Declare and initialize
// static variable
public Frog2() {
frogCount += 1; // Modify the value in the constructor
}
}
class TestFrog {
public static void main (String [] args) {
new Frog2();
new Frog2();
new Frog2();

Frog2 f = new Frog2();
int frogs = f.frogCount; // Access static variable FrogCount using f

System.out.print("frogCount:"+Frog2.frogCount); //Access
// static variable 

}
}