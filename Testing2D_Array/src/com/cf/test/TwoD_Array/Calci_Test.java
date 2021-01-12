package com.cf.test.TwoD_Array;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calci
 */
@WebServlet("/Calci")
public class Calci_Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Calci_Test() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Scanner sc = new Scanner(System.in);
		out.println("<h1 style=\"color:grey;\">Result page</h1>");
		int[][] array = new int[3][2];
		String[] op = new String[3];
		int result;
		/*for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 2; i++) {
				array[i][j] = Integer.parseInt(request.getParameter("n" + String.valueOf(i) + String.valueOf(j)));
			}
		}*/
		for (int k = 0; k < op.length; k++) {
			op[k] = request.getParameter("op" + String.valueOf(k + 1));
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 2; i++) {
				array[i][j] = Integer.parseInt(request.getParameter("n" + String.valueOf(i) + String.valueOf(j)));
				op[i] = request.getParameter("op" + String.valueOf(i + 1));
				// Integer arrayObj = new Integer(array.length);
				// if (arrayObj != null) {
				if (op[i] == op[1]) {
					switch (op[1]) {
					case "+":
						result = array[i][j] + array[i][j];
						out.println("<h2 style=\"color:red;\"><b>Addition is</h2>" + "<h2>" + result);
						break;
					case "-":
						result = array[i][j] - array[i][j];
						out.println("<h2 style=\"color:red;\"><b>Subtraction is</h2> " + "<h2>" + result);
						break;
					case "*":
						result = array[i][j] * array[i][j];
						out.println("<h2 style=\"color:red;\"><b>Multiplication is</h2> " + "<h2>" + result);
						break;
					}
					// }
				}
				if (op[i] == op[2]) {
					switch (op[2]) {
					case "+":
						result = array[i][j] + array[i][j];
						out.println("<h2 style=\"color:red;\"><b>Addition is</h2>" + "<h2>" + result);
						break;
					case "-":
						result = array[i][j] - array[i][j];
						out.println("<h2 style=\"color:red;\"><b>Subtraction is</h2> " + "<h2>" + result);
						break;
					case "*":
						result = array[i][j] * array[i][j];
						out.println("<h2 style=\"color:red;\"><b>Multiplication is</h2> " + "<h2>" + result);
						break;
					}
					// }
				}
				if (op[i] == op[3]) {
					switch (op[3]) {
					case "+":
						// if (array[i][1] == array[1][1] && array[i][2] == array[1][2]) {
						result = array[i][j] + array[i][j];
						out.println("<h2 style=\"color:red;\"><b>Addition is</h2>" + "<h2>" + result);
						// }
						break;
					case "-":
						// if (array[i][1] == array[2][1] && array[i][2] == array[2][2]) {
						result = array[i][j] - array[i][j];
						out.println("<h2 style=\"color:red;\"><b>Subtraction is</h2> " + "<h2>" + result);
						// }
						break;
					case "*":
						// if (array[i][1] == array[3][1] && array[i][2] == array[3][2]) {
						result = array[i][j] * array[i][j];
						out.println("<h2 style=\"color:red;\"><b>Multiplication is</h2> " + "<h2>" + result);
						// }
						break;
					}					
					// }
				}
				out.print("");
			}
			out.close();
			sc.close();
		}
	}
}