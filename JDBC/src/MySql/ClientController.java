package MySql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClientController 
{
	public static void main(String args[])
	{
	try
	{
	Connection con=null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver Class Loaded");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsd", "root","root");
	System.out.println("Connection Established");

	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
}
