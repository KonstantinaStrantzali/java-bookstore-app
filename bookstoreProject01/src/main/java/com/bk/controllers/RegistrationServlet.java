package com.bk.controllers;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.bk.models.Account;
import com.bk.models.User;

import java.io.IOException;

import com.bk.daos.BookstoreDAOImp;
import com.bk.services.BookstoreService;
import com.bk.services.BookstoreServiceImp;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname  = request.getParameter("name");
		String lastName  = request.getParameter("lastName");
		String email   = request.getParameter("email");
		String password   = request.getParameter("password");
		
		
		
		// Create Service class object 
		
		BookstoreService bookstoreService = new BookstoreServiceImp(new BookstoreDAOImp());
		
		
		int i = bookstoreService.addAccount(new Account(fname, lastName, email, password));
	
		
		if(i > 0) {
			
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("register.jsp").forward(request, response);;
		}
		
		System.out.println("Registration Success");
		
		
	}

}
