package com.example.managerbookapi.repository;

import com.example.managerbookapi.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
