//program-create an object,how to accessing non static data and static data

//object: instance of class...>all non static stuff with in the class(variables,functions) is reside inside an object

//terminology: create a class,declare some non static variables,nonstatic functions,and create  an object (instance of class)
//by using object,we can initialize the variables.

package Java_1_Basics;

public class java_9_car {
	
//properties of car--declaring non static global variables
	
	int price;
	String model;

//static property
	
	static int wheels=4;
	

	public static void main(String[] args) {
		
//1.create an object
		
		java_9_car c1=new java_9_car();   //c1 is the reference  of object and new java_9_car() is the object
		
 //assign values to variables
		c1.model="maruti";
		c1.price=500000;
		
//creating one more object
		
		java_9_car c2=new java_9_car();
		
//initialize the variables
		
		c2.model="honda";
		c2.price=1000000;
		
		
//calling non static functions
		
		c1.start();    //using object reference and functions names
		c1.accelerate();
		
		
		c2.start();
		c2.accelerate();
	
//calling static function
		fillfuel(5);  				 //call with direct name
		java_9_car.fillfuel(10);     //call by class name.function name
		
		
	}

	
	//create non static function
	
	
	public void start(){
		
		System.out.println(model+"....car is starting");
		
	}
	
	//create one more non static function
	
	public void accelerate(){
		
	    System.out.println(model+"...car is acceleraing");
	}
	
	//create static function
	
	public static void fillfuel(int litres){
	System.out.println("filling fuel of...."+litres);	
	
	}
	}

//Notes:Why main method is public static and void in Java

/*
main method in Java is public so that its visible to every other class, even which are not part of its package. if its not public JVM classes might not able to access it.

main method is static in Java, so that it can be called without creating any instance. While JVM tries to execute Java program it doesn't know how to create instance of  main class as there is no standard constructor is defined for main class.

main method is void in Java because it doesn't return any thing to caller which is JVM 
*/