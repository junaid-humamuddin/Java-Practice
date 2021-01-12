package com.cf.example.HitCount;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hitcount
 */
@WebServlet("/Hitcount")
public class Hitcount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int hitCount; 
	
	public void init() {
		
		 hitCount = 0;
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hitcount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		hitCount++;
		PrintWriter out = response.getWriter();
		out.print("<h3> total number of hits are: "+hitCount);
	}
	
	 public void destroy() { 
	      
	   }

}
