//interface rules
//1.no static function
//2.variables are static
//3.variable names can not change
//4.mandatory to initialize variables
//5.can not create an object of interface

/*
 1.create one interface-bank-->initialize any variable, create non static functions(without body)
 2.create one class-hsbcbank---> add the interface keyword to the class...ex: public hsbcbank impliments bank..>add unimplemented methods from the class name hsbcbank
 add any coding stuff under the methods imported from interface.
 3.create one class for testing purpose-->
 
 two ways we can create an object.
 1. create one object with parent object reference(interface name) and child object name(hsbcbank)
 initialize all the
 
  
 */


package Java_3_Interface;

public class testbank {

	public static void main(String[] args) {
	
	//one way
		
		bank b=new hsbcbank();
	
		b.transfermoney();  
		
		b.credit();
		b.debit();
		System.out.println("static variable name is calling......"+bank.minbalance);	
	
	//second way--advantage is we can call the hsbcbank functions also
		
		hsbcbank h=new hsbcbank();
		h.transfermoney();
		h.credit();
		h.debit();
		h.internationaltransfer();
		
	}

}
