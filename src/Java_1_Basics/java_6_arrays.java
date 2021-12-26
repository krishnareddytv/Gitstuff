package Java_1_Basics;

public class java_6_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Arrays- memory location --we can store multiple variables. memory location is divided into sections..each section can be stored with some data.each section can be identified with the index. index of an array is starting with zero
		
//1.single dimensional array DECLARE,length AND PRINTING
/*
String str[]=new String[5];   //Declare string array

str[0]="NAME";
str[1]="CITY";
str[2]="D.O.B";
str[3]="AGE";
str[4]="HEIGHT";

//find the length of array
System.out.println(str.length);

//integer array
int i[]=new int[4];
System.out.println(i.length);

//character array
char c[]=new char[3];
System.out.println(c.length);

//printing string array elements

for (int x=0;x<str.length;x++){
	System.out.println(str[x]);
	}

//printing string array in reverse order

 for (int y=str.length-1; y>=0;y--){
	System.out.println(str[y]); 
	
 }

 */
 //2.Two dimensional arrays-- used for write/read the data into ecxel--it is having the rows and cols structure
 
 
 
 String s[][]=new String[2][3];  // 2 is no.of rows, 3 is no.of cols
 
 //first row values are A,B,c
 s[0][0]="A";
 s[0][1]="B";
 s[0][2]="C";
 
 //Second row values are X,Y,Z
 s[1][0]="X";
 s[1][1]="Y";
 s[1][2]="Z";
 
 //FIND THE LENGHT OF ROWS
 		System.out.println("NO.OF ROWS ARE....."+s.length);
  //find no.of cols
 		System.out.println("no.of cols are...."+ s[0].length);
 
 //print all rows and cols data
 		
 		for (int rows=0; rows<s.length;rows++){
 			
 			for (int cols=0;cols<s[rows].length; cols++){
 				System.out.println(s[rows][cols]);
 			}
 		}
 
 //3.object array--- inbuilt class--stored all types of data.ex string,int,char,boolean,decimal..etc
 		
 		Object o[]=new Object[5];
 		o[0]="name";
 		o[1]=123;
 		o[2]=true;
 		o[3]='A';
 		o[4]=10.75;
 	
 		//length of object array
 		
 		System.out.println("lenght of object array is.."+o.length);
 		
 //print object array
 		
 		for (int i=0;i<o.length;i++){
 			System.out.println(o[i]);
 			 		}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
}
