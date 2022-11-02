package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.Book;
import com.xworkz.omkar.Pustaka;

public class PustakRunner {

	public static void main(String[] args) {

		Book book = new Book(5, 4, "Valmiki", 100, 200, "Pooja BookShop", "Hospet", 583101, "History", 500);
		Pustaka pustak = new Pustaka();
		book.showOff();
		pustak.useBook(book);
	
	}

}
