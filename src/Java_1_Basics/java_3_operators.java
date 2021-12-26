//program- operators-1.concatenation operator and 2.comparison operator


package Java_1_Basics;

public class java_3_operators {

	public static void main(String[] args) {
		
		
//1.Concatenation operation--- using--  +
		
		int A=10;
		int B=20;
		String C="GOOD";
		String D="MORNING";
		
System.out.println(A+B);
System.out.println(C+D);
System.out.println(A+B+C+D);
System.out.println(C+D+A+B);        // It is not the right way of concatenation
System.out.println(C+D+(A+B));      // It is the right way-keeping in brackets.



//2.operators are used mainly for comparison purpose in loops

// <, >, >=, <=, ==, !=
	
		
// if else........... find the largest between two numbers
		
		int a=10;
		int b=10;
		if (a>b)
		{
			System.out.println("a is largest number....."+a);
		}else if (a==b){
			System.out.println("a is equal to b..........."+a);
		}
		else{
			System.out.println("b is largest number....."+b);
			
		}
		
		
//if else---------------find the largest between three numbers
		
		int x=50;
		int y=50;
		int z=50;
		
		
		if(x >y & x>z){
			
			System.out.println("x is largest number......"+x);
		}
			else if(y>z){
				System.out.println("y is largest number........"+y);
				
			}else if(x==y & y==z){
				System.out.println("x is equal to y and z......"+x);
			}
			else{
				System.out.println("z is largest number...."+z);
			}
			
		
	}

}
