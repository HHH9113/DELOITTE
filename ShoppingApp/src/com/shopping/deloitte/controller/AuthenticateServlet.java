package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;


import jdk.nashorn.internal.ir.RuntimeNode.Request;
import sun.awt.RepaintArea;

/**
 * Servlet implementation class AuthenticateServlet
 */
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		
		String username= request.getParameter("username");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		boolean allreadyVisited=false;
Cookie allcookies[] =request.getCookies();

		
		for(Cookie c: allcookies)
		{
			if(c.getName().equals(username))
			{
				allreadyVisited=true;
				break;
				
			}
			
		}
		
		out.println("<h1> Successfully Authenticated");

		
		if(!allreadyVisited)
		{
		
			
			out.println("<h1> Welcome"+ username + "  you are the new visitors");
			
			Cookie  cookie = new Cookie(username,username);
			response.addCookie(cookie);                                                                                                                                       
		System.out.println("Cookie set");
		}
		
		else {
			
			out.println("<h1><form action='Product'>");
					out.println("<h1>Wife name: <input type = 'text' name='wifeName'>");
			out.println("<h1><input type ='hidden' name='username' value=' username' >");
			
			
			
			out.println("<h1><input type ='submit' value='Enter'>");
			out.println("<h1></form>");
			
			
			
			
			
			
			
			

							
							
					
					
					
					
					
							session.setAttribute("currentBuyer", username);
out.println("<h1> Successfully Authenticated");
out.println("<h1> Welcome"+ username);
out.println("<h1> <a href ='Item.html'>Select Product</a>");

		}
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String username= request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		HttpSession session= request.getSession();
		session.setAttribute("currentBuyer" , username);
		
		if(username.startsWith("T"))
		{
			out.println("<h2> <a href=index.html>item </a>");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Item.html");
			dispatcher.forward(request, response);
		
		}
		
		
		
//		out.println("<h2><a href = Item.html>Item</a>");
	
			
		else	if(username.equals("Admin")) {
				RequestDispatcher dispatcher=request.getRequestDispatcher("Admin");
				dispatcher.forward(request, response);
			}
			else if(username.equals("Guest")){
				RequestDispatcher dispatcher=request.getRequestDispatcher("Guest");
				dispatcher.include(request, response);	
			}else {
			
				response.sendRedirect("loginform.html");
			}
			
				}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
