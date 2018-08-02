<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BuildMyEvent</title>
</head>
<body>
	<%
	HttpSession s=request.getSession(false);
    String username=(String) s.getAttribute("username");
	%>
	<center><h1>BookMyEvent</h1></center>
	<div align="right">
	<%

    out.print("Logged in as: "+username.toUpperCase());
	out.print("<form method=\"get\" action=\"/Auditorium/LogoutServ\">\r\n" + 
			"    <button type=\"submit\">Log Out</button>\r\n");
	
	out.println("</form>");
	%>
	</div>
	<hr>
</body>
</html>