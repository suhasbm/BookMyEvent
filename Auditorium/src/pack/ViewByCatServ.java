package pack;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ViewByCatServ")
public class ViewByCatServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
		String category=request.getParameter("category");
		/*PrintWriter pw=response.getWriter();
		pw.print(category);*/
		ArrayList<Audi> eventList=AudiDAO.getByCategory(category);
		request.setAttribute("eventList", eventList);
		 RequestDispatcher rd=request.getRequestDispatcher("viewCategory.jsp");  
	       rd.forward(request, response); 
	}

}
