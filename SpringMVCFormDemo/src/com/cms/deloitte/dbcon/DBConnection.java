package com.cms.deloitte.dbcon;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	
	public static Connection makeConnection()
	{Connection connection =null;
	try {
		FileReader reader = new FileReader("E:\\Workspace\\mydb.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password= properties.getProperty("password");
		
		Class.forName(driver);
		System.out.println("Driver Loaded");
		 connection = DriverManager.getConnection(url,username,password); //local ip address and 1521 is port number oracle works and xe is database
		System.out.println("Connected");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
}

}
