package com.xworkz.omkar;

public class Pustaka {

	public 	Book book;
	
	public void useBook(Book book)
	{
		System.out.println(book.getBookName());
		book.setBookName("Mahabharat");
		System.out.println("after updating :"+book.getBookName());
	}
}
