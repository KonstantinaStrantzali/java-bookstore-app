package com.bk.daos;

import java.util.ArrayList;
import java.util.List;

import com.bk.models.Account;
import com.bk.models.Book;
import com.bk.models.ShoppingCart;
import com.bk.models.User;

public interface BookstoreDAO {
	
	public int addAccount(Account account);
	public Account userLogin(String email, String password);
	public List<Book> findAllBook();
	public List<Book> findBookByName(String title);

	public List<ShoppingCart> addBooksToCart(ArrayList<ShoppingCart> cartList);
}




