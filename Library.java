package com.fdmgroup.library;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	private static HashMap<String, Integer> books = new HashMap<String, Integer>();

	private static ArrayList<String> borrow = new ArrayList<String>();

	public static ArrayList<String> getBorrow() {
		return borrow;
	}

	public static HashMap<String, Integer> getBooks() {
		return books;
	}

	public static void setBorrow(ArrayList<String> borrow) {
		Library.borrow = borrow;
	}

	public static void setBooks(HashMap<String, Integer> books) {
		Library.books = books;
	}

	public static void addBooks(String title) {
		books.put(title, 1);
	}

	public static int checkBook(String title) {
		if (books.get(title) != null) {
			int num = books.get(title);
			return num;
		} else {
			return 0;
		}
	}

	public static void borrowBook(String title) {
		int available = checkBook(title);

		if (available == 1) {
			books.put(title, 0);
			borrow.add(title);
		} else {
			System.out.println("Book is not available");
		}
	}

	public static void returnBook(String title) {
		int available = checkBook(title);

		if (available == 0) {
			books.put(title, 1);
			borrow.remove(borrow.indexOf(title));
			System.out.println(title + " has been returned");
		} else {
			System.out.println("Book was not return");
		}

		// System.out.println("Inside Library: borrow books " + borrow);
	}
}
