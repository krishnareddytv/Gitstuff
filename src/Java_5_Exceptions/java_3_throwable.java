
//program-3: throwable usage

package Java_5_Exceptions;
public class java_3_throwable {

	public static void main(String[] args) {


		try{
			// selenium code
			System.out.println("try block");
			int i=2/0;
		}catch(Throwable t){
			System.out.println(t.getMessage());
			t.printStackTrace();
		}

	}

}

/*
Note: throwable is the super class object for error, exception classess.if we use it,we can handle both errors as well as exceptions.
please refer for Exception Hierarchy
http://pages.cs.wisc.edu/~cs368-1/JavaTutorial/NOTES/Exceptions.html

*
*/