package com.riceseller.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static String mySqlJdbcDriver = "com.mysql.jdbc.Driver";

	public static void main(String[] args) throws Exception {
		System.err.println(getConnection());
	}

	public static Connection getConnection() throws Exception {

		Class.forName(mySqlJdbcDriver);
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/test", "root", "root");

		return connection;

	}

}
