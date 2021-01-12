<%@ page import="java.sql.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String email = request.getParameter("email");
		if (email.contains("@") && email.contains(".")) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
				PreparedStatement ps = con.prepareStatement("select * from employees where email=?");
				ps.setString(1, email);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					out.print("Unavailable! <img src='unchecked.gif'/>");
				} else {
					out.print("Available! <img src='checked.gif'/>");
				}
			} catch (Exception e) {
				out.print(e);
			}
		} else {
			out.print("Invalid email!");
		}
	%>
</body>
</html>