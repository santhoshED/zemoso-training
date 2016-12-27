/*1. Create a class Book which has following members:
	private int bookNo
private String title
private String author
private float price
	Provide getter and setter methods for all the instance variables.
Create a class BookDetails which has the main method. Create an object of the Book class.  Initialize the object by reading inputs for the fields from the user. */

import java.util.*;

public class Book_2{
	private int bookNo;
	private String title;
	private String author;
	private float price;

	private static int bookCount;
	static{
		bookCount=0;
	}

	public int getBookNo(){
		return bookNo;
	}
	public void setBookNo(int value){
		bookNo = value;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String value){
		title = value;
	}
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String value){
		author = value;
	}
	public float getPrice(){
		return price;
	}
	public void setPrice(float value){
		price = value;
	}
	public int getBookCount(){
		return bookCount;
	}
	public Book_2(int bookNo, String title, String author, float price){
		if(title.length()<4)
			System.out.println("Title is too short");
		else
			this.title = title;
		if(price < 5000 && price >1)
			this.price = price;
		else
			System.out.println("invalid price");

		this.bookNo = bookNo;
		this.author = author;
		++this.bookCount;
	}
	public String toString(){
		return("BookNo:"+bookNo+"; Title:"+title+"; Author:"+author+"; Price:"+price);
	}
}