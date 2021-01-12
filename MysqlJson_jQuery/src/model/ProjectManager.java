package model;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Project;
import dto.MessageObjects;

public class ProjectManager {
	/*public String InsertMessage(Connection connection, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// Previous Post
	}*/

	public ArrayList GetMessages(Connection connection, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ArrayList messages = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition
			Project project = new Project();
			messages = project.GetMessages(connection, request, response);
		} catch (Exception e) {
			throw e;
		}
		return messages;
	}

}