package com.bk.services;

import java.util.ArrayList;
import java.util.List;

import com.bk.daos.BookstoreDAO;
import com.bk.models.Account;
import com.bk.models.Book;
import com.bk.models.ShoppingCart;
import com.bk.models.User;

public class BookstoreServiceImp implements BookstoreService {

	private BookstoreDAO bookstoreDAO;

	public BookstoreServiceImp(BookstoreDAO bookstoreDAO) {
		super();
		this.bookstoreDAO = bookstoreDAO;
	}

	public List<Book> findAllBook() {
		// TODO Auto-generated method stub
		return this.bookstoreDAO.findAllBook();
	}

	public int addAccount(Account account) {
		// TODO Auto-generated method stub
		return this.bookstoreDAO.addAccount(account);
	}

	public List<Book> findBookByName(String title) {
		// TODO Auto-generated method stub
		return this.bookstoreDAO.findBookByName(title);
	}

	@Override
	public Account userLogin(String email, String password) {
		// TODO Auto-generated method stub
		return this.bookstoreDAO.userLogin(email, password);
	}

	@Override
	public List<ShoppingCart> addBooksToCart(ArrayList<ShoppingCart> cartList) {
		// TODO Auto-generated method stub
		return this.bookstoreDAO.addBooksToCart(cartList);
	};

}
