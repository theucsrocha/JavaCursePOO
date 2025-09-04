package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.ResultSet;

public class DB {

	private static Connection conn = null;

	public static Connection getConnection() {
		if (conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				String user = props.getProperty("user"); // Get the username
				String password = props.getProperty("dbpassword"); // Get the password

				// Pass the URL, username, and password separately
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}

	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}

	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DbException(e.getMessage());
			}
		}
	}

	public static void closeStatemant(Statement st) {
		if(st != null) {
			try {
				st.close();	
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void closeResulSet(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();	
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
}
