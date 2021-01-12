package com.cf.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
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
public class Calci extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Calci() {
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
		Integer[][] array = new Integer[3][2];
		String[] op = new String[3];
		Operation operation = new Operation();
		Transaction transaction = new Transaction();
		List<Operation> operationsList = new ArrayList<>();
	//	Modules m = new Modules();
		int result;
		int i, j;
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= 2; j++) {
				array[i - 1][j - 1] = Integer
						.parseInt(request.getParameter("n" + String.valueOf(i) + String.valueOf(j)));
				op[i - 1] = request.getParameter("op" + String.valueOf(i));
			}
			switch (op[i - 1]) {
			case "+":
				result = array[i - 1][0] + array[i - 1][1];
				out.println("<h2 style=\"color:red;\"><b>Addition is</h2>" + "<h2>" + result);
				operation.setOpName(OperationNames.ADDITION.name());
				operation.setLeftOperand(array[i - 1][0]);
				operation.setRightOperand(array[i - 1][1]);
				operation.setResult(result);
				operationsList.add(operation);
				transaction.setOperationsList(operationsList);
				break;
			case "-":
				result = array[i - 1][0] - array[i - 1][1];
				out.println("<h2 style=\"color:red;\"><b>Subtraction is</h2> " + "<h2>" + result);
				operation.setOpName(OperationNames.SUBTRACTION.name());
				operation.setLeftOperand(array[i - 1][0]);
				operation.setRightOperand(array[i - 1][1]);
				operation.setResult(result);
				operationsList.add(operation);
				transaction.setOperationsList(operationsList);
				break;
			case "*":
				result = array[i - 1][0] * array[i - 1][1];
				out.println("<h2 style=\"color:red;\"><b>Multiplication is</h2> " + "<h2>" + result);
				operation.setOpName(OperationNames.MULTIPLICATION.name());
				operation.setLeftOperand(array[i - 1][0]);
				operation.setRightOperand(array[i - 1][1]);
				operation.setResult(result);
				operationsList.add(operation);
				transaction.setOperationsList(operationsList);
				break;
			default:
				out.println("<h4>Calci under construction</h4>");
			}
			// }
		}
		out.close();
		sc.close();
		/*m.ser();*/
		try {
			FileOutputStream fs = new FileOutputStream("D://Junaid//CalculatedTransactions_" + System.currentTimeMillis() + ".ser");
			ObjectOutputStream outputStream = new ObjectOutputStream(fs);
			outputStream.writeObject(transaction);
			outputStream.flush();
			outputStream.close();
			System.out.println("successful serialization");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}