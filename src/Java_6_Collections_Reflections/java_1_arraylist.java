package Java_6_Collections_Reflections;
//program-Arraylist--->used for storing the values dynamically increasing.
//list will grow with index

import java.util.ArrayList;


public class java_1_arraylist {

	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("A"); // or list.add(0,"A");
		list.add("B");  //index of 1
		list.add("M");  //index of 1
		
		//Retrieving by using--get(index)
		System.out.println(list.get(2));
		
		//length of arraylist
		System.out.println(list.size());
		
		//print all
		
		for (int i=0;i<list.size();i++){
		System.out.println(list.get(i));
		
	}
	}
}
