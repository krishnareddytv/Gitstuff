//OBJECT Reference manipulations

package Java_1_Basics;

public class java_10_car {
	String model;
	public static void main(String[] args) {
		
		java_10_car a=new java_10_car();
		java_10_car b=new java_10_car();
		java_10_car c=new java_10_car();
		
		a.model="A";
		b.model="B";
		c.model="c";
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);

	//object reference manipulations
		
		a=b;  //for this reference of a is moved to the reference of b...so now the reference of a=B,b=B
		b=c;  //for this reference of b is moved to the reference of c...so now the reference of b=C,C=C
		c=a;  //for this reference of c is moved to the reference of a...so now the reference of c=B,a=B
		
	
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
	}

}
