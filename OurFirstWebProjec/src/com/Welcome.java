package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }
int counter=0;
	
public void display()
{
	
System.out.println("Display called");

}

public void init()
{
	
System.out.println("Init is called");

}
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String usern=request.getParameter("username");
	String pass = request.getParameter("password");
	
	
	response.getWriter().println("<h1> Welcome to my website </h1>");
	response.getWriter().println("<h1> you are visitor number </h1>" + counter);
	response.getWriter().println("<a href='loginform.html'>login" +  "      "+     counter);
	}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	


	String usern=request.getParameter("username");
	String pass = request.getParameter("password");
	
	
	response.getWriter().println("<h1> Welcome to my website </h1>");
	response.getWriter().println("<h1> you are visitor number </h1>" + counter);
	response.getWriter().println("<a href='loginform.html'>login" +  "      "+     counter);
	
}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		counter++;
		System.out.println("service called");
		
		
		String usern=request.getParameter("username");
		String pass = request.getParameter("password");
		
		
		response.getWriter().println("<h1> Welcome to my website </h1>");
		response.getWriter().println("<h1> you are visitor number </h1>" + counter);
		response.getWriter().println("<a href='loginform.html'>login" +  "      "+     counter);
		
		
	}

	
	
	
	public void destroy() {
		// TODO Auto-generated method stub

		System.out.println("destroyed called");
	}
}

