<%@ page import="java.util.Date" info="composed by junaid"
	isELIgnored="true" language="java" 
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Getting Started with JSPs</title>
</head>
<body>

	<%@ include file="header.html"%>
	<%
		String name = request.getParameter("uname");
		out.print("welcome " + name);
	%>
	<br>
	<hr>
	Today is:
	<%=new Date()%>
	<hr>
	Current Time:
	<%=java.util.Calendar.getInstance().getTime()%>
	<hr>
	<%="Welcome " + request.getParameter("uname")%>
	<br>
	<br>
	<%!int data = 50;%>
	<%="Value of the variable is:" + data%>
	<br>
	<br>
	<%!int cube(int n) {
		return n * n * n;
	}%>
	<%="Cube of 3 is:" + cube(3)%>
	<br>
	<br>
	<%="getting servlet info  :" + getServletInfo()%>
	<!-- used to retrieve the information of a jsp page -->
	<br>
	<hr>
	<%-- <%= 100/0 %> --%>

</body>
</html>