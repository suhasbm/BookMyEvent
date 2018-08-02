<%@page import="pack.Audi"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@include file="Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BuildMyEvent</title>
</head>
<body background="css/img/light.jpg">
		<%
			Audi audi=(Audi)request.getAttribute("audi");
			out.println("<h1>Event Name "+audi.getEventname()+"</h1>");
			out.println("<p></p>");
			out.println("Price of the ticket is "+audi.getTicketprice());
			out.println("<p></p>");
			out.print("Seats available :"+audi.getQuantity());
		
		%>
		<p></p>
		<p></p>

	<form action="CheckOutServ">
		Number of Seats : <input type="number" name="quantity"
			min="1" max=<%=audi.getQuantity()%>><br> 
			
			<input type="hidden" name="eventid" value=<%=audi.getEventid()%>>
			<%--  <select name="eventid">
			<option value=<%=audi.getEventid() %>><%=audi.getEventname() %></option>
			</select> <br> <br> --%> 
			<button type="submit">Book </button>
	</form>
	<p></p>
	<a href="form.jsp"><button>back</button></a>
</body>
 <%@include file="Footer.jsp" %>
</html>