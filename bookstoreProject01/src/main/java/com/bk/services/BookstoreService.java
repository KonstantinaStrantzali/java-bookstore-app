package com.bk.services;
import java.util.ArrayList;
import java.util.List;
import com.bk.models.Account;
import com.bk.models.Book;
import com.bk.models.ShoppingCart;
import com.bk.models.User;

public interface BookstoreService {
	public int addAccount(Account account);
	public List<Book> findAllBook();
	public List<Book> findBookByName(String title);
	public Account userLogin(String email, String password);
	public List<ShoppingCart> addBooksToCart(ArrayList<ShoppingCart> cartList);
}
