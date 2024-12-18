package controls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import dao.FetchData;
import dto.AuditLogGetSet;

/**
 * Servlet implementation class PopulateTable
 */
@WebServlet("/PopulateTable")
public class PopulateTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PopulateTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ArrayList<AuditLogGetSet> auditLogGetSet=new ArrayList<AuditLogGetSet>();
		auditLogGetSet=FetchData.getAllAuditLogs();
		Gson gson=new Gson();
		JsonElement element=gson.toJsonTree(auditLogGetSet, new TypeToken<List<AuditLogGetSet>>() {}.getType());
		
		JsonArray jsonArray=element.getAsJsonArray();
		response.setContentType("application/json");
		response.getWriter().print(jsonArray);
		
	}

}
