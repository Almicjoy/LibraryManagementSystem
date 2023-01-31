package com.demo.LibraryManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.LibraryManagementSystem.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
