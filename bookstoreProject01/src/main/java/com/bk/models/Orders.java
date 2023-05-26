package com.bk.models;
import java.sql.Date;

public class Orders {
	
	int order_id;
	User user;
	Book Book;
	Date date;
	
	public Orders(int order_id, com.bk.models.Book book,User user, Date date) {
		super();
		this.order_id = order_id;
		Book = book;
		this.date = date;
		this.user = user;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public Book getBook() {
		return Book;
	}

	public void setBook(Book book) {
		Book = book;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}
