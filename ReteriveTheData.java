#Retrieving the data from the database by using Java Database Connectivity.

package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Demo1 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String url = "jdbc:mysql://localhost:3306/abdul";
		String uname = "root";
		String pwd = "abbu123";
		String qry = "Select * from emp where empno = 7369";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(qry);
			while(rs.next())
			{
				int sno = rs.getInt(1);
				String name = rs.getString("ename");
				
				System.out.println(sno + " " + name);
				
			}			
}
}

