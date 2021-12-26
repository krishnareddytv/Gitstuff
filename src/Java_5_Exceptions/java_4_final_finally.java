//program4- usage of final and finally 

package Java_5_Exceptions;

public class java_4_final_finally {

	
	public static void main(String[] args) {
		final int s=100; // cannot change value
		//s=101;

		try{
			// establish connection
			// fire a query
			// get the results
			// close connection
			
		}catch(Exception e){
			// error
			System.out.println("error");
		}finally{
			// close the connection if established
			System.out.println("closed it.....finally");
		}
		
		
	}

}

/*
Notes:final vs finally

final: which can not change the assigned value of variable  ex: final int 100;
finally:its block of code used in the try catch blocks in case if some code is not executed in try block.we can keep mandatory code part in finally to 
execute it
 The finally keyword is used to create a block of code that follows a try block.
  A finally block of code always executes, whether or not an exception has occurred. Using a finally block allows you to run any cleanup-type statements
   that you just wish to execute, despite what happens within the protected code
*/