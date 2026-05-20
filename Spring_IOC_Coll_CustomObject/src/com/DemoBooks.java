package com;

import java.util.List;

public class DemoBooks {

	
	private int BooksId;
	
	private List<Book> book;

	public int getBooksId() {
		return BooksId;
	}

	public void setBooksId(int booksId) {
		BooksId = booksId;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "DemoBooks [BooksId=" + BooksId + ", book=" + book + "]";
	}

}
