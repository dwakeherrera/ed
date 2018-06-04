package org.institutoserpis.ed;

import java.sql.*;

public class HolaMundo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("org.sqlite.JDBC");
		Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");

		connection.close();
		System.out.println("Hola mundo desde eclipse con gradle");
	}
}
