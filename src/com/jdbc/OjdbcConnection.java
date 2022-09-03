package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OjdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1, Driver Configuration
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2, Setting of Connection
		// DriverManager --C it present in java.sql package

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "Gopi2213@a");

		/*
		 * Url----> jdbc:oracle:thin:@localhost:1521:xe oracle--> Database Name
		 * thin----> driver used
		 * 
		 * @localhost-> IP Address where database is stroed 1521 ------> Port Number
		 * xe---------> Service Provider
		 */

		// Connection ia interface persent in java.sql

		// 3,Writing of query
		String query = "select * from employees";

		//4,Prepare statement
		PreparedStatement prepareStatement = connection.prepareStatement(query);

		
		//5,Execution of query
		ResultSet executeQuery = prepareStatement.executeQuery();

		
		//6, Itration of result
		while (executeQuery.next()) {
			int empId = executeQuery.getInt("EMPLOYEE_ID");
			String first_Name = executeQuery.getString("FIRST_NAME");

			System.out.println(empId + "  " + first_Name);
		}
		connection.close();
	}
}
