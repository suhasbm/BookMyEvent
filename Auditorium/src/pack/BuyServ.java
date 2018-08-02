package pack;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BuyServ")
public class BuyServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eventid=request.getParameter("eventid");
		/*PrintWriter pw=response.getWriter();
		pw.print(eventid);*/
		Audi audi=AudiDAO.getEventBean(eventid);
		request.setAttribute("audi", audi);
		RequestDispatcher rd=request.getRequestDispatcher("buyForm.jsp");  
	      rd.forward(request, response); 
	}

}
