package com.example.managerbookapi.service;

import com.example.managerbookapi.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
    void   save(Category category);
    void remove(Long id);
}
