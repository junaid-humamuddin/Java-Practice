package dao;

import java.sql.*;
import java.util.*;

import dto.AuditLogGetSet;

public class FetchData {
	
	public static Connection connection=null;
	
	private static Connection getConnection() throws Exception {
		try {
			String connectionURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "root", "root");
			return connection;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static ArrayList<AuditLogGetSet> getAllAuditLogs(){
		
		ArrayList<AuditLogGetSet> auditList=new ArrayList<AuditLogGetSet>();
		
		try {
			
			connection=FetchData.getConnection();
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from auditlog");
			
			while(rs.next()) {
				AuditLogGetSet auditLogGetSet=new AuditLogGetSet();
				auditLogGetSet.setDao_name(rs.getString("dao_name"));
				auditLogGetSet.setDao_position(rs.getString("dao_position"));
				auditLogGetSet.setDate_appointed(rs.getString("date_appointed"));
				auditLogGetSet.setDownload_pdf(rs.getString("download_pdf"));
				auditLogGetSet.setInit_training_completed_date(rs.getString("init_training_completed_date"));
				auditLogGetSet.setLast_annual_refresher_training_completed_date(rs.getString("last_annual_refresher_training_completed_date"));
				auditLogGetSet.setTraining_overdue(rs.getInt("training_overdue"));
				auditLogGetSet.setTraining_record_link(rs.getString("training_record_link"));
				auditList.add(auditLogGetSet);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return auditList;
	}
}
