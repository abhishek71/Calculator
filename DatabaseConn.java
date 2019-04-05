package com.calculator;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;


public class DatabaseConn {
	
	 public static void getConnection() throws Exception {
			Properties prop = null;
			String query="";
			FileInputStream inStream = null;
			Connection connection = null;
			try {
				prop = new Properties();
				inStream = new FileInputStream("DB.properties");
				prop.load(inStream);
				String url = prop.getProperty("Url");
				String user = prop.getProperty("User_Name");
				String pass = prop.getProperty("Password");
				String driverclass = prop.getProperty("Driver");
				
					// Class.forName("oracle.jdbc.driver.OracleDriver");
					Class.forName(driverclass);
					connection = DriverManager.getConnection(url, user, pass);
					query="INSERT INTO SUM_OF_NUMBERS(VALUE1, VALUE2, TOTAL_SUM) VALUES (?, ?, ?)";
					PreparedStatement stmt=connection.prepareStatement(query);
			        stmt.setInt(1, CalculatorSum.value1);
			        stmt.setInt(2, CalculatorSum.value2);
			        stmt.setInt(3, CalculatorSum.sum);
			        stmt.executeUpdate();
			} catch (Exception e) {
				e.getMessage();
				throw e;
			}
			
		}
		 
	
	
	
}
