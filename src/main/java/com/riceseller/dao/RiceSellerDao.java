package com.riceseller.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RiceSellerDao {
	
	private static String mySqlJdbcDriver = "com.mysql.jdbc.Driver";
    private static String dbName = "TIGER";
	
	
	private void createDB() throws Exception {
		Class.forName(mySqlJdbcDriver);
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/test", "root", "root");
		Statement s = connection.createStatement();
        int Result = s.executeUpdate("CREATE DATABASE "+dbName);

	}

}
