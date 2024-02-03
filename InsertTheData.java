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
		String qry = "insert into mobile1 values(1,'Abdul', 2500.87)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pwd);
		Statement st = con.createStatement();
		st.executeUpdate(qry);	
		System.out.println("Column has been inserted into the table");

	}
}
