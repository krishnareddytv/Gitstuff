package Java_1_Basics;

public class java_11_constructor {
	
	String employeename;
	int employeeage;
	
	
//1.create default constructor with out any arguments.it should be same as class name
	
	
	public java_11_constructor(){  
		System.out.println("sample default constructor is...");
	}
	
//2.constructor overloading--same name with different parameters
	
	public java_11_constructor(String name,int age){
		 employeename=name;
		 employeeage=age;
		System.out.println("name is..."+ name + "...age is .."+age);
	}

	public static void main(String[] args) {
		
	//create an object- object is by default invoke the constructor	
		java_11_constructor a=new java_11_constructor();
		
	//create one more object with parameters..it will invoke the constructor and execute the code accordingly.
		java_11_constructor b=new java_11_constructor("abc",5);
			
		
	}

}

//CONSTRUCTOR:WILL HELP US TO INTIALIZE OBJECTS

/*

Constructor in java is a special type of method that is used to initialize the object.

Java constructor is invoked at the time of object creation. It constructs the values i.e. provides data for the object that is why it is known as constructor.

Rules for creating java constructor

There are basically two rules defined for the constructor.

Constructor name must be same as its class name
Constructor must have no explicit return type
Types of java constructors

There are two types of constructors:

Default constructor (no-arg constructor)
Parameterized constructor

*/