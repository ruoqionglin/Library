package com.fdmgroup.library;

import java.util.ArrayList;

public class Customer {

	private int customerId;
	private ArrayList<String> books;
	private ArrayList<String> borrowBook;

	public Customer() {
		this.customerId = 0;
		this.books = new ArrayList<String>();
	}

	public Customer(int id) {
		this.customerId = id;
		this.books = new ArrayList<String>();
	}

	public Customer(int id, ArrayList<String> books) {
		this.customerId = id;
		this.books = books;
	}

	public ArrayList<String> getBorrowBook() {
		return borrowBook;
	}

	public void setBorrowBook(ArrayList<String> borrowBook) {
		this.borrowBook = borrowBook;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public ArrayList<String> getBooks() {
		return books;
	}

	public void removeBooks(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			borrowBook.remove(borrowBook.indexOf(list.get(i)));
		}
	}
}
