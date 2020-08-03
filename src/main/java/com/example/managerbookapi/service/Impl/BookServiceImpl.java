package com.example.managerbookapi.service.Impl;

import com.example.managerbookapi.model.Book;
import com.example.managerbookapi.repository.BookRepository;
import com.example.managerbookapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book save(Book book) {
        return  bookRepository.save(book);
    }

    @Override
    public Book remove(Long id) {
        Book book = bookRepository.findById(id).orElse(null);
        bookRepository.deleteById(id);
        return book;
    }
}
