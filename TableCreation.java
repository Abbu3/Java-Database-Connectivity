#Create the table in the MySQL database by using Java Database Connectivity.
package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Mobiletable 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String url = "jdbc:mysql://localhost:3306/abdul";
		String uname = "root";
		String pwd = "abbu123";
		String qry = "Create table mobile1 (sno int primary key, bname varchar(20), price decimal(7,2))";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pwd);
		Statement st = con.createStatement();
		st.executeUpdate(qry);	
	}
}
