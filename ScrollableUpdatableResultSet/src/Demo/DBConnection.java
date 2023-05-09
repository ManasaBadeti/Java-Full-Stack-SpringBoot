package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBConnection 
{
	public static Connection getConnection()
	  {
		Connection con=null;
	      try
	      { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsd", "root","root");
			System.out.println("Connection Established");
	          }
	      catch(Exception e)
	      {
	          System.out.println(e);
	      }
		return con;
	  }
	public static void main(String args[])
	{
		DBConnection dbconn=new DBConnection();
		dbconn.getConnection();
	}

}
