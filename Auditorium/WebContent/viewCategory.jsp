<%@page import="pack.Audi"%>
<%@page import="java.util.ArrayList"%>
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
	
	<table border="1">
		<tr>
			<th>Event Name</th>
			<th>Event Category</th>
			<th>Ticket Price</th>
			<th>Seats Available</th>
			<th>Event Date</th>
			<th>Buy</th>
		</tr>
		
		<%
		ArrayList<Audi> eventList=(ArrayList<Audi>)request.getAttribute("eventList");
		for (Audi audi : eventList) {
			out.print("<tr>");
			out.print("<td>"+audi.getEventname()+"</td>");
			out.print("<td>"+audi.getCategory()+"</td>");
			out.print("<td>"+audi.getTicketprice()+"</td>");
			out.print("<td>"+audi.getQuantity()+"</td>");
			out.print("<td>"+audi.getEventdate()+"</td>");
			if(audi.getQuantity()<=0)
			{
				out.print("<td>Sold out</td>");
			}
			else
			{
			out.print("<td><a href='BuyServ?eventid="+audi.getEventid()+"' >Buy</a></td>");
			}
			out.print("</tr>");
		}
		
		%>

	</table>
	<p></p>
	<a href="form.jsp"><button>back</button></a>
</body>
 <%@include file="Footer.jsp" %>
</html>