package com.bk.controllers;
import java.io.IOException;


import com.bk.daos.BookstoreDAOImp;
import com.bk.models.Account;
import com.bk.services.BookstoreService;
import com.bk.services.BookstoreServiceImp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookstoreService bookstoreService = new BookstoreServiceImp(new BookstoreDAOImp());
			
			
	        String email = request.getParameter("email");
			
			String password = request.getParameter("password");

			
			Account loggedInAccount = bookstoreService.userLogin(email, password);
		
			if(loggedInAccount != null) {
				
				String firstname =  loggedInAccount.getName();
				HttpSession session = request.getSession(true);
				
				session.setAttribute("userId", loggedInAccount.getAccount_id());
				session.setAttribute("name", loggedInAccount.getName());
				session.setAttribute("lname", loggedInAccount.getLastName());
				session.setAttribute("email", loggedInAccount.getEmail());
				session.setAttribute("password", loggedInAccount.getPassword());
				
				 request.getRequestDispatcher("successful_reg.jsp").forward(request, response);
				
				
				// Code to store list of students in a session object
				
				session.setAttribute("loggedInAccount", loggedInAccount);	
		
	}
			else {
				
				   response.sendRedirect("login.jsp");	
				}

}
}
