//creating basic function

package Java_1_Basics;

public class java_7_functions {

	public static void main(String[] args) {
	
//1.calling static function by using name
		sample_static();
		
//2.calling non static function with the help of object instance
		//create an object
		
		java_7_functions a=new java_7_functions();
		a.sample_nonstatic();
		
	}

//creating  static function-it can be called by using the function name
	public static void sample_static(){
		System.out.println("sample static function");
	}
	
//creating non static function
	public void  sample_nonstatic(){
		System.out.println("sample no static function");
	}
}
