package br.com.projetosaula.meusfilmes.cnn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	static final String url = "jdbc:mysql://localhost:3306/meusfilmes?useTimezone=true&serverTimezone=UTC&useSSL=false";
	static final String user = "root";
	static final String password = "admin";

	public static Connection getMySQLConnection() {
		Connection cnn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cnn = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return cnn;

	}
	

}
