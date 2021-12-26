//inheritance usage--
/*
 Note:inheritance-> extending the child class with parent or super class properties or methods
 create 3 classes-parent,child,test(main method)
 
 create 2 functions in parent- start,stop
 create 2 functions in child- start,safety
 
 create objects in 3 different ways
 1.parent class object-----can access only parent properties and functions
 2.child class object----->can able to access both parent as well as child
 3.parent class reference and child object--->can access all parent class functions and child functions alone if  any function is overridden
 
  
 */


package Java_2_Inheritance;

public class test {

	public static void main(String[] args) {
		
//1.create parent object--it should only access parent class properties and methods
		
/*		parent_car c=new parent_car();
		
   c.carprice=3000000;   //able to access parent class properties
   c.start();			//able to access parent class methods
   c.stop();
 */  
   
//2.create child class object--able to access both parent and child
   
 /*  child_bmw b=new child_bmw();
   
   	b.bmwprice=2000000;    //child class property
    b.carprice=300000;    //parent class property
    b.start();       //its overridden function..same function from both parent and child..output is child function
    b.safety();      //child
    b.stop();        //parent
 */   
//3. create object with reference as parent and object as child----->can access all properties and methods from parent and only overridden functions from child.
   parent_car p=new child_bmw();
  
   p.carprice=2600000;
    p.start();  //child--overridden
   p.stop();   //parent
  
  
   
     
   
   
	}

}

/*

Inheritance in Java

Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of parent object.

The idea behind inheritance in java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of parent class, and you can add new methods and fields also.

Inheritance represents the IS-A relationship, also known as parent-child relationship.

Why use inheritance in java
•For Method Overriding (so runtime polymorphism can be achieved).
•For Code Reusability.

*/


