package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CheckOutServ")
public class CheckOutServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String quantity=request.getParameter("quantity");
		String eventid=request.getParameter("eventid");
		/*PrintWriter pw=response.getWriter();
		pw.print(quantity);
		pw.print(eventid);*/
		
		
		Audi audi=AudiDAO.getEventBean(eventid);
		
			request.setAttribute("audi", audi);
			request.setAttribute("quantity", quantity);
			request.setAttribute("eventid", eventid);
			RequestDispatcher rd=request.getRequestDispatcher("exit.jsp");  
		      rd.forward(request, response);
		}
		
	}


