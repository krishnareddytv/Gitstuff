//program 2:exceptions handling--> try-catch block--->
//write 3 lines of code and middle use some error code..handle with try block code


package Java_5_Exceptions;

public class java_2_try_catch {

	String name;
	public static void main(String[] args) {
		
//1)e.getmessage , e.printstacktrace
		System.out.println("A");
		
		try{
					
			System.out.println("A1");
		int i=10/0;
			System.out.println("A2");
			
			}catch(Exception e){
				
			System.out.println("Error reported is....."+ e.getMessage());  //get the error message
			e.printStackTrace();    //print the error --->which line it caught the error
								}
	
}
}
/*

Notes: try-catch
1.try block will try to execute the code inside it.if no error in code..it will come out of try-catch block
if any error in try block code, it will move to catch block and execute the code present in catch block.we can write code insuch a way that we can report that error message or we can take the screen shots.
2)Exception is an inbuilt object with reference e
3)e.getmessage()---->for getting the exception message
4)e.printstacktrace()--->for printing error message-->it tells on which line the error is coming.

*/