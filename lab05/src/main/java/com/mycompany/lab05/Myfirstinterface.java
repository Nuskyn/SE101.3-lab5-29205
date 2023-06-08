
package com.mycompany.lab05;

public class Myfirstinterface {

    int x = 10;
   public void display();
}

//answer 01- In this code, the implicitly public, static, and 
//final integer variable x is used to declare the interface MyFirstInterface.
 //Interface variables are by default public, static, and final, 
//which means that once they have been given a value, they cannot be changed.

//Answer- 02The abstract function display() is declared in this 
//code's interface. When specifying methods within an interface, 
//the abstract keyword need not be used explicitly. Every method 
//in an interface is inherently abstract, which means that classes
//that implement the interface must implement them since they lack
//a method body.