<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@include file="Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="css/img/light.jpg">
	<h3>Search by Category</h3>
	<p></p>
	<form action="ViewByCatServ" method="get">
		<select name="category">
			<option value="drama">Drama</option>
			<option value="dance">Dance</option>
			<option value="music">Music</option>
		</select> <br> <br>
		  <button type="submit">Search </button>
			
	</form>
		<p></p>
			<p></p>
				<p></p>
				<hr>
				<a href="ViewServlet"><button>View all Events</button></a>
</body>
 <%@include file="Footer.jsp" %>
</html>