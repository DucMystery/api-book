package com.example.managerbookapi.controller;

import com.example.managerbookapi.model.Book;
import com.example.managerbookapi.model.Category;
import com.example.managerbookapi.service.BookService;
import com.example.managerbookapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookAPI {

    @Autowired
    private BookService bookService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/books")
    public List<Book> getBookList(){
        return bookService.findAll();
    }

    @GetMapping("/books/{id}/search")
    public Book getBook(@PathVariable Long id){
        return bookService.findById(id);
    }


    @PostMapping("/books/create")
    public Book createBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping("/books/{id}/edit")
    public Book updateBook(@PathVariable Long id,@RequestBody Book book){
        Book currentBook = bookService.findById(id);
        currentBook.setName(book.getName());
        currentBook.setAuthor(book.getAuthor());
        currentBook.setCategory(book.getCategory());
        return bookService.save(currentBook);
    }

    @DeleteMapping("/books/{id}/delete")
    public Book deleteBook(@PathVariable Long id){
        return bookService.remove(id);
    }

    @GetMapping("/categories")
    public List<Category> getListCategory(){
        return categoryService.findAll();
    }
}
