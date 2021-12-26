//program-throws-interruptedexception


package Java_5_Exceptions;

public class java_6_exception_throws {
	
	public static void main(String[] args) throws InterruptedException  {
		clickLink();
	
	}
	
	public static void clickLink() throws InterruptedException {
		
		loadPage();
	}

	public static void loadPage() throws InterruptedException {
		
			//int i[]=new int[3];
			//i[3]=303;
		System.out.println("A");
		Thread.sleep(5000L);
		System.out.println("B");
		Thread.sleep(5000L);
		System.out.println("C");
		Thread.sleep(5000L);
		
	}
}

/*
 throw vs throws

Throws: comes infront of function--it tells java that this function is capable of throwing an exception.

throw:  this clause is used to deliberately throws an exception.ex

	public static void main(String[] args) throws Exception {	
		throw new Exception("Some description");
			}

 */
