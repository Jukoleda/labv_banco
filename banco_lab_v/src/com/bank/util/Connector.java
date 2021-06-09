package com.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	private static String CONNECTION_PATH = "jdbc:mysql://localhost:3306/med_bank?serverTimezone=UTC&user=";
	private static String USER = "med_bank_adm";
	private static String PASS = "med_bank_adm";
	public static Connection connection;
	public static Connection open() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(CONNECTION_PATH + USER + "&password=" + PASS + "&allowPublicKeyRetrieval=true&useSSL=false");
	}
	public static void close() throws SQLException {
		if(connection != null) {
			connection.close();
		}	
		connection = null;
	}
		
	
}
