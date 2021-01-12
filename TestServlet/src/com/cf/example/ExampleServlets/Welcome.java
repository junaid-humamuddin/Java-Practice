package com.cf.example.ExampleServlets;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Welcome() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		out.print("<br>");
		out.print("<br>");
		String n = request.getParameter("userName");
		out.print("<p style=\"color:green;\"><b>Welcome " + n);
		out.print("<br>");
		out.print("<br>");
		RequestDispatcher rd = request.getRequestDispatcher("/CheckFile.html");
		rd.include(request, response);
		String f = request.getParameter("file");

		if (null != f) {
			if (f.equals("a")) {
				File file = new File("D://a.txt");
				String a = file.getAbsolutePath();
				out.println("<a href='" + a + "' download>Click to View</a>");
			} else if (f.equals("b")) {
				File file = new File("D://b.pdf");
				String b = file.getAbsolutePath();
				b = b.replace("\\", "/");
				out.println("<a href='" + b + "' download>Click to View</a>");
			} else if (f.equals("c")) {
				File file = new File("d://c.docx");
				// String c=file.getAbsolutePath();
				ServletOutputStream stream = null;
				BufferedInputStream buf = null;
				try {
					stream = response.getOutputStream();
					// set response headers
					response.setContentType("application/msword");
					response.setDateHeader("Expires", 0);
					response.addHeader("Content-Disposition", "attachment; filename=c.docx");
					response.setContentLength((int) file.length());
					buf = new BufferedInputStream(new FileInputStream(file));
					int readBytes = 0;
					while ((readBytes = buf.read()) != -1)
						stream.write(readBytes);
					// out.println("<a href='"+c+"' download>Click to View</a>");

				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (f.equals("d")) {
				File file = new File("D://d.pptx");
				String d = file.getAbsolutePath();
				out.println("<a href='" + d + "' download>Click to View</a>");
			} else {
				out.println("No Such File Exists");
			}
		}
		/*
		 * RequestDispatcher rd_g1 = request.getRequestDispatcher("/SearchIndex.html");
		 * 
		 * rd_g1.forward(request, response);
		 * 
		 * 
		 * RequestDispatcher rd_g2 = request.getRequestDispatcher("GoogleSearcher");
		 * rd_g2.forward(request, response);
		 */

	}

}
