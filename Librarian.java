package com.fdmgroup.library;

import java.util.ArrayList;

public class Librarian extends Library {
	public static void bookList(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			Library.borrowBook(list.get(i));
			// System.out.println("List " + i + "done");
		}
	}

	public static void returnList(ArrayList<String> list) {
		// System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			Library.returnBook(list.get(i));
			// System.out.println("List " + i + "done");
		}
	}
}
