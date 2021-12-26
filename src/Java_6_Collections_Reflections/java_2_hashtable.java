//hash table--for collections of dynamically increasing data..it will grow with the help of key value pair.
//hash table Reference:http://www.java2novice.com/java-collections-and-util/hashtable/
package Java_6_Collections_Reflections;
import java.util.Hashtable;
public class java_2_hashtable {
public static void main(String[] args) {
		
Hashtable<String,String> table = new Hashtable<String,String>();

table.put("name", "reddy");
table.put("city", "hydbad");
table.put("post", "pocharam");

//print with key combination
System.out.println(table.get("name"));
//length of hashtable
	System.out.println(table.size());	
//keyset	
System.out.println(table.keySet());	

//print all key values
for (String key: table.keySet()){
	System.out.println(table.get(key));
}
}
}