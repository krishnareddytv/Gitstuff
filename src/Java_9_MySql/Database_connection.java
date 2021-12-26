//INSTALLATION OF MYSQL
//https://www.youtube.com/watch?v=z1t9m7K6cpI
//load the mysql jar file--> mysql-connector-java-5.0.7-bin.jar
//PROGRAM-1.EXECUTE QUERY,2.PREPARED STATEMENT 3.STORED PROCEDURE EXECUTION 4.INSER DATA

package Java_9_MySql;
// import sql package
import java.sql.*;

//http://docsrv.sco.com/JDK_guide/jdbc/getstart/callablestatement.doc.html
public class Database_connection {
		
	public static void main(String[] args) throws SQLException {
		
		  Connection conn = null;
		  String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "krishna";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root"; 
		  String password = "abc123";  
		 
		  try{
			  Class.forName(driver).newInstance();// create object of Driver
			  conn = DriverManager.getConnection(url+dbName,userName,password);
			  // connection will be established
			  
//1. *******************Statement******************
			  System.out.println("1)EXECUTING STATEMENTS ");
			  Statement stmt = conn.createStatement();
			  ResultSet rs = stmt.executeQuery("select * from users");
			  
			//  rs.next(); // 1st row
			//  System.out.println(rs.getString(2));
			//  rs.next(); // 2nd row
			//  System.out.println(rs.getString(1));
			  while(rs.next()){
				System.out.println(rs.getString(1) + "-- "+rs.getString(2)+" -- "+rs.getString(3));  
			  }
		  
			  System.out.println("*********************************");
 //2. *****************PREPARED STATEMENT**************
			  System.out.println("2)EXECUTING PREPARED STATEMENTS");
			  PreparedStatement pstmt = conn.prepareStatement("select * from users where userid = ? and username=?");
			  pstmt.setString(1, "1");
			  pstmt.setString(2, "krishna");
			  ResultSet rs1 = pstmt.executeQuery();
			  
			  while(rs1.next()){
					System.out.println(rs1.getString(1) + "-- "+rs1.getString(2)+" -- "+rs1.getString(3));  
			  }			  
			  
			  
//3.***************Callable Statement************************  
			  System.out.println("3)EXECUTING STORED PROCEDURES");
				 
			  CallableStatement cstmt = conn.prepareCall("{call getusers(?)}");
			  // cstmt.registerOutParameter(1, java.sql.Types.DECIMAL, 3);
			  cstmt.setString(1, "4");
			   // cstmt.executeQuery();
			    
			    
			    ResultSet rs2 = cstmt.executeQuery();
				  
				  while(rs2.next()){
						System.out.println(rs2.getString(1) + "-- "+rs2.getString(2)+" -- "+rs2.getString(3));  
				  }	
			 
//4.********************Add row Insert************************
		/*	  System.out.println("4)INSERT NEW ROW");
				  pstmt = conn.prepareStatement("insert into users values (?,?,?)");
			    pstmt.setString(1, "8");
			    pstmt.setString(2, "London");
			    pstmt.setString(3, "15869");
			    
			    int i=pstmt.executeUpdate();
			    if(i==1){
			    	System.out.println("inserted the record");
			    }
			*/   
			    
			  
		  }catch(Exception e){
			  	e.printStackTrace();
		  }finally{
			  conn.close();
		  }
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
