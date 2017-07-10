package com.java.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;  

class MyConnection {
	

public  void main(String args[]) throws SQLException {  
	
	Connection con=null;

	
try{  
Class.forName("com.mysql.jdbc.Driver").newInstance();  
  con=DriverManager.getConnection( "jdbc:mysql:@localhost:3306:PracticeDB","root","root");  
   System.out.println("connected");
   Statement smt=con.createStatement();
 /*insert*/
   smt.executeUpdate("INSERT INTO DemoTest(id,name),  Valuess(1,'RAVI')");
   /*update*/
   smt.executeUpdate("update DemoTest set id=101 where name='RAVI'");
   
   /*read  records*/
   ResultSet rs = smt.executeQuery("select * from DemoTest");
   while(rs.next()){
       System.out.println("id : " + rs.getInt("id") + ", name : " + rs.getString("name") );
   }
   /*Delete*/
   smt.executeUpdate("delete from DemoTest where name='RAVI'");
 
}
catch(Exception e){ 
	System.out.println(e);
	} 
finally{
	con.close(); 
}
}  

		
		}

