package pack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ConfirmServ")
public class ConfirmServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eventid=request.getParameter("eventid");
		String quantity=request.getParameter("quantity");
		Audi audi=AudiDAO.getEventBean(eventid);
		boolean status=AudiDAO.updateAudi(eventid, quantity);
		if(status)
		{
			request.setAttribute("audi", audi);
			request.setAttribute("quantity", quantity);
			request.setAttribute("eventid", eventid);
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");  
		      rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");  
		      rd.forward(request, response);
		}
		
	}

}
