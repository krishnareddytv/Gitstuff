//Static functions -can associated some rules-used only static stuff/variables.
//Non static functions- no rules associated--can be used static or non static variables.

//local variables -  life of that variables only with in the specified function
//Global variables-  used across all functions-should be defined at the top under class
//static global variables and non static global variables.


package Java_1_Basics;

public class java_8_staticandnonstatic {
	
//1. non static global variables	
	String employeename;   

//2.static global variables
	static int ageofemployee;  
	
	public static void main(String[] args) {    //static function-Main method
		
//3.local variable--this can be used only in this block
		int salary; 
		
		salary=50000;
		System.out.println("local varial salary is ....RS:"+salary);
//4. static function should access  only static
		
		ageofemployee=30;   //able to access static
		
		System.out.println("static global variale 'ageofemployee'from staticfunction-  is .:"+ageofemployee);
		
	//	employeename="reddy";  //but not able to access non static global variables--getting error
		
		
	//	employees();  //not able to access non static function
	holidays();  //able to access static function
	
		
	}

	
	public void employees(){        //non static function
		
//5.Non static functions can access any thing
		
		ageofemployee=40;   //able to access static
		System.out.println("static global variale 'ageofemployee' from non static function is .:"+ageofemployee);
			
		employeename="reddy";   //able to access non static  also
		
		System.out.println("non static global variable employeename..."+employeename);
	}
	
	public static void holidays(){          //static function-custom defined function
		ageofemployee=40;   //able to access static
		System.out.println("static global variale age of employee is .:"+ageofemployee);
			
	
	}
	
		
}
