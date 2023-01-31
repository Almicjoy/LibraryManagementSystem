package com.demo.LibraryManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.LibraryManagementSystem.model.Book;
import com.demo.LibraryManagementSystem.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book saveBook(Book b) {
		// TODO Auto-generated method stub
		return bookRepository.save(b);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Optional<Book> getBookById(Integer bookId) {
		// TODO Auto-generated method stub
		return bookRepository.findById(bookId);
	}

	@Override
	public void deleteBookById(Integer bookId) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookId);
	}

	@Override
	public Book updateBookInfo(Book b) {
		// TODO Auto-generated method stub
		Optional<Book> book = bookRepository.findById(b.getBookId());
		Book bookMod = book.stream().findFirst().orElse(null);
		bookMod.setBookAuthor(b.getBookAuthor());
		bookMod.setBookTitle(b.getBookTitle());
		bookMod.setBookPrice(b.getBookPrice());
		return bookRepository.save(bookMod);
	}

}
