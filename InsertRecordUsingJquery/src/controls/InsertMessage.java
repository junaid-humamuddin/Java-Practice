package controls;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import model.ProjectManager;
import dao.Database;

/**
 * Servlet implementation class InsertMessage
 */
@WebServlet("/InsertMessage")
public class InsertMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			Database database = new Database();
			ProjectManager projectManager = new ProjectManager();
			String message = null;
			Connection connection = database.Get_Connection();
			message = projectManager.InsertMessage(connection, request, response);
			if (message != null) {
				out.println("<div>" + message + "</div>");
			} else {
				out.println("false");
			}
		} catch (Exception ex) {
			out.println("Error: " + ex.getMessage());
		} finally {
			out.close();
		}
	}

}