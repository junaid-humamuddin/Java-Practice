package JDBC;

import java.sql.*;

public class DeleteRecord {

	public static void main(String[] args) throws Throwable {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junaid", "root", "root");
		Statement stmt = con.createStatement();
		int result = stmt.executeUpdate("delete from emp where id=111");
		System.out.println(result + " records affected");
		con.close();
	}

}
