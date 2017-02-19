package com.geeksoft;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// general setting 
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.println("this is my first application");
		writer.println("<br>");
		writer.println("this is get method");
		
		//request gathering 
		
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		// business logics
		
		if(uname.equals("durga")&& upwd.equals("ratan"))
		{
			writer.println("login is success");
			writer.println("this is my user name"+uname);
			writer.println("this is my password"+upwd);

		}
		
		else
		{
			writer.println("Login was fail");
			response.sendError(880,"oops! The entered details are incorrect");
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// general setting 
				response.setContentType("text/html");
				PrintWriter writer = response.getWriter();
				
				writer.println("this is my first application");
				writer.println("<br>");
				writer.println("this is post method");
				
				//request gathering 
				
				String uname = request.getParameter("uname");
				String upwd = request.getParameter("upwd");
				
				// business logics
				
				if(uname.equals("durga")&& upwd.equals("ratan"))
				{
					writer.println("login is success");
					writer.println("this is my user name"+uname);
					writer.println("this is my password"+upwd);
					
					// hyper link example
					//writer.println("<a href = 'https://www.facebook.com'> click here to redirect to fb</a");

				// Response Header Example
					//response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
				//response.setHeader("Location", "https://www.google.com");
				
				// Send Redirect Example
					
					//response.sendRedirect("https://www.facebook.com");
				}
				
				else
				{
					//writer.println("Login was fail");
					
					// send error example
					response.sendError(880,"oops! The entered details are incorrect");

				}

			}

	

}
