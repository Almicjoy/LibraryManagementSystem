package com.demo.LibraryManagementSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.LibraryManagementSystem.model.Book;
import com.demo.LibraryManagementSystem.service.BookService;

@RestController
public class RestControllerApp {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("/create")
	public Book saveBook(@RequestBody Book b) {
		return bookService.saveBook(b);
	}
	
	@GetMapping("/findAll")
	public List<Book> findAllBooks() {
		return bookService.getAllBooks();
	}
	
	@GetMapping("/findBook/{bookId}")
	public Optional<Book> findBookById(@PathVariable Integer bookId) {
		return bookService.getBookById(bookId);
	}
	
	@DeleteMapping("/delete/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer bookId) {
		bookService.deleteBookById(bookId);
		ResponseEntity<String> res = new ResponseEntity<>("Deleted book with bookId: " + bookId, HttpStatus.OK);
		return res;
	}
	
}
