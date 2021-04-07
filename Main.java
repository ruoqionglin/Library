package com.fdmgroup.library;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Library.addBooks("Book1");
		Library.addBooks("Book2");
		Library.addBooks("Book3");
//
//		System.out.println(Library.getBooks());
//
//		Library.borrowBook("Book1");
//
//		System.out.println(Library.getBooks());
//		System.out.println(Library.getBorrow());
//
//		Library.returnBook("Book1");
//
//		System.out.println(Library.getBooks());
		System.out.println(Library.getBorrow());

		ArrayList<String> list = new ArrayList<String>();

		list.add("Book1");
		list.add("Book3");

		// hu
		Customer test1 = new Customer(1, list);

		// System.out.println(test1.getBooks());

		Librarian.bookList(list);
		test1.setBorrowBook(list);

		// System.out.println(test1.getBorrowBook());

		ArrayList<String> returnBook = new ArrayList<String>();

		returnBook.add("Book1");
		test1.removeBooks(returnBook);
		Librarian.returnList(returnBook);

		System.out.println("Customer borrow: " + test1.getBorrowBook());

		System.out.println("Library borrow: " + Library.getBorrow());
	}

}
