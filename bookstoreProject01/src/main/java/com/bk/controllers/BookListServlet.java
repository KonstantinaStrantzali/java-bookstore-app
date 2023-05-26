package com.bk.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.bk.daos.BookstoreDAO;
import com.bk.daos.BookstoreDAOImp;
import com.bk.models.Book;
import com.bk.services.BookstoreService;
import com.bk.services.BookstoreServiceImp;

/**
 * Servlet implementation class BookListServlet
 */
public class BookListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BookstoreDAO dao = new BookstoreDAOImp();
		
        BookstoreService service = new BookstoreServiceImp(dao);
		
		
		List<Book> bookList = service.findAllBook();
		
		HttpSession session = request.getSession(true);
		session.setAttribute("bList", bookList);
		
		System.out.print(bookList);
		
		System.out.print("bList");
		
		request.getRequestDispatcher("book_list.jsp").forward(request, response);
		
	}

	

}

