package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	public static Connection getH2Connection() throws SQLException{
		Connection con = null;
		try {
			// load the driver
			Class.forName("org.h2.Driver");
			// create connection object
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/collegeappdb", "sushil", "sushil");
			// create the prepared statement object
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return con;
		
	}
}
