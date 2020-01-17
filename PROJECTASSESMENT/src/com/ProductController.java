package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int productId = Integer.parseInt(request.getParameter("pID"));
		String productName = request.getParameter("pNAME");
		int productPrice = Integer.parseInt(request.getParameter("price"));
		int qoh =Integer.parseInt(request.getParameter("qoa"));
		
		HttpSession session = request.getSession();
		session.setAttribute("pId", pID);
		session.setAttribute("pNAME", pNAME);
		session.setAttribute("price", price);
		session.setAttribute("QOA", qoa);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ProductDetails.jsp"); //directly redirect to pages number by number
		dispatcher.forward(request, response);
	
	
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
