package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws SQLException {

		String selectQ = "SELECT * FROM COLLEGES";
		String insertQ = " Insert into COLLEGES (REG_NO , ADDRESS, NAME) values(003,'ALLAHABAD','QWERTY');";

		Statement statement = null;

		try {

			Connection connection = JdbcConnection.getH2Connection();

			statement = connection.createStatement();
			statement.executeUpdate(insertQ);
			// get data from DB
			ResultSet rs = statement.executeQuery(selectQ);
		

			// fetch data
			while (rs.next()) {
				String field = rs.getString("NAME");
				String field1 = rs.getString("ADDRESS");
				String collegeCode = rs.getNString("REG_no");
				System.out.println("COLLEGE NAME : " + field);
				System.out.println("ADDRESS : " + field1);
				System.out.println("COLLEGE CODE : " + collegeCode);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
