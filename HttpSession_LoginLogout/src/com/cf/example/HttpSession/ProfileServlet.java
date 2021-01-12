package com.cf.example.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		   response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        request.getRequestDispatcher("link.html").include(request, response);  
	          
	        HttpSession session=request.getSession(false);  
	        if(session!=null){  
	        String name=session.getAttribute("name").toString();  
	        /*An attribute in servlet is an object that can be set, get or removed from one of the following scopes:

	            request scope
	            session scope
	            application scope*/

	        out.print("Hello, "+name+" Welcome to Profile");  
	        }  
	        else{  
	            out.print("Please login first");  
	            request.getRequestDispatcher("login.html").include(request, response);  
	        }  
	}

}
