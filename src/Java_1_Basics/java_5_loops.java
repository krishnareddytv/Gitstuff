package Java_1_Basics;

public class java_5_loops {

	public static void main(String[] args) {
		
	
//1.while loop
		
		int i=0;       					// initialization
		while(i<5){    					//condition
			
			System.out.println(i);
			i=i+1;						//increment or decrement.. i++  or i--	//if this condition is not given.loop will continue infinite times..it's the disadvantage of while loop
				}
	
		
//2. for loop--- print the numbers from 100 to 104
		
		for (int x=100;x<105; x++){
			System.out.println(x);
		}
			
//3. for loop--- print the sum of 100 numbers
		int sum=0;
		for (int n=0;n<=100; n++){
					sum=sum+n;
				}
		
		System.out.println("sum of 100 numbers is..."+ sum);
		
		
	}

}


//Debugging mode: click on open perspective in eclipse right top -select Debug
//to normal mode: click on open perspective in eclipse right top -select java

// Run in Debug mode-process
//1.set breakpoint----double click on any line of java program
//2.Go to debug mode--note : variables window and breakpoint window opened.
//3.run debug button
//4.click on F6 for running in debug mode--observe the variables are changing

// run in normal by click on F8

