package com.bk.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.bk.daos.BookstoreDAOImp;
import com.bk.models.ShoppingCart;
import com.bk.services.BookstoreService;
import com.bk.services.BookstoreServiceImp;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet(name = " AddToCartServlet", urlPatterns = "/add-to-cart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try (PrintWriter out = response.getWriter()) {
//        	out.print("add to cart servlet");
			BookstoreService bookstoreService = new BookstoreServiceImp(new BookstoreDAOImp());
			
            ArrayList<ShoppingCart> cartList = new ArrayList<>();
            bookstoreService.addBooksToCart(cartList);
            
            
            
            int id = Integer.parseInt(request.getParameter("id"));
            ShoppingCart cm = new ShoppingCart();
            cm.getBook().setBook_id(id);
           
            HttpSession session = request.getSession();
            ArrayList<ShoppingCart> cart_list = (ArrayList<ShoppingCart>) session.getAttribute("cart-list");
            if (cart_list == null) {
                cartList.add(cm);
                session.setAttribute("cart-list", cartList);
                response.sendRedirect("index.jsp");
            } else {
                cartList = cart_list;

                boolean exist = false;
                for (ShoppingCart c : cart_list) {
                    if (c.getBook().getBook_id() == id) {
                        exist = true;
                        out.println("<h3 style='color:crimson; text-align: center'>Item Already in Cart. <a href='cart.jsp'>GO to Cart Page</a></h3>");
                    }
                }

                if (!exist) {
                    cartList.add(cm);
                    response.sendRedirect("index.jsp");
                }
            }
        }
	}
	}


