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
	<a href="buyForm.jsp"><button>back</button></a>
	<p></p>
	<%
		Audi audi=(Audi)request.getAttribute("audi");
		String quantity=(String)request.getAttribute("quantity");
		out.print("<h3>Your Tickets are booked successfully</h3>" );
		out.println("<p></p>");
		out.print("<h4>Ticket Details are</h4>");
		out.println("<p></p>");
		out.print("Event Name : "+audi.getEventname());
		out.println("<p></p>");
		out.print("Category :"+audi.getCategory());
		out.println("<p></p>");
		out.print("Event Date: "+audi.getEventdate());
		out.println("<p></p>");
		out.print("Number of tickets Booked: "+quantity);
		out.println("<p></p>");
		out.println("<p></p>");
		out.println("<p></p>");
		int result = Integer.parseInt(quantity);
		out.println("<h2>Total Price is "+result*audi.getTicketprice()+"</h2>");
		String eventid=(String)request.getAttribute("eventid");
	%>
	<form action="ConfirmServ" method="get">
	<input type="hidden" name="eventid" value=<%=eventid%>>
	<input type="hidden" name="quantity" value=<%=quantity%>>
		<button type="submit">Confirm</button>
	</form>
</body>
 <%@include file="Footer.jsp" %>
</html>