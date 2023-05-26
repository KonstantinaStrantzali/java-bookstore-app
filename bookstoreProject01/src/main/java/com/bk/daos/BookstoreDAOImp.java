package com.bk.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import com.bk.models.Account;
import com.bk.models.Book;
import com.bk.models.ShoppingCart;

import com.bk.utils.DatabaseConnection;


public class  BookstoreDAOImp implements BookstoreDAO{
	
	private List<Book> bookList = new ArrayList<>();
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;

	
	public List<Book> findAllBook() {
	
		this.con = DatabaseConnection.getMyDBConnection();
		try {
		
		  this.pst = this.con.prepareStatement("SELECT * from book");  
		  this.rs = this.pst.executeQuery();    
		  while(this.rs.next()) {
			  Book e = new Book( this.rs.getString("title"),
	  					this.rs.getString("author"),
	  					this.rs.getDouble("price"),
						this.rs.getInt("book_id")
						);
			  	  	bookList.add(e);
			  	  	
			  }	  	
		}
		catch(SQLException e){
            System.out.println(e);
		}	

	
	
	return this.bookList;
}
	
	public List<Book> findBookByName(String title){
		
		this.con = DatabaseConnection.getMyDBConnection();
		try {
		
		  this.pst = this.con.prepareStatement("SELECT * from book WHERE title = ?"); 
		  this.pst.setString(1, title);
			
			
			
			this.rs = this.pst.executeQuery();
		
			 while(this.rs.next()) {
				  
				  Book b = new Book(this.rs.getString("title"),
						  					this.rs.getString("author"),
						  					this.rs.getDouble("price"),
				  							this.rs.getInt("book_id")
				  							);
						  					
				  bookList.add(b);
				  
			 }	  		
		}
		catch(SQLException e){
            System.out.println(e);
		}
	
	return this.bookList;	
		
	}
				

	public int addAccount(Account account){
		
		int i = 0;
		
		this.con = DatabaseConnection.getMyDBConnection();
			
		try {
		
		this.pst = this.con.prepareStatement("INSERT into account(name, lastName, email, password) VALUES(?,?,?,?)");
		
		//you might need to add id for having equal fields in your data
	
		this.pst.setString(1,account.getName());
		this.pst.setString(2,account.getLastName());
		this.pst.setString(3,account.getEmail());
		this.pst.setString(4,account.getPassword());
		
		
	i = this.pst.executeUpdate();// This is used to RUN INSERT, UPDATE and DELETE
		
		
		}
		catch(SQLException e){
            System.out.println(e);
		}
		
		return i;
		
	
	}

	public Account userLogin(String email, String password) {
	this.con = DatabaseConnection.getMyDBConnection();
		
		Account account = null;
		
		try {
			
			this.pst = this.con.prepareStatement("SELECT * from account WHERE email= ? AND password = ?");
			
			
			this.pst.setString(1, email);
			this.pst.setString(2, password);
			
			
			this.rs = this.pst.executeQuery();
			
			
			if(this.rs.next()) { // Login Success
				account = new Account(rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5));
				
				return account;
			}	
		
			
					
		}
		catch(SQLException ex){
            System.out.println(ex);
		}
		
		return null;
	}

	
	
	
	  public List<ShoppingCart> addBooksToCart(ArrayList<ShoppingCart> cartList) {
	        List<ShoppingCart> bookList = new ArrayList<>();
	        try {
	            if (cartList.size() > 0) {
	                for (ShoppingCart item : cartList) {
	                	
	                	this.pst = this.con.prepareStatement("SELECT * from book WHERE book_id =?"); 
	                	  this.pst.setInt(1, item.getBook().getBook_id());
	                	
	           
	                    rs = pst.executeQuery();
	                    while (rs.next()) {
	                    	this.pst = this.con.prepareStatement("INSERT into cart(book_id, title, author, price) VALUES(?,?,?,?)");
	                		
	                		//you might need to add id for having equal fields in your data
	                		this.pst.setInt(1,item.getBook().getBook_id());
	                		this.pst.setString(2,item.getBook().getTitle());
	                		this.pst.setString(3,item.getBook().getAuthor());
	                		this.pst.setDouble(4,item.getBook().getPrice());
	                		
	                        
	                    }
	                    

	                }
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println(e.getMessage());
	        }
	        return bookList;
	    }
	}







	


	
