package com.example.managerbookapi.service;

import com.example.managerbookapi.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    Book remove(Long id);
}
