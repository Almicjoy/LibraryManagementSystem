package com.demo.LibraryManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	@Id
	private Integer bookId;
	private String bookAuthor;
	private String bookTitle;
	private Float bookPrice;
	public Book(Integer bookId, String bookAuthor, String bookTitle, Float bookPrice) {
		super();
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
	public Book() {
		super();
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public Float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Float bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookAuthor=" + bookAuthor + ", bookTitle=" + bookTitle + ", bookPrice="
				+ bookPrice + "]";
	}
	

}
