package JDBC;

import java.sql.*;

public class PreparedStatement1 {

	public static void main(String[] args) {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");

			// 2. Prepare statement
			myStmt = myConn.prepareStatement("select * from employees where salary > ? and department=?");

			// 3. Set the parameters
			myStmt.setDouble(1, 80000);
			myStmt.setString(2, "Legal");

			// 4. Execute SQL query
			myRs = myStmt.executeQuery();

			// 5. Display the result set
			display(myRs);

			//
			// Reuse the prepared statement: salary > 25000, department = HR
			//

			System.out.println("\n\nReuse the prepared statement:  salary > 25000,  department = HR");

			// 6. Set the parameters
			myStmt.setDouble(1, 25000);
			myStmt.setString(2, "HR");

			// 7. Execute SQL query
			myRs = myStmt.executeQuery();

			// 8. Display the result set
			display(myRs);

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			if (myRs != null) {
				try {
					myRs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (myStmt != null) {
				try {
					myStmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (myConn != null) {
				try {
					myConn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static void display(ResultSet myRs) throws SQLException {
		while (myRs.next()) {
			String lastName = myRs.getString("last_name");
			String firstName = myRs.getString("first_name");
			double salary = myRs.getDouble("salary");
			String department = myRs.getString("department");

			System.out.printf("%s, %s, %.2f, %s\n", lastName, firstName, salary, department);
		}
	}
}
