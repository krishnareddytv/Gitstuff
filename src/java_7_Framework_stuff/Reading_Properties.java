package java_7_Framework_stuff;
//reading properties file
//create config package and create properties file under that...>right click-> new->others->general->file-> provide name with extension as .properties


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Reading_Properties {

	
	public static void main(String[] args) throws IOException {
	
	FileInputStream fs = new FileInputStream("E:\\seleniumworkspace\\java\\src\\config\\employee.properties");
	Properties prop = new Properties();
	prop.load(fs);
	
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("age"));
		

	}

}

/*
 Properties file stuff-->
 
name=venkat
age=31

 
*/