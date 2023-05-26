package com.bk.models;

public class Book {
	
	int book_id;
	String title;
	String author;
	double price;
	
	public Book(String title,String author, double price, int book_id) {
		
		this.title = title;
		this.author = author;
		this.price = price;
		this.book_id = book_id;
		
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return this.book_id + this.title + this.author + this.price;
	}
	
}
