package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogoutServ")
public class LogoutServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter(); 
		    HttpSession session=request.getSession(false);
		    String user=(String) session.getAttribute("username");
		out.print("Logged Out Successfully "+user);  
		System.out.println("Logged Out Successfully "+user);
		  
		 session.invalidate(); 
        RequestDispatcher rd=request.getRequestDispatcher("login.html");  
        rd.include(request,response);  
	}

}
