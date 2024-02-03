#To retreive all the data from the table.

package com.jdbc;
import java.lang.Exception;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Index 
{

	public static void main(String[] args) throws Exception 
	{
		String url = "jdbc:mysql://localhost:3306/abdul";
		String username = "root";
		String password = "abbu123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		Statement createStatement = con.createStatement();
		ResultSet executeQuery = createStatement.executeQuery("Select * from emp");
		while(executeQuery.next())
		{
			int res = executeQuery.getInt(1);
			String res1 = executeQuery.getString(2);
			String res3 = executeQuery.getString(3);
			int res4 = executeQuery.getInt(4);
			Double res5 = executeQuery.getDouble(6);
			Double res6 = executeQuery.getDouble(7);
			int res7 = executeQuery.getInt(8);
 			System.out.println(res + " " + res1 + " " + res3 + " " + res4 + " " + executeQuery.getDate(5) + " " + res5 + " " + res6 + " " + res7);
		}

	}
}

#To retrieve more than one.

package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DqlQueries 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	Mobile m = new Mobile();
	m.sql();
	}
}
class Mobile 
{
	public void sql() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/abdul";
		String uname = "root";
		String pwd = "abbu123";
		String qry = "Select ename,sal from emp where hiredate > '1981-12-31'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(qry);
		rs.next();
		System.out.print(rs.getString("ename"));
		System.out.println(rs.getString("sal"));
	}
}
