<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajax Multiplication Table Example</title>
</head>
<body>
<%  
int n=Integer.parseInt(request.getParameter("val"));  
  
for(int i=1;i<=10;i++)  
out.print(n+"*"+i+"="+i*n+"<br>");  
  
%> 
</body>
</html>