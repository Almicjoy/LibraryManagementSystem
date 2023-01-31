package com.demo.LibraryManagementSystem.service;

import java.util.List;
import java.util.Optional;

import com.demo.LibraryManagementSystem.model.Book;

public interface BookService {
	public Book saveBook(Book b);
	public List<Book> getAllBooks();
	public Optional<Book> getBookById(Integer bookId);
	public void deleteBookById(Integer bookId);
	public Book updateBookInfo(Book b);
}
